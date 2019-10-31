package practice;

import java.util.Scanner;

public class baseballGame1 {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		int i1, i2, i3;
		int S, B, O;
		
		Scanner s = new Scanner(System.in);
		
		do{
			num1 = (int)(Math.random() * 9) + 1;
			num2 = (int)(Math.random() * 9) + 1;
			num3 = (int)(Math.random() * 9) + 1;
		}while(num1 == num2 || num1 == num3 || num2 == num3);
		
		do{
			S = B = O = 0;
			
			System.out.println("3자리 숫자를 입력해주세요 > ");
			int input = Integer.parseInt(s.nextLine());
			i1 = input%10;
			input /= 10;
			i2 = input%10;
			input /= 10;
			i3 = input%10;
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
			
			System.out.println(S + "S " + B +"B " + O +"O");
				
		}while(S < 3);
		
		System.out.println("정답입니다!!");
	}

}
