package Demo;
class MyThread implements Runnable
{
	public void run()
	{
		
	    for(int i=0;i<10;i++)
	       {
		      System.out.println("Child Thread");
	       }
     }
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		System.out.println("************");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
