
public class BankAccount {

	public double amount;
	public double rate;
	
	public void showNewBalance() {
		
		double newAmount=amount+(rate/100.0)*amount;
		System.out.println("With interest added, the new amount is $ "+newAmount);
		
	}
	
	public static void main(String[] args) {

		BankAccount myAccount= new BankAccount();
		myAccount.amount=100.00;
		myAccount.rate=5;
		
		double newAmount=800.00;
		myAccount.showNewBalance();
		System.out.println("I wish my new amount is $ "+newAmount);
		
	}
		
	//이 예제로 말하고 싶은 것, 지역변수랑 insatnce랑 이름 똑같지만 동작되고, 지역변수는 그 함수 안에서만 살아있다는 ㅅ것
}
