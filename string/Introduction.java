package string;

public class Introduction {
    public static void main(String[] args){

         String st="ritesh";
        
        // String c="goku,zoro,naruto,gojo,yuji ";
         String pt= new String("nitesh");
         System.out.println(st);
         System.out.println(pt);
         System.out.println(st.charAt(2));
         System.out.println(st.length());
         System.out.println(st.substring(2, st.length()));
         System.out.println(st.contains("rit"));
         System.out.println(st.equals(pt));
         System.out.println(st.isEmpty());
        System.out.println(st.concat(" kumar"));
         System.out.println(st.replace("i", "m"));
        //  String allCharacter[] = c.split(",");
        // for(String cs: allCharacter){
        //     System.out.println(cs);
        // }
        System.out.println(st.indexOf("i"));
        System.err.println(st.toUpperCase());

    }

    
}
