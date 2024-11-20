import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("Please enter a positive integer: ");
        }else{
            long factorial = 1;

            for(int i = 0; i < n; i++){
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        }
        
        scanner.close();
        
    }
}