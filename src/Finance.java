import java.util.Scanner;
public class Finance {
	public static void main(String[] args) {
		Scanner Account = new Scanner(System.in);
		System.out.println("Enter your income this month:");
		/* String income = Account.nextLine();*/
		/*System.out.println("Here's how you should manage your money:");*/
		int amount = Account.nextInt();
		double amounts = amount;
		System.out.println("Here's how you should manage your money:" +amounts);
		double account1 = amounts*0.55;
		double account2 = amounts*0.1;
		double account3 = amounts*0.1;
		double account4 = amounts*0.1;
		double account5 = amounts*0.1;
		double account6 = amounts*0.05;
		
		System.out.println("NEC:" +account1+ "\t LTSS:" +account2);
		System.out.println("FFA:" +account3+ "\t PLAY:" +account4);
		System.out.println("EDU:" +account5+"\t GIVE:" +account6);

		
	}

}
