/**
 * 
 * @author alnaelis
 *Kent State University, Ohio.
 */
import java.util.ArrayList;

public class Customer {
private String ID;
private double balance;

public Customer() {
	ID = "-";
	this.balance = -1;
}
public Customer(String iD, double balance) {
	ID = iD;
	this.balance = balance;
}

// for parallel 
public Customer(ArrayList<Customer> cList) {
	
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public synchronized void parallelCount(int from, int to) {

}
@Override
public String toString() {
	return "Customer [ID=" + ID + ", balance=" + balance + "]";
}

}
