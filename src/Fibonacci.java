import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int N = Number.nextInt();
		int N1=1,N2=1,N3=0;
		System.out.print(N1);
		System.out.print(" "+N2);
		while(N3<=N)
		{
			N3 = N1+N2;
			if(N3>N)
			{
				break;
			}
			N1 = N2;
			N2 = N3;
			System.out.print(" "+N3);
		}


		
	}

}
