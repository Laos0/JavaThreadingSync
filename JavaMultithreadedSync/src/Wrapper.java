import java.util.ArrayList;

public class Wrapper implements Runnable {

	Customer customerObj;
	private int from, to;
	private ArrayList customerList;
	
	Wrapper(Customer c, int from, int to, ArrayList<Customer> customerList){
		this.customerObj = c;
		this.from = from;
		this.to = to;
		this.customerList = customerList;
	}
	
	public void run() {
		customerObj.parallelCount(from, to);
	}
}
