package pratice;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact =1;
		int power =3;
		for(int i=1; i<=power; i++) {
			fact = fact*num;
		}
		System.out.println(fact);
	}
}
