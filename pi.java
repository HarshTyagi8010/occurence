public class pi {
    public static int changePi(String str,int idx ){
        if(idx == str.length()){
            return " ";
        }
        if( str.charAt(idx)=='p' && str.charAt(idx+1)=='i'  ){
            return "3.14" + changePi(str, idx+2);
        }else{
            return str.charAt(idx) +changePi(str, idx+1);
        }
        
    }
    public static void main(String[] args) {
        String str ="3+pi*1-5*pi+6";
        changePi(str, 0);
        
    }
    
}
