import javax.lang.model.util.AbstractElementVisitor14;
import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

public class recpow {
    public static int calcPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = calcPow(x,n-1);
        int xPown = x * xPownm1;
        return xPown;    
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPow(x, n);
        System.out.println(ans);
        
    }
    
}
