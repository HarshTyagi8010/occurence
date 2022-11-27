public class stairs {
    static int count =0; 

     
    
    public static void printSteps(int n ,int sum) {
         

        if(sum==n){
            count+=1;   
            return;
        }  
        if(sum>n)
            
        return;
        printSteps(n,sum+1);
        printSteps(n,sum+2);
        
        
    }
    public static void main(String[] args) {
        printSteps(4, 2);
        System.out.println(count);
    }
    
}
