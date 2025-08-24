import java.util.*;
public class equalarrOrnot {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,14,5};
        boolean check=true;
        if(arr1.length== arr2.length){
            for(int i=0;i< arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    check=false;
                }
            }
        }
        if(check==true){
            System.out.println("arrays are eqaul");
        }else{
            System.out.println("arrays are not equal");
        }
    }
}
