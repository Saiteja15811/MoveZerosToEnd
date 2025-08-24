import java.util.*;
public class elementcheckinarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("element you wanna find");
        int ele= sc.nextInt();
        System.out.println("element you wanna find");
        int ele2=sc.nextInt();
        boolean result=false;
        for(int num:arr){
            if(ele==num || ele2==num){
                result=true;
                System.out.println("element is found");
                break;
            }
        }
        if(result==false){
            System.out.println("element is not found");
        }
    }
}
