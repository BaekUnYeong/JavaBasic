package practice;

public class array {

	public static void main(String[] args) {
		
		//1 ~ 10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		//1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		
		int array[] = new int[500];
		
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 10) + 1;
			System.out.println(array[i]);
		}
		
		int counter[] = new int[11];
		
		for(int i = 0; i < array.length; i++){
			counter[array[i]]++;
		}
		for(int i = 0; i < counter.length; i++){
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
