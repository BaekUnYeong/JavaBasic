package z_exam;

public class Exam07 {
	public static void main(String[] args) {

		/*
		[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		
		오버라이딩이란 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것.
		조상 클래스로부터 상속받은 메서드를 자손 클래스에서 그대로 사용할 수 없는 경우가
		많기 때문에 오버라이딩이 필요하다.
		*/
		
		/*
		[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오) c,d
			a. 조상의 메서드와 이름이 같아야 한다.
			b. 매개변수의 수와 타입이 모두 같아야 한다.
			c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
			d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
		*/
		
		/*
		[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
		위해서는 코드를 어떻게 바꾸어야 하는가?
		[연습문제]/ch7/Exercise7_5.java
		class Product {
			int price; // 제품의 가격
			int bonusPoint; // 제품구매 시 제공하는 보너스점수
				
			product(){}	// 기본생성자를 추가해줘야함 
			
			Product(int price) {
				this.price = price;
				bonusPoint =(int)(price/10.0);
				}
			}
			class Tv extends Product {
				Tv() {}
				public String toString() {
					return "Tv";
				}
			}
			class Exercise7_5 {
				public static void main(String[] args) {
					Tv t = new Tv();
				}
			}
		 	*/
		
		/*
		[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
		가?
		
		조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
		*/
		
		/*
		[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		[연습문제]/ch7/Exercise7_7.java
		class Parent {
		int x=100;
		Parent() {
		this(200); // Parent(int x)를 호출
		}
		Parent(int x) {
		this.x = x;
		}
		int getX() {
		return x;
		}
		}
		class Child extends Parent {
		int x = 3000;
		Child() {
		this(1000); // Child(int x)를 호출
		}
		Child(int x) {
		//super() 가 숨겨져있음
		this.x = x;
		}
		}
		class Exercise7_7 {
		public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
		}
		}
		
		Child() → Child(int x) → Parent() → Parent(int x) → Object()의
		순서로 호출된다
		실행결과 : x = 200
		*/
		
		/*
		[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?	a
		a. public-protected-(default)-private
		b. public-(default)-protected-private
		c. (default)-public-protected-private
		d. private-protected-(default)-public
		*/
		
		/*
		[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		옳지 않은 것은? (모두 고르시오)		c
		a. 지역변수 - 값을 변경할 수 없다.
		b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
		c. 메서드 - 오버로딩을 할 수 없다. ← 오버라이딩(overriding)을 할 수 없다.
		d. 멤버변수 - 값을 변경할 수 없다.
		*/
		
		/*
		[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		getter와 setter메서드를 추가하라.
		[해설] 별로 어렵지 않은 문제라 별도의 설명이 필요없을 것이다. 다만 매개변수가 있는
		메서드는 반드시 작업 전에 넘겨받은 값의 유효성검사를 해야 한다는 것을 잊지 말자.
		[연습문제]/ch7/Exercise7_10.java
		class MyTv2 {
			private boolean isPowerOn;
			private int channel;
			private int volume;
			
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1;
			
			public boolean isPowerOn() {
				return isPowerOn;
			}
			public void setPowerOn(boolean isPowerOn) {
				this.isPowerOn = isPowerOn;
			}
			public int getChannel() {
				return channel;
			}
			public void setChannel(int channel) {
				this.channel = channel;
			}
			public int getVolume() {
				return volume;
			}
			public void setVolume(int volume) {
				this.volume = volume;
			}
		
		
		}
		class Exercise7_10 {
			public static void main(String args[]) {
				MyTv2 t = new MyTv2();
				t.setChannel(10);
					System.out.println("CH:"+t.getChannel());
					t.setVolume(20);
						System.out.println("VOL:"+t.getVolume());
			}
		}
		*/
		
		/*
		[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
		기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
		[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
		메서드명 : gotoPrevChannel
		기 능 : 현재 채널을 이전 채널로 변경한다.
		반환타입 : 없음
		매개변수 : 없음
		[연습문제]/ch7/Exercise7_11.java
		class MyTv2 {
		private boolean isPowerOn;
		private int channel;
		private int volume;
		private int prevChannel; // 이전 채널(previous channel)
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		public void setVolume(int volume){
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
		return;
		this.volume = volume;
		}
		public int getVolume(){
		return volume;
		}
		public void setChannel(int channel){
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
		return;
		prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다.
		this.channel = channel;
		}
		public int getChannel(){
		return channel;
		}
		public void gotoPrevChannel() {
		setChannel(prevChannel); // 현재 체널을 이전 채널로 변경한다.
		}
		}
		class Exercise7_11 {
		public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		}
		}
		*/
		
		/*
		[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)		c
			a. public은 접근제한이 전혀 없는 접근 제어자이다.
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
			c. 지역변수에도 접근 제어자를 사용할 수 있다.
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
		*/
		
		/*
		[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
		
		Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기
		때문에 객체를 생성할 필요가 없기 때문
		*/
		
		/*
		7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)		e
		class Unit {}
		class AirUnit extends Unit {}
		class GroundUnit extends Unit {}
		class Tank extends GroundUnit {}
		class AirCraft extends AirUnit {}
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
			a. u = (Unit)ac;
			b. u = ac;
			c. GroundUnit gu = (GroundUnit)u;
			d. AirUnit au = ac;
			e. t = (Tank)u; ← 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
			f. GroundUnit gu = t;
		*/
		
		
		/*
		[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)		e
		class Car {}
		class FireEngine extends Car implements Movable {}
		class Ambulance extends Car {}
		FireEngine fe = new FireEngine();
			a. fe instanceof FireEngine
			b. fe instanceof Movable
			c. fe instanceof Object
			d. fe instanceof Car
			e. fe instanceof Ambulance
		*/
		
		/*
		[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
		클래스를 상속받도록 코드를 변경하시오.
		class Unit {
			int x, y;
			void move(int x, int y)
			void stop()
		}
		
		class Marine extends Unit { // 보병

			void stimPack() {  스팀팩을 사용한다.}
		}
		
		class Tank extends Unit { // 탱크

			void changeMode() {  공격모드를 변환한다. }
		}
		
		class Dropship extends Unit { // 수송선

			void load() {  선택된 대상을 태운다. }
			void unload() {  선택된 대상을 내린다. }
		}
		*/
		
		/*
		[7-20] 다음의 코드를 실행한 결과를 적으시오.
		[연습문제]/ch7/Exercise7_20.java
		class Exercise7_20 {
		public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		}
		}
		class Parent {
		int x = 100;
		void method() {
		System.out.println("Parent Method");
		}
		}
		class Child extends Parent {
		int x = 200;
		void method() {
		System.out.println("Child Method");
		}
		}
		*/
		
		/*
		[7-24] 다음 중 인터페이스의 장점이 아닌 것은?		e
			a. 표준화를 가능하게 해준다.
			b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
			c. 독립적인 프로그래밍이 가능하다.
			d. 다중상속을 가능하게 해준다.
			e. 패키지간의 연결을 도와준다.
		*/
		
		
		
		
		
		
		
		
		
	}
}