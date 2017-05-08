
public class Ex5_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double ANNUAL_INCOME = 30000;
		
		double salesAmount,
		commision, 
		balance;
		
		salesAmount = 0;
		
		do {
			balance = commision = 0;
			salesAmount += 0.01;
			if (salesAmount > 10000)
				commision += (balance = salesAmount - 10000) * 0.12;
			if (salesAmount > 5000)
				commision += (balance = salesAmount - 10000) * 0.10; 
			if (salesAmount > 0)
				commision += (balance = salesAmount - 10000) * 0.8; 
		}
		while (commision < ANNUAL_INCOME);
		
		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);

	}

}
