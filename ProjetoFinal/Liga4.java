package ProjetoFinal;

import java.util.Scanner;

public class Liga4 {

    private char[][] tabuleiro;
    private Scanner teclado;
    private char jogador;
    private char computador;

    public Liga4() {
        tabuleiro = new char[6][7];
        teclado = new Scanner(System.in);
        jogador = selecionarCor();
        computador = (jogador == 'V') ? 'A' : 'V';
        inicializarTabuleiro();
        jogar();
    }

    private char selecionarCor() {
        System.out.println("Escolha sua cor: V (Vermelho) ou A (Azul)");
        char cor;
        do {
            cor = teclado.nextLine().toUpperCase().charAt(0);
        } while (cor != 'V' && cor != 'A');
        return cor;
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = 'B';
            }
        }
    }

    private void imprimirTabuleiro() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean validarJogada(int coluna) {
        return coluna >= 0 && coluna < 7 && tabuleiro[0][coluna] == 'B';
    }

    private void realizarJogada(char jogador, int coluna) {
        for (int i = 5; i >= 0; i--) {
            if (tabuleiro[i][coluna] == 'B') {
                tabuleiro[i][coluna] = jogador;
                break;
            }
        }
    }

    private boolean verificarVitoria(char jogador) {
        // Verificar vitória na horizontal
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tabuleiro[i][j] == jogador && tabuleiro[i][j + 1] == jogador &&
                    tabuleiro[i][j + 2] == jogador && tabuleiro[i][j + 3] == jogador) {
                    return true;
                }
            }
        }

        // Verificar vitória na vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (tabuleiro[i][j] == jogador && tabuleiro[i + 1][j] == jogador &&
                    tabuleiro[i + 2][j] == jogador && tabuleiro[i + 3][j] == jogador) {
                    return true;
                }
            }
        }

        // Verificar vitória na diagonal (para a direita)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (tabuleiro[i][j] == jogador && tabuleiro[i + 1][j + 1] == jogador &&
                    tabuleiro[i + 2][j + 2] == jogador && tabuleiro[i + 3][j + 3] == jogador) {
                    return true;
                }
            }
        }

        // Verificar vitória na diagonal (para a esquerda)
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (tabuleiro[i][j] == jogador && tabuleiro[i + 1][j - 1] == jogador &&
                    tabuleiro[i + 2][j - 2] == jogador && tabuleiro[i + 3][j - 3] == jogador) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (tabuleiro[i][j] == 'B') {
                    return false;
                }
            }
        }
        return true;
    }

    private void jogar() {
        boolean fimDeJogo = false;

        while (!fimDeJogo) {
            System.out.println("\n=== Sua vez ===");
            imprimirTabuleiro();

            int coluna;
            do {
                System.out.println("Digite a coluna para jogar (0-6):");
                coluna = teclado.nextInt();
            } while (!validarJogada(coluna));

            realizarJogada(jogador, coluna);

            if (verificarVitoria(jogador)) {
                fimDeJogo = true;
                System.out.println("\nParabéns! Você venceu!");
                imprimirTabuleiro();
                break;
            }

            if (verificarEmpate()) {
                fimDeJogo = true;
                System.out.println("\nEMPATE!");
                imprimirTabuleiro();
                break;
            }

            System.out.println("\n=== Vez do Computador ===");
            coluna = (int) (Math.random() * 7);

            while (!validarJogada(coluna)) {
                coluna = (int) (Math.random() * 7);
            }

            realizarJogada(computador, coluna);

            if (verificarVitoria(computador)) {
                fimDeJogo = true;
                System.out.println("\nO computador venceu!");
                imprimirTabuleiro();
                break;
            }
        }

        System.out.println("\nDeseja jogar novamente? (S/N)");
        char opcao;
        do {
            opcao = teclado.next().toUpperCase().charAt(0);
        } while (opcao != 'S' && opcao != 'N');

        if (opcao == 'S') {
            reiniciarJogo();
        } else {
            System.out.println("Fim do jogo. Até mais!");
        }
    }

    private void reiniciarJogo() {
        inicializarTabuleiro();
        jogador = selecionarCor();
        computador = (jogador == 'V') ? 'A' : 'V';
        jogar();
    }

    public static void main(String[] args) {
        new Liga4();
    }
}
