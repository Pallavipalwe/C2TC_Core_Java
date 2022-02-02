package Demo;
import java.lang.*;
interface A
{
	void Adisplay();
	
}
interface B
{
   void Bdisplay();
}
{
	public void Adisplay()
	{
		System.out.println("I am A");
	}
	public void Bdisplay()
	{
		System.out.println("I am B");
	}
}

public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MIE obj=new MIE();
		obj.Adisplay();
		obj.Bdisplay();
			

	}

}
