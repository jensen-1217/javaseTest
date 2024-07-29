package genericity.demo3;

import java.util.Scanner;

public class ChangeableParameter {
    public static void main(String[] args) {
        ChangeableParameter c = new ChangeableParameter();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces (e.g., 2 3 5): ");
        String inputLine = sc.nextLine();

        String[] numberStrings = inputLine.split("\\s+");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        int sum = c.getSum(numbers);

        System.out.println("Sum of the entered numbers: " + sum);
    }
    public  int getSum(int... args){
       int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
