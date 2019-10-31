package z_exam;

public class Exam06 {

	public static void main(String[] args) {
		
		/*
		[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
		타 입 		변수명 		설 명
		int 		num 		카드의 숫자 (1~10 사이의 정수)
		boolean 	isKwang 	광 이면 true 아니면 false 
		
		답 :
		SutdaCard(){
			int num;
			boolean iskwang;
		}
		*/
		
		/*
		[6-2] 문제 에서 정의한 클래스에 두 개의 생성자와 를 추가해서 실행 6-1 SutdaCard info()
		결과와 같은 결과를 얻도록 하시오.
		[ ] 연습문제 /ch6/Exercise6_2.java
		class Exercise6_2 {
		public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
		}
		class SutdaCard {
		

		int num;
		boolean iskwang;
		
		

		}
		*/
		
		/*
		[6-3] 다음과 같은 멤버변수를 갖는 클래스를 정의하시오 Student .
		타 입 		변수명 		설 명
		String		name 		학생이름
		int 		ban			반
		int 		no			번호
		int 		kor			국어점수
		int 		eng			영어점수
		int 		math		수학점수
		
		답 :
		class Strudent(){
			String name;
			int ban, no, kor, eng, math;
		}
		
		*/
		
		/*
		[6-4] 문제 에서 정의한 클래스에 다음과 같이 정의된 두 개의 메서드 6-3 Student
		getTotal() getAverage() . 과 를 추가하시오
		1. : getTotal 메서드명
		기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 : (kor), (eng), (math) .
		반환타입 : int
		매개변수 없음 :
		2. : getAverage 메서드명
		기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
		소수점 둘째자리에서 반올림할 것.
		반환타입 : float
		매개변수 없음 :
		[ ] 정답
		class Student {
		[ ] 연습문제 /ch6/Exercise6_4.java
		class Exercise6_4 {
		public static void main(String args[]) {
		Student s = new Student();
		s.name = " "; 홍길동
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println(" :"+s.name); 이름
		System.out.println(" :"+s.getTotal()); 총점
		System.out.println(" :"+s.getAverage()); 평균
		}
		}
		class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		int getTotal() {
		return kor + eng + math;
		}
		float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
		}
*/

		/*
		[6-5] 다음과 같은 실행결과를 얻도록 클래스에 생성자와 를 추가하시오 Student info() .
		[ ] 연습문제 /ch6/Exercise6_5.java
		class Exercise6_5 {
		public static void main(String args[]) {
		Student s = new Student(" ",1,1,100,60,76); 홍길동
		System.out.println(s.info());
		}
		}
		class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
		int getTotal() {
		return kor+eng+math;
		}
		float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}
		public String info() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		;
		}
		}
*/

		/*
		[6-6] 두 점의 거리를 계산하는 를 완성하시오 getDistance() .
		[Hint] 제곱근 계산은 를 사용하면 된다 Math.sqrt(double a) .
		[ ] 연습문제 /ch6/Exercise6_6.java
		class Exercise6_6 {
		// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
		static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
		}
		public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
		}
		}
*/

		/*
		[6-7] 문제 에서 작성한 클래스메서드 를 클래스의 인스턴스메서 6-6 getDistance() MyPoint
		드로 정의하시오.
		[ ] 연습문제 /ch6/Exercise6_7.java
		class MyPoint {
		int x; // 인스턴스 변수
		int y; // 인스턴스 변수
		MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		}
		double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 인스턴스 변수
		}
		}
		class Exercise6_7 {
		public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2,2));
		}
		}


		class PlayingCard {
		int kind;
		int num;
		static int width;
		static int height;
		PlayingCard(int k, int n) {
		kind = k;
		num = n;
		}
		public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
		}
		}
*/

		/*
		[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
		class PlayingCard {
		int kind;
		int num;
		static int width;
		static int height;
		PlayingCard(int k, int n) {
		kind = k;
		num = n;
		}
		public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
		}
		}
*/

		/*
		[6-9] 다음은 컴퓨터 게임의 병사 를 클래스로 정의한 것이다 이 클래스의 멤버 (marine) .
		중에 을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가 static ?
		( , .) 단 모든 병사의 공격력과 방어력은 같아야 한다
		class Marine {
		int x=0, y=0; // Marine (x,y) 의 위치좌표
		int hp = 60; // 현재 체력
		static int weapon = 6; // 공격력
		static int armor = 0; // 방어력
		static void weaponUp() {
		weapon++;
		}
		static void armorUp() {
		armor++;
		}
		void move(int x, int y) {
		this.x = x; // this.x , x 는 인스턴스 변수 는 지역변수
		this.y = y; // this.y , y 는 인스턴스 변수 는 지역변수
		}
		}
*/

		/*
		[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? ( b, e )
		a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다
		b. 생성자는 객체를 생성하기 위한 것이다
		c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다
		d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다
		e.. 생성자는 오버로딩 할 수 없다
*/

		/*
		[6-11] 다음 중 에 대한 설명으로 맞지 않은 것은 모두 고르시오 this ? ( b )
		a. 객체 자신을 가리키는 참조변수이다
		b. 클래스 내에서라면 어디서든 사용할 수 있다 → 인스턴스메서드에서만 사용가능
		c. 지역변수와 인스턴스변수를 구별할 때 사용한다
		d. 클래스 메서드 내에서는 사용할 수 없다
*/

		/*
		[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은 모두 고르시오 ? ( c, d )
		a. 메서드의 이름이 같아야 한다
		b. 매개변수의 개수나 타입이 달라야 한다
		c. 리턴타입이 달라야 한다
		d. 매개변수의 이름이 달라야 한다
*/

		/*
		[6-13] 다음 중 아래의 메서드를 올바르게 오버로딩 한 것은 모두 고르시오 add ? ( b, c, d )
		long add(int a, int b) { return a+b;}
		a. long add(int x, int y) { return x+y;}
		b. long add(long a, long b) { return a+b;}
		c. int add(byte a, byte b) { return a+b;}
		d. int add(long a, int b) { return (int)(a+b);}
*/

		/*
		[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? ( c, e )
		a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다
		b. 지역변수는 사용하기 전에 반드시 초기화해야 한다
		c. 초기화 블럭보다 생성자가 먼저 수행된다 → 초기화 블럭이 먼저 수행된다.
		d. 명시적 초기화를 제일 우선적으로 고려해야 한다
		e. 클래스변수보다 인스턴스변수가 먼저 초기화된다 → 클래스변수가 먼저 초기화됨
*/

		/*
		[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은? a
		a. 기본값 - 명시적초기화 - 초기화블럭 - 생성자
		b. 기본값 - 명시적초기화 - 생성자  초기화블럭
		c. 기본값 - 초기화블럭 - 명시적초기화 - 생성자
		d.  기본값 - 초기화블럭 - 생성자  명시적초기화
*/

		/*
		[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? ( a, e )
		a. .자동 초기화되므로 별도의 초기화가 필요없다
		b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다
		c. 매서드의 매개변수로 선언된 변수도 지역변수이다
		d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다
		e. (heap)힙 영역에 생성되며 가비지 컬렉터에 의해 소멸된다
*/

		/*
		[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은 모두 고르시오 ? ( b )
		println
		method1
		method2
		main

		a. main . 제일 먼저 호출스택에 저장된 것은 메서드이다
		b. println . 메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다
		c. method2 main . 메서드를 호출한 것은 메서드이다
		d. println method1 . 메서드가 종료되면 메서드가 수행을 재개한다
		e. main-method2-method1-println . 의 순서로 호출되었다
		f. println .
*/

		/*
		[6-18] 다음의 코드를 컴파일하면 에러가 발생한다 컴파일 에러가 발생하는 라인과 그 .
		이유를 설명하시오.
		class MemberCall {
		int iv = 10;
		static int cv = 20;
			int iv2 = cv;
			static int cv2 = iv;
		static void staticMethod1() {
			System.out.println(cv);
			System.out.println(iv);
			}
		void instanceMethod1() {
			System.out.println(cv);
			System.out.println(iv);
			}
		static void staticMethod2() {
			staticMethod1();
			instanceMethod1();
			}
		void instanceMethod2() {
			staticMethod1();
			instanceMethod1();
			}
		}
*/

		/*
		[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
		[ ] 연습문제 /ch6/Exercise6_19.java
		class Exercise6_19
		{
		public static void change(String str) {
			str += "456";
		}
		public static void main(String[] args)
		{
			String str = "ABC123";
			System.out.println(str);
			change(str);
			System.out.println("After change:"+str);
			}
		}

		실행결과
		ABC123
		After change:ABC123
*/


		
		
		

	}

}
