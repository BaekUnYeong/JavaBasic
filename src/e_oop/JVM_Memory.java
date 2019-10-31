package e_oop;

public class JVM_Memory {
	
	/*
	 * << JVM 메모리 구조 >>
	 * - Method Area : 클래스가 저장된다.	//클래스 멤버에 저장
	 * - Call Stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.	//인스턴스 멤버에 저장
	 * 
	 * 운영체제 -> 프로그램
	 * 운영제체 -> JVM -> 프로그램
	 */
	
	/*
	 * << Method Area >>
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember : classVariable, classMethod()
	 * 
	 * << Call Stack >>
	 * - main() : cm1
	 * - random() : 메서드가 끝나면 삭제됨
	 * - println() : 실행이 끝난 후에 삭제됨
	 * - println() : 실행이 끝난 후에 삭제됨
	 * - println() : 실행이 끝난 후에 삭제됨
	 * 
	 * << Heap >>
	 * - cm1 = new ClassMember() : instanceVariable, instanceMethod()
	 * - cm2 = new ClassMember() : instanceVariable, instanceMethod()
	 * 
	 */

}