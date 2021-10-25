import java.util.Scanner;

public class Factorial {
	static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
 
    // Driver method
    public static void main(String[] args)
    {
    	Scanner Number = new Scanner(System.in);
		System.out.println("Enter the Number:");
    	int num = Number.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));

    }

}
