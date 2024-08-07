package MultiThreading;
/*
  W.A.J. P to create one thread by implementing Runnable interface in 
  Class.
 */
class MyRunnable implements Runnable
		{
		    public void run()
		    {
		        // Code that will run in a new thread
		        System.out.println("Thread running using Runnable interface.");
		    }
		}
		public class Q1_Mul 
		{
			public static void main(String[] args) 
			{	
		
		        MyRunnable myRunnable = new MyRunnable();
		        Thread myThread = new Thread(myRunnable);
		        myThread.start();
}		
}


