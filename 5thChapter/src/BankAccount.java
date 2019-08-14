
public class BankAccount {
	private int balance;
	public void setBalance(int newBalance) {
		balance=newBalance;
	}
	public int getBalance() {
		return balance;
	}
	
	
	//������ personŬ������ �ν��Ͻ��� �޾ƿ���.
	private Person owner;
	public void setOwner(Person newOwner) {
		owner=newOwner;
	}
	public Person getOwner() {
		return owner;
	}
	
	//�Ķ���� : �Ա��� �׼�(����)
	//�� �� : ��������(�Ҹ�)
	boolean deposit(int amount) {
		//�Ա��� �����ϸ� true�� ���� ���н� false
		if(amount<0) {
			System.out.println("�Ա� �����Դϴ�."+"�ܰ� :"+balance+"��"+",���� :"+owner.getCashAmount());
			System.out.println("false");
			return false;
			
		}else if(owner.getCashAmount()<amount){
			System.out.println("�Ա� �����Դϴ�."+"�ܰ� :"+balance+"��"+",���� :"+owner.getCashAmount());
			System.out.println("false");
			return false;
			
		}else {
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.println(amount+"�� �Ա��Ͽ����ϴ�."+"�ܰ� :"+balance+"��"+",���� :"+owner.getCashAmount());
			System.out.println("true");
			return true;
		}
	}
	//�Ķ���� : ����� �׼�(����)
	//�� �� : ��������(�Ҹ�)
	boolean withdraw(int amount){
		if(balance<amount) {
			System.out.println("��� �����Դϴ�."+"�ܰ� :"+balance+"��, ���� :"+owner.getCashAmount()+"��");
			System.out.println("false");
			return false;
		}else if(amount < 0){
			System.out.println("��� �����Դϴ�."+"�ܰ� :"+balance+"��, ���� :"+owner.getCashAmount()+"��");
			System.out.println("false");
			return false;
		}else{
			balance -=amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.println(amount+"�� ����Ͽ����ϴ�."+"�ܰ� :"+balance+"��, ���� :"+owner.getCashAmount()+"��");
			System.out.println("true");
			return true;
		}
		
	}
	//�޴� ��� , ��ü�� �ݾ�, ��������
	//account�� account���� �ŷ��̹Ƿ�, person to�� ������ account ������ �ٲپ� ȣ��.
	public boolean transfer(Person to, int amount) {
		
		  if(amount<0 || amount>balance) {
			
			  System.out.println(false+"-from :["+owner.getName()+"], to: ["+to.getName()+"], amount: ["+amount+"], balance : ["+balance+"]");
			  
			  return false;
			  }else {
			  //from
			  balance-=amount; 
			  //to
			  to.getAccount().balance+=amount;
			  
			  System.out.println(true+"-from :["+owner.getName()+"], to: ["+to.getName() +"], amount: ["+amount+"], balance : ["+balance+"]");
			  return true;
	         }
			 
			//return transfer(to.getAccount(),amount);
	}
	
	//�޴� ����� ����, ��ü�� �ݾ�, ��������
	public boolean transfer(BankAccount to, int amount) {
		if(amount<0|| amount>balance) {
			System.out.println(false+"-from :["+owner.getName()+"], to: ["+to.owner.getName()+"], amount: ["+amount+"], balance : ["+balance+"]");
			
			return false;
		}else {
			//from
			balance-=amount;
			//to
			to.balance+=amount;
			System.out.println(true+"-from :["+owner.getName()+"], to: ["+to.owner.getName()+"], amount: ["+amount+"], balance : ["+balance+"]");
			return true;
		}
	}
	}
