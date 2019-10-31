package practice;

public class practice1 {
	public static void main(String[] args) {
		int[] bingo = new int[25];;
		
		for(int i = 0; i < bingo.length; i++){
			bingo[i] = (int)(Math.random() * 25) + 1;
			for(int j = 0; j < i; j++){
				if(bingo[i] == bingo[j]){
					i--;
					break;
				}
			}
			System.out.print(bingo[i] + " ");
		}
	}
}