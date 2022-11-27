import java .util.HashSet;
public class keypad {
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        
    
    public static void keysSequence(String str,int idx,String combination) {
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar =str.charAt(idx);
        String mapping =keypad[currChar -'0'];
        for(int i=0;i<mapping.length();i++){
            keysSequence(str, idx+1, combination+mapping.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String str ="23";
        keysSequence(str, 0, "");
    }
    
}
