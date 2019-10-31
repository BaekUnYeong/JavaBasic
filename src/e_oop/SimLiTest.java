package e_oop;

import java.util.Scanner;

public class SimLiTest {
	
	//9개의 질문을 9개의 메서드로 만들어주세요.
	
	Scanner sc = new Scanner(System.in);
	
	 void question1(){
		System.out.println("나는 금사빠다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question2();
			}else if(answer.equals("no")){
				question4();
			}else{
				question1();
			}
	}
	 void question2(){
		System.out.println("연애할 때 끌려다니는 타입니다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question5();
			}else if(answer.equals("no")){
				question3();
			}else{
				question2();
			}
	}
	 void question3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question6();
			}else if(answer.equals("no")){
				question5();
			}else{
				question3();
			}
		
	}
	 void question4(){
		System.out.println("감정기복이 크지 않다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question7();
			}else if(answer.equals("no")){
				question5();
			}else{
				question4();
			}
		
	}
	 void question5(){
		System.out.println("감정 표현에 솔직한 편이다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question8();
			}else if(answer.equals("no")){
				question6();
			}else{
				question5();
			}
		
	}
	 void question6(){
		System.out.println("활동적인 데이트가 좋다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question8();
			}else if(answer.equals("no")){
				question9();
			}else{
				question6();
			}
		
	}
	 void question7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				type1();
			}else if(answer.equals("no")){
				question8();
			}else{
				question7();
			}
		
	}
	 void question8(){
		System.out.println("이성친구는 존재할 수 없다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				question9();
			}else if(answer.equals("no")){
				type2();
			}else{
				question8();
			}
		
	}
	 void question9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. ('yes or no')");
		String answer = sc.nextLine();
			if(answer.equals("yes")){
				type4();
			}else if(answer.equals("no")){
				type3();
			}else{
				question9();
			}
		
	}
	 void type1(){
		 System.out.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!!");
		 
	 }
	 void type2(){
		 System.out.println("구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!!");
		 
	 }
	 void type3(){
		 System.out.println("이것은 의리인가 사랑인가.... 친구같이 편안한 연애를 하는 타입!!");
		 
	 }
	 void type4(){
		 System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!!");
		 
	 }
	 
	 void start(){
		 question1();
	 }
}
