package genericity.recursion;

public class Demo {
    public static void main(String[] args) {
        int sum = getSum(3);
        System.out.println(sum);
    }
    public static int getSum(int num){
        if(num==1){
            return 1;
        }
        int sum=num+getSum(num-1);
        return sum;
    }
}
