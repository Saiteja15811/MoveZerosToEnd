import java.util.Arrays;
public class merge2arrays{
    public static void mergedarray(int[] arr1,int[] arr2,int[] arr3){
        int i=0,j=0,k=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while(i<n1){
            arr3[k++]=arr1[i++];
        }while(j<n2){
            arr3[k++]=arr2[j++];
        }
        Arrays.sort(arr3);
    }public static void main(String[] args){
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int[] arr3 = new int[arr1.length+ arr2.length];
        mergedarray(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
