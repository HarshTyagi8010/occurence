import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.w3c.dom.events.MouseEvent;

public class moveend {
    public static void moveALLx(String str,int idx,int count,String newString) {
        if(idx==str.length()){
            for(int i=0; i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return ;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveALLx(str, idx+1, count, newString);
        }else{
            newString +=currChar;//newString = newString = currChar
            moveALLx(str, idx+1, count, newString);
        }
        
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveALLx(str, 0, 0, " ");
        
    }
    
}
