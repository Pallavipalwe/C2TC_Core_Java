
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1,5,5,5,5,5,1};
		double max = myList[0];
		int indexOfMax = 0;
		for (int i = 0; i<myList.length;i++)
		{
			if (myList[i]>max) {
				max = myList[i];
				indexOfMax = i;
			}
		}
		System.out.println(indexOfMax);
	}

}
