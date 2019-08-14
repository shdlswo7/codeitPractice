
public class Person {
	private String name;
	private int age;
	private int cashAmount;
	
	public void setName(String newName) {
		name=newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		if(newAge>0) {
			age= newAge;			
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setCashAmount(int newCashAmount) {
		if(newCashAmount>0) {
			cashAmount=newCashAmount;
		}
	}
	public int getCashAmount() {
		return cashAmount;
	}
	


	//������ BankAccount Ŭ������ �ν��Ͻ��� �޾ƿ���.
	private BankAccount account;
	
	public void setAccount(BankAccount newAccount) {
		account=newAccount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	//�޴� ���, ��ü�� �ݾ�, ��������
	public boolean transfer(Person to, int amount) {
		    
		      if(amount<0||amount>account.getBalance()) {
		  
			  System.out.println(false+"-from :["+getName()+"], to: ["+to.getName()+"], amount: ["+amount+"], balance : ["+account.getBalance()+"]");
			  
			  return false;
			  
			  }else {
				  account.setBalance(account.getBalance()-amount);
				  to.account.setBalance(to.account.getBalance()+amount); 
				  System.out.println(true+"-from :["+getName()+"], to: ["+to.getName()+"], amount: ["+amount+"], balance : ["+account.getBalance()+"]");
		     return true; }
		 
		//return account.transfer(to.getAccount(), amount);
	}
	//�޴� ����� ����, ��ü�� �ݾ�, ��������
	public boolean transfer(BankAccount to, int amount) {
		return account.transfer(to, amount);
	}
	
	 
	
	
}
