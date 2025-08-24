public class ArraySortOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7};
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("NOt sorted");
                return;
            }

        }
        System.out.println("Sorted");
    }
}
