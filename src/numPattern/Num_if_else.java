package numPattern;

public class Num_if_else {
public static void main(String[] args) {
	int n=5;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++)
		 if(i%2==0)
		{
			System.out.print("a ");
		}
		 else
		 {
				System.out.print("b ");
		 }
		System.out.println();
	}
}
}
