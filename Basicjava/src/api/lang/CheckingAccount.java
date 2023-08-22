package api.lang;

public class CheckingAccount extends Account {
	private String cardNo;

	
	public CheckingAccount(){
	}
	
	public CheckingAccount(String accId, long balance,String ownerName, String cardNo) {
		super(accId,balance,ownerName);
		this.cardNo = cardNo;
	}
	
	 public void pay(long amount, String cardNo) {
	        if (cardNo.equals(this.cardNo)) { // ==쓰면 주소비교라 new 로 만들어지면 비교가 불가능함
	            if (amount <= getBalance()) {
	                withdraw(amount);
	                System.out.println("성공. Amount: " + amount);
	            }
	        } 
	        else {
            	System.out.println("지불이 불가능합니다");
            }
	    }
}