public class Main{
    public static int sum(int[] num){
        int a=0;
        for(int i=0;i<num.length;i++){
            a=a+num[i];
        }
        return a;
    }public static void main(String args[]){
        int[] num ={1,2,3} ;
        int total = sum(num);
        System.out.println(total);
    }
}
