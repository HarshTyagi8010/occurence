public class permutation {
    public static void permutation(String str,String per) {
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            permutation(s, per+c);
        }
        
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"");
        
    }
    
}
