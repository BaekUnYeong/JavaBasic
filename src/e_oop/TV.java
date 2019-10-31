package e_oop;

public class TV {

	public static void main(String[] args) {
		TV tv = new TV("삼성");

		tv.power();
		tv.channelUp();
		tv.changeChannel(99);
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.power();
		tv.volumeUp();
		tv.power();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();

				
	}

	//TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	
	boolean power;			//전원
	int channel;			//채널
	int volume;				//음량
	String brand;			//브랜드
//	String channelInput;	//채널입력

	TV(String brand){
		power = false;
		channel = 1;
		volume = 10;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(1 < channel && channel < 100){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power && 30 > volume){
			volume++;
		}
		showVolume(volume);
	}
	
	void volumeDown(){
		if(power && 1 < volume){
			volume--;
		}
		showVolume(volume);
	}
	
	void showVolume(int volume){
		System.out.println("음량. ");
		for(int i = 1 + 1; i <= 30; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
}


//과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
//발표 : 프로그램 주제, 기능, 메서드 구성, 시연