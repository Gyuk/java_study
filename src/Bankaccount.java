
public class Bankaccount extends Thread{
	private int balance;
	public Bankaccount(int amount){
		this.balance = amount;
	}
	
	public int getBalance(){
		return balance;
		
	}
	public void add(int money){
		balance += money;
		System.out.println("입금후: "+ getBalance());
		
	}
	public void delete(int money){
		balance -= money;
		System.out.println("출금후: "+ getBalance());
		
	}

}
