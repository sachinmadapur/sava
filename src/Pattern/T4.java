package Pattern;

public class T4 {
	public static void main(String[] args) {
		int rows =3;
		for(int i =1; i<=rows; i++) {
			for(int j =1; j<=rows; j++) {
				if(i+j>=rows+1) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
