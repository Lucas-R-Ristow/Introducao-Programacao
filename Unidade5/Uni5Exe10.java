package Unidade5;

//O número 3025 possui a seguinte característica:
//30+25=55 -> 55^2=3025
//Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
//20+25=45 -> 45^2=2025

public class Uni5Exe10
{
	static boolean iskaprekar(int n)
	{
		if (n == 1)
		return true;
	
		int sq_n = n * n;
		int count_digits = 0;
		while (sq_n != 0)
		{
			count_digits++;
			sq_n /= 10;
		}
	
		sq_n = n*n; 
	
		for (int r_digits=1; r_digits<count_digits; r_digits++)
		{
			int eq_parts = (int) Math.pow(10, r_digits);
	
			if (eq_parts == n)
				continue;
	
			int sum = sq_n/eq_parts + sq_n % eq_parts;
			if (sum == n)
			return true;
		}
	
		return false;
	}
	
	public static void main (String[] args)
	{
		
		for (int i=1; i<2500; i++)
			if (iskaprekar(i))
				System.out.println(i);
	}
}
