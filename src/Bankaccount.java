
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
		System.out.println("�Ա���: "+ getBalance());
		
	}
	public void delete(int money){
		balance -= money;
		System.out.println("�����: "+ getBalance());
		
	}

}
