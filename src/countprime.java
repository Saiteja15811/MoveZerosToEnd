public class countprime {
    public static int prime(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (isPrime(i)) count++;

        }
        return count;
    }
    private static boolean isPrime(int i){
        if(i<=1) return false;
        for(int j=2;j*j<=i;j++){
            if(i%j==0)return true;
        }
return true;
    }
    public static void main(String[] args){
        int[] arr1={1,3,4,5,7};
        int[] arr2={1,2,3,4,5,6,7};

        System.out.println(prime(arr1));
        System.out.println(prime(arr2));
    }
}
