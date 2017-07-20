
public class BankEncapClass {
	private int pinFromBank=12345;
	public void withdrawMoneyByPinNumber(int pinbyuser){
		
		if (pinFromBank==pinbyuser){
			System.out.println("Pin Number correct");
		}
		else{
			System.out.println("Pin Number wrong");
		}
			
	}
	

}
