public class thirdlargestnum {
    public static int third(int[] arr){
        int a=0;
        int b =0;
        int c=0;
        for(int num: arr){
            if(num>a){
                c=b;
                b=a;
                a=num;
            } else if (num>b && num!=a) {
                c=b;
                b=num;
            } else if (num>c && num!=b &&num!=a) {
                c=num;
                
            }
        }
        return c;
    }public static void main(String[] args){
        int[] arr1 = {1,16,20,24,14};
        int[] arr2 = { 1,2,3,4,5,6,7};
        System.out.println(third(arr1));
        System.out.println(third(arr2));
    }
}
