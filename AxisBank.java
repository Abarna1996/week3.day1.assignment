package week3.day1.assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit_Axisbank");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
