package string;

public class Comparison {
    public static void main(String[] args){
        String a="ritersh";
        String b="nitesh";

        System.out.println(a.length());
        System.out.println(b.length());
        int g=(a.compareTo(b));
        if((g)>0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println(a.substring(0, 1).toUpperCase()+a.substring(1, a.length()) + " " +b.substring(0, 1).toUpperCase()+b.substring(1, b.length()) );
    }
    
}
