package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {

		Movie mv = new Movie();
		
		mv.movieList();

		mv.movieSelect();
		
	}
	Scanner sc = new Scanner(System.in);
	
	String[] movieList;
	String[] movieSelect;
	String[] movieTime;
	String[] member;
	String[] seat;
	int pay;
	
	
	Movie(){
		movieList = new String[]{"영화 조커", "장사리:잊혀진 영웅들", "영화 양자물리학", "힘을내요 미스터리", "가장 보통의 연애", "타짜3:원아이드잭", "나쁜 녀석들 : 더 무비", "영화 퍼팩트맨"};
		movieSelect = new String[]{"영화 조커", "장사리:잊혀진 영웅들", "영화 양자물리학", "힘을내요 미스터리", "가장 보통의 연애", "타짜3:원아이드잭", "나쁜 녀석들 : 더 무비", "영화 퍼팩트맨"};
		movieTime = new String[]{"07:00", "10:00", "13:00", "16:00", "19:00", "22:00"};
		member = new String[] {"1", "2", "3", "4"};
		seat = new String[] {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "C1", "C2", "C3", "C4"};
		pay = 0;
	}
	//현재 상영중인 영화를 보여준다.
	void movieList(){
		System.out.println("현재 상영중인 영화입니다. 원하시는 영화를 선택해주세요."  + "\n");
		System.out.println(Arrays.toString(movieList));
	}
	//입력한 영화가 무엇인지 출력하고 잘못 입력했을 경우 다시 입력 요청한다.
	void movieSelect(){
		int i = 0;
		
		while(true){
			String input = sc.nextLine();
			
			for(i = 0; i < movieList.length; i++){
				if(input.equals(movieList[i])){
					System.out.println("선택하신 영화는 " + input + " 입니다." + "\n" + "시간을 선택해주세요.");
					System.out.println(Arrays.toString(movieTime));
					movieTime();
				}
			}
			System.out.println("다시 입력해주세요.");
		}
	}
	
	void movieTime(){
		int i = 0;
		
		while(true){
			String input1 = sc.nextLine();
			
			for(i = 0; i < movieTime.length; i++){
				if(input1.equals(movieTime[i])){
					System.out.println("선택하신 시간은 " + input1 + " 입니다." + "\n" + "인원을 입력해주세요.");
					System.out.println(Arrays.toString(member));
					member();					
				}
			}
			System.out.println("다시 입력해주세요.");
		}
	}
	
	void member(){
		int i = 0;
		
		while(true){
			String input2 = sc.nextLine();
			
			for(i = 0; i < member.length; i++){
				if(input2.equals(member[i])){
					System.out.println("선택하신 인원은 " + input2 + " 명 입니다." + "\n" + "좌석을 입력해주세요.");
					System.out.println(Arrays.toString(seat));
					seat();
				}
			}
			System.out.println("다시 입력해주세요.");
		}
	}
	
	void seat(){
		int i = 0;
		
		while(true){
			String input3 = sc.nextLine();
			
			for(i = 0; i < seat.length; i++){
				if(input3.equals(seat[i])){
					System.out.println("선택하신 좌석은 " + input3 + " 입니다.");				
				}
			}
		}
	}
}