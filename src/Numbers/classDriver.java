package Numbers;

// this will be our testing class.
// whatever you want to test it here by making there instance.
public class classDriver {

	public static void main(String[] args) throws java.lang.Exception {

		// Amount, rate, time in month
		mortgage temp =  new mortgage(50000, 10, 100);
		temp.PrintPayment();
	}
}
