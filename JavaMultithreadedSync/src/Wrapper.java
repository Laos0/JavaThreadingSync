import java.util.ArrayList;

public class Wrapper implements Runnable {

	private ArrayList<Customer> customers;
	private int from, to;
	
	Wrapper(ArrayList<Customer> customers, int from, int to){
		this.customers = customers;
		this.from = from;
		this.to = to;
	}
	
	public void run() {
		parallelCount(this.from, this.to);
	}

	private void parallelCount(int from, int to){
		// each wrapper will run each thread givent he to and from index.
		// like this wrapper instance will run index 0-500

	}
}
