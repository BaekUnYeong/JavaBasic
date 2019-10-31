package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("달려간다~~~~~~");
	}
	
	abstract void bark();

}

class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍!!");
	}

}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("냐옹~~");		
	}
	
}
class Horse extends Animal{

	@Override
	void bark() {
		System.out.println("히이이이잉~~~!!");		
	}
	
}