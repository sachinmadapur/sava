package Practice_String;

public class s1 {
	public static void main(String[] args) {
		String s="Its Simple";
		int countU = 0; int countL = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			//		System.out.println(ch);
			//		System.out.println(ch +" "+(int)ch);
			//		if(Character.isUpperCase(ch)) {
			//			System.out.println(ch);
			//		}
			//		if(Character.isLowerCase(ch)) {
			//			System.out.println(ch);
			//		}
			//		if(Character.isDigit(ch)) {
			//			System.out.println(ch);
			//		}

//			if(Character.isUpperCase(ch)) {
//				countU++;
//			}
//			if(Character.isLowerCase(ch)) {
//				countL++;
//			}
			
//			if(ch=='t' || ch=='T' ) {
//				System.out.println(ch);
//			}
			
//			char u = Character.toUpperCase(ch);
//			if(u =='I') {
//				System.out.println(ch);
//			}
			
			char u = Character.toUpperCase(ch);
			if(u =='A' ||u =='E' ||u =='I' ||u =='O' ||u =='U') {
				System.out.println(ch);
			}
			

		}	
//		System.out.println(countU+ " UPPER");
//		System.out.println(countL+ " Lower");


	}
}
