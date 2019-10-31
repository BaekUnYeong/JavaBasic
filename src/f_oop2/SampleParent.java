package f_oop2;
//							Object 클래스는 상속받지 않는 클래스에 자동으로 상속된다. (Object 클래스는 모든 클래스의 부모,조상 클래스임)
public class SampleParent extends Object{
	
	String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a + b;
	}
	
}
