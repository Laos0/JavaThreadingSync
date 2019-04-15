import java.util.ArrayList;

public class Wrapper implements Runnable {

	private ArrayList<Customer> customers;
	private int from, to;

	// cutomers with final count less than 1000
	public int finalCount;
	
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

	private void parallelCountJunkCode(int from, int to) {
		if(customers != null && customers.size() > 0) {
			for(int i = from; i < to; i++) {
				// loop
				if(customers.get(i).getBalance() < 1000) {
					finalCount++;
				}
			}
		}
	}
}
