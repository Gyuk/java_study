
public class TestMain{
	static Bankaccount account = new Bankaccount(100);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread depositMan =  new Thread(){
			public void run(){
				for(int i=0; i< 10; i++){
					account.add(10);
					//System.out.println("현재계좌: "+ account.getBalance());
					try{
						sleep(1000);
					}catch(Exception e){}
				}
				System.out.println("deposit thread 종료");
			}
		};
		Thread withdrawMan = new Thread(){
			public void run(){
				for(int i=0; i<10 ; i++){
					account.delete(10);	
					//System.out.println("현재계좌: "+ account.getBalance());
					try{
						sleep(1000);
					}catch(Exception e){}
				}
				System.out.println("withdraw thread 종료");
			}
		};
		depositMan.start();
		withdrawMan.start();

	}

}
