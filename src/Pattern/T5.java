package Pattern;

public class T5 {
	public static void main(String[] args) {
		int rows =5;
		for(int i =1; i<=rows; i++) {
			for(int j =1; j<=rows; j++) {
				if(i>=j) {
					System.out.print(j+" ");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
