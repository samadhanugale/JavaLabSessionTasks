package lab14;

public class ThreadMethod2 {

		String tname;
		Thread t;

		 public ThreadMethod2(String s) {
			tname = s;
			t = new Thread( s);
			System.out.println("New thread :" + t);
			t.start();
		}//cons

		public void run() {
			try {
				for (int i = 5; i > 0; i--) {
					System.out.println(tname + ": " + i);
					Thread.sleep(500);
				}//for
			} catch (InterruptedException e) {
			}//run
			System.out.println(tname + "exiting….");
		}//
	public static void main(String[] args) {
		ThreadMethod2 m1 = new ThreadMethod2("one");
		ThreadMethod2 m2 = new ThreadMethod2("two");
		System.out.println("Thread m1 is alive :" + m1.t.isAlive());
		System.out.println("Thread m2 is alive:" + m1.t.isAlive());
		try {
			System.out.println("Waiting for thread to finish ….");
			m1.t.join();
			m2.t.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Thread m1 is alive :" + m1.t.isAlive());
		System.out.println("Thread m2 is alive :" + m2.t.isAlive());
		System.out.println(" Main thread exiting …");
	}//main
	}//class

