public class subSeq2 {
    public static void subSeq2(String str,int idx,String newString) {
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSeq2(str, idx+1, newString+currChar);
        //or not to be
        subSeq2(str,idx+1,newString);

        
    }
    public static void main(String[] args) {
        String str="abc";
        subSeq2(str,0,"");
         
    }
    
}
