import java.util.*;
public class SECONDLARGEST {
    class Ans{
        public void sor(int[] arr){
            int a=0;
            int b=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>a){
                    b=a;
                    a=arr[i];
                }
               else if (arr[i]>b && arr[i]!=a){
                    b=arr[i];
                }
            }
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        int [] arr={1,2,4,7,7,5};
        SECONDLARGEST ans = new SECONDLARGEST();
        SECONDLARGEST.Ans obj = ans.new Ans();
        obj.sor(arr);
    }

}
