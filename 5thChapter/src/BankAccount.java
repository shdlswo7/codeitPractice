
public class BankAccount {
	private int balance;
	public void setBalance(int newBalance) {
		balance=newBalance;
	}
	public int getBalance() {
		return balance;
	}
	
	
	//생성된 person클래스를 인스턴스로 받아오기.
	private Person owner;
	public void setOwner(Person newOwner) {
		owner=newOwner;
	}
	public Person getOwner() {
		return owner;
	}
	
	//파라미터 : 입금할 액수(정수)
	//리 턴 : 성공여부(불린)
	boolean deposit(int amount) {
		//입금을 성공하면 true를 리턴 실패시 false
		if(amount<0) {
			System.out.println("입금 실패입니다."+"잔고 :"+balance+"원"+",현금 :"+owner.getCashAmount());
			System.out.println("false");
			return false;
			
		}else if(owner.getCashAmount()<amount){
			System.out.println("입금 실패입니다."+"잔고 :"+balance+"원"+",현금 :"+owner.getCashAmount());
			System.out.println("false");
			return false;
			
		}else {
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.println(amount+"원 입금하였습니다."+"잔고 :"+balance+"원"+",현금 :"+owner.getCashAmount());
			System.out.println("true");
			return true;
		}
	}
	//파라미터 : 출글할 액수(정수)
	//리 턴 : 성공여부(불린)
	boolean withdraw(int amount){
		if(balance<amount) {
			System.out.println("출금 실패입니다."+"잔고 :"+balance+"원, 현금 :"+owner.getCashAmount()+"원");
			System.out.println("false");
			return false;
		}else if(amount < 0){
			System.out.println("출금 실패입니다."+"잔고 :"+balance+"원, 현금 :"+owner.getCashAmount()+"원");
			System.out.println("false");
			return false;
		}else{
			balance -=amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.println(amount+"원 출금하였습니다."+"잔고 :"+balance+"원, 현금 :"+owner.getCashAmount()+"원");
			System.out.println("true");
			return true;
		}
		
	}
	//받는 사람 , 이체할 금액, 성공여부
	//account와 account간의 거래이므로, person to의 정보를 account 정보로 바꾸어 호출.
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
	
	//받는 사람의 계정, 이체할 금액, 성공여부
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
