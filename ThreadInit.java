//Ways of initializing a thread in Java

//First Way:
// Extending Thread in Class

// Class inheriting Thread class
class MyThread extends Thread 
{
  	// Overriding the run method
  	@Override
    public void run(){
        System.out.print("Welcome to GeeksforGeeks.");
    }
}

class Geeks
{
    public static void main(String[] args)
    {
      	// Creating thread
        MyThread t1 = new MyThread(); 
        
      	// Starting thread
      	t1.start(); 
    }
}



//Second Way:
// Implementing Runnable Interface in Class
// Implementing Runnable Interface

// Class inheriting Runnable interface
class RunnableClass implements Runnable 
{
      // Override run method
    @Override 
      public void run()
    {
        System.out.println("Inside run method");
    }
}

class Geeks
{
      public static void main(String args[])
    {
        // Create an object of Runnable target
        RunnableClass gfg = new RunnableClass();

        // Pass the runnable reference to Thread
        Thread t = new Thread( gfg , "gfg");

        // Start the thread
        t.start();

        // Get the name of the thread
        System.out.println(t.getName());
      
          System.out.println(t.currentThread().getName());
    }
}

//Third Way:
//Using Lambda Expression
// Using Lambda Method to Create Thread

class Geeks 
{
    public static void main (String[] args) 
    {
      	// Lambda Thread Created
        Thread thread1 = new Thread(() -> {
          	
          	// Operations Performed for thread1
            System.out.println("Lambda Thread running");
        });
      
      	// Running the Thread
        thread1.start(); 
    }
}
