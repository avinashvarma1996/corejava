import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Cards {
	public static void main(String[] args)
	{
		String[] cardsType = {"c", "d", "h", "s"};
		String[] cardsValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
		List<String> Cards = new ArrayList<String>();
		for(int i=0;i<=(cardsType.length)-1;i++) 
		{
			for(int j=0;j<=(cardsValue.length)-1;j++)
			{
				Cards.add(cardsValue[j] + cardsType[i]);
			}
		}
		Collections.shuffle(Cards);
		List<String> a1 = new ArrayList<>();
		List<String> a2 = new ArrayList<>();
		List<String> a3 = new ArrayList<>();
		List<String> a4 = new ArrayList<>();
		for(int i=0; i<13; i++) 
		{
			int rand = (int)(Math.random() * Cards.size());
			a1.add(Cards.get(rand));
			Cards.remove(rand);
			
			rand = (int)(Math.random() * Cards.size());
			a2.add(Cards.get(rand));
			Cards.remove(rand);
			
			rand = (int)(Math.random() * Cards.size());
			a3.add(Cards.get(rand));
			Cards.remove(rand);
			
			rand = (int)(Math.random() * Cards.size());
			a4.add(Cards.get(rand));
			Cards.remove(rand);



		}
		for(int i=0;i<13;i++) 
		{
			System.out.println(a1.get(i)+ " ");
		}
		System.out.println();
		for(int i=0;i<13;i++) 
		{
			System.out.println(a2.get(i)+ " ");
		}
		System.out.println();
		for(int i=0;i<13;i++) 
		{
			System.out.println(a3.get(i)+ " ");
		}
		System.out.println();
		for(int i=0;i<13;i++) 
		{
			System.out.println(a4.get(i)+ " ");
		}
		System.out.println();



	}

}
