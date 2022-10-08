//Source: https://www.javatpoint.com/life-cycle-of-a-thread
//ABC class implements the interface Runnable
class ABC implements Runnable{
	
	public void run(){
		//try-catch block
		try{
			//moving thread t2 to the state time waiting.
			Thread.sleep(100);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}

		System.out.println("The state of thread t1 when it invoked the method join() on thread t2 - " + ThreadState.t1.getState());

		//try-catch block
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}

	}
}

//ThreadState class implements the interface Runnable
public class ThreadState implements Runnable{
	public static Thread t1;
	public static ThreadState obj;

	//main method
	public static void main(String [] args){

		//Creating of an object class ThreasState
		obj = new ThreadState();
		t1 = new Thread(obj);

		//Thread t1 is spawned.
		//Thread t1 is currently in the NEW state.
		System.out.println("The state of thread t1 after spawning - " + t1.getState());

		//Invoking the start() method on the thread t1.
		t1.start();

		//Thread t1 is moved to the runnable state.
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());

	}

	public void run(){
		ABC myObj = new ABC();
		Thread t2 = new Thread(myObj);

		//Thread t2 is created and currently in a NEW state.
		System.out.println("The state of thread t2 after spawning is - " + t2.getState());
		t2.start();

		//Thread t2 is moved to the runnable state.
		System.out.println("The state of thread t2 after calling the method start() on it - " + t2.getState());

		//try-catch block for the smooth flow of the program.
		try{
			//Moving the thread t1 to the state time waiting.
			Thread.sleep(200);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}

		System.out.println("The state of thread t2 after involing the method sleep() on it - " + t2.getState());

		//try-catch block for the smooth flow of the program.
		try{
			//Waiting for thread t2 to complete the execution.
			t2.join();;
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}

		System.out.println("The state of thread t2 when it has completed the execution - " + t2.getState());
	}
}