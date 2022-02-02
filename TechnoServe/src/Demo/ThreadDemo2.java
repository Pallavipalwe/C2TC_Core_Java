package Demo;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			
		}
	}
}
public class ThreadDemo2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		m.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
