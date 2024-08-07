package MultiThreading;
/*
 • W.A.J. P to create one thread by extending Thread class in another Class. 

 */
class MyThread extends Thread 
{
		    public void run()
		    {
		        System.out.println("Thread is running...");
		    }
		}

		// Another class where you want to create and start the thread
		class Q2_Mul 
		{
		    public static void main(String[] args) 
		    {
		        // Create an instance of MyThread
		        MyThread thread = new MyThread();
		        
		        // Start the thread
		        thread.start();
		    }
		

		
	}


