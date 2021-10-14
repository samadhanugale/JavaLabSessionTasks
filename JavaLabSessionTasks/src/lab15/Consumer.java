package lab15;

class Consumer implements Runnable {
	Stock c;
	Thread t;

Consumer (Stock c) 
{
	this.c = c; 
	 t = new Thread(this, "producer thread"); 
	 t.start(); 
	 }

	public void run() {
		while (true) {
			try {
				t.sleep(750);
			} catch (InterruptedException e) {
			}
			c.getstock((int) (Math.random() * 100));
		}
	}

	void stop() {
		t.stop();
	}
}