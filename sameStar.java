public class sameStar {
    static String output ="";
    static void replaceSame(String str,int i) {

        output = output + str.charAt(i);
        if( i==str.length()-1  ){
            return ;    
    }
    if(str.charAt(i)==str.charAt(i+1)){
        output = output +"*";
    }
    replaceSame(str, i+1);
   
 
   }    
    
    public static void main(String[] args) {
        String str "abbaaba";
        replaceSame(str, 0);
        System.out.println(output);

        
    }
    
}
