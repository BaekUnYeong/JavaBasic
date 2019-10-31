package c_statement;

import java.util.Scanner;

public class baseballGame {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num1, num2, num3;
	int S = 0;
	int B = 0;
	int O = 0;
	
			do{
				num1 = (int)(Math.random() * 9) + 1;
				num2 = (int)(Math.random() * 9) + 1;
				num3 = (int)(Math.random() * 9) + 1;
			}while(num1 == num2 || num1 == num3 || num2 == num3);
			
			int count = 0;
			
			do{
				S = B = O = 0;
				
				System.out.println("숫자를 3번 입력해주세요.(1 ~ 9 까지) :");
				int input = Integer.parseInt(s.nextLine());
				int i1 = input % 10;
				input /= 10;
				int i2 = input % 10;
				input /= 10;
				int i3 = input % 10;
				input /= 10;
				
				if(i1 == num1) S++;
				else if(i1 == num2 || i1 == num3) B++;
				else O++;
				
				if(i2 == num2) S++;
				else if(i2 == num1 || i2 == num3) B++;
				else O++;
				
				if(i3 == num3) S++;
				else if(i3 == num1 || i3 == num2) B++;
				else O++;
				
				System.out.println("[" + S + "S " + B + "B " + O + "O" +"]");
			}while(S < 3);
			
			System.out.println("정답입니다!!");
		}
	}