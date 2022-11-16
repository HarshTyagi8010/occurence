import java.util.HashMap;

public class khushi {
  
   public static HashMap<Character,Integer>findoccurence(String str,int len,int i){
    if(i==len){
        HashMap<Character, Integer> map = new HashMap<>();
        return map;
    }
    HashMap<Character, Integer> map = findoccurence(str,len,i+1);
    char singlechar=str.charAt(i);
    if(map.get(singlechar)== null){
        map.put(singlechar,1);
    }
    else{
        int count=map.get(singlechar);
        map.put(singlechar,count+1);

    }
}
    public static void main(String[]args)
    {
        String str="khushi nirwan";
//HashMap<Character, Integer> map = findoccurence(str,len,i+1);
        int n=str.length();
        System.out.println(map);
    }
}
//replace all pi values with 3.14  ip: 1+pi*4-pi*6