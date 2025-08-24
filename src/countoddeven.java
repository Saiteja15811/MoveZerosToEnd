public class countoddeven {
    public static void count(int[] arr){
        int oddcount=0;
        int evencount=0;
        for(int num:arr){
            if(num%2==0) evencount++;
            else oddcount++;

        }
        System.out.println(oddcount);
        System.out.println(evencount);
    }
    public static void main(String [] args){

        int[] arr1 = { 1,2 ,4, 3, 5 ,6,7,8,9};
        count(arr1);

    }
}
