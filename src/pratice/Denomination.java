package pratice;

public class Denomination {
	public static void main(String[] args) {
		int num =2888;
		int[] notes = {2000,500,200,100,50,20,10,5,2,1};
		for(int i=0; i<notes.length; i++) {
			int deno = num/notes[i];
			System.out.println(notes[i]+"_"+deno);
			num=num%notes[i];
		}
	}
}
