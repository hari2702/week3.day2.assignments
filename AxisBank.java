package week3.day1.assignments;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit Amount is 1500rs");
	}
	public void superdeposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo bio = new BankInfo();
		AxisBank ab = new AxisBank();
		bio.deposit();
		bio.fixed();
		bio.saving();
		ab.deposit();
		ab.superdeposit();
		
	}

}
