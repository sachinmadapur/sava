package String;

public class Rev_Each_Word{
    public static void main(String[] args) {
        String s="my name is mithun";
        String[]words=s.split(" ");
        String output=" ";
        for(String word : words){
            String rev="";
            for(int i=word.length()-1;i>=0;i--){
                rev += word.charAt(i);
            }
            output+=rev+" ";
        }
        System.out.println("Output: " + output.trim());
    
    
        }
        
    }