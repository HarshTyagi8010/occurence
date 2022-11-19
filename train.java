
public class train {
    public static void main(String[] args) {
        String s="aMit sRIVAStaVA";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]==' '){
                continue;
            }
            else if(Character.isLowerCase(c[i]))
            {
                c[i]=Character.toUpperCase(c[i]);
            
            }
            else if(Character.isUpperCase(c[i]))
            {
                c[i]=Character.toLowerCase(c[i]);

            }
        }
        String s1=String.valueOf(c);
        System.out.println(s);
        System.out.println(s1);
    }
    
}
