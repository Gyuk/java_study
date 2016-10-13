package java_project;
import java.util.Scanner;

public class quickcoding3 {
	
	
	static void Th() throws MyException{
		throw new MyException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		try{
			if(a>= 1000 || b >= 1000)
				Th();
			if(b == 0)
				Th();
			
			int c = a/b;
			System.out.println(c);
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("시스템종료");
		}
		
	}

}
