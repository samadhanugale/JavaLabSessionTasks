package lab15;

public class Producer {
	Stock s;
	Thread t;

	Producer(Stock s ) 
	 { 
	 this.s = s; 
	 t = new Thread( "producer thread"); 
	 t.start(); 
	 }

	public void run() {
		while (true) {
			try {
				t.sleep(750);
			} catch (InterruptedException e) {
			}
			s.addstock((int) (Math.random() * 100));
		}
	}

	void stop() {
		t.stop();
	}
}
