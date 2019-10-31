package e_oop;

public class AirConditional {

	public static void main(String[] args) {
		AirConditional aircon = new AirConditional();
		
		aircon.tempratureUp();
		System.out.println(aircon.temprature);
		aircon.power();
		aircon.tempratureUp();
		System.out.println(aircon.temprature);
		aircon.tempratureDown();
		aircon.tempratureDown();
		System.out.println(aircon.temprature);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
	}
	
	//온도가 18 ~ 30 까지만 변경할 수 있게 해주시고, 전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	boolean power;	//전원
	int temprature;	//온도
	int airVolume;	//풍량
	
	AirConditional(){
		power = false;
		temprature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	void tempratureUp(){
		if(power){
			if(30 > temprature){
				temprature++;
			}
		}
	}

	//온도 - 버튼
	void tempratureDown(){
		if(power){
			if(18 < temprature){
				temprature--;
			}
		}
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume){
				airVolume = 1;
			}
		}
	}
}
