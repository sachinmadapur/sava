package pratice;

public class primeNo {
	public static void main(String[] args) {
		int num =3;
		boolean flag = true;
		if(num<2) {
			flag = false;
		}
		else
		{
			for(int i=2; i<=num-1; i++) {
				if(num%i==0)
				{
					flag = false;
					break;
				}
			}
		}
		if(flag==true) {
			System.out.println("Prime Number "+num);
		}
		else {
			System.out.println("Not A PrimeNumber "+ num);
		}
	}
}
