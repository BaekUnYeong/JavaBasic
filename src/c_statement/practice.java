package c_statement;

public class practice {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++){
			if(i%2 == 0){
				System.out.println(i + "는 짝수입니다.");
			}else if(i%2 == 1){
				System.out.println(i + "는 홀수입니다.");
			}
		}

	}
}
