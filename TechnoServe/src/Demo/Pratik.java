package Demo;

public class Pratik {

	public static void main(String[] args) {
		int x=0;
		do
		//for (int i=0;i<10;i++)
		{
			x++;
			System.out.println(x);
			if(++x<5)     //(i%2==0)
				continue;
			x++;
			System.out.println(x);
		}while(++x<10);
		
		// TODO Auto-generated method stub

	}

}
