import java.util.*;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		ArrayList<String> strlist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count != 10000){
			count++;
			System.out.print("�ƹ� ���ڿ��̳� �Է��� ������: ");
			String from = sc.next();
			
			try{
				int to = Integer.parseInt(from);
				intlist.add(to);
			
			}catch(NumberFormatException e){
				strlist.add(from);
			}
			
			
			System.out.print("�Էµ� ����: ");
			for(int i =0; i< intlist.size(); i++){
				System.out.print(intlist.get(i) + " ");
			}
			System.out.println("");

			
			System.out.print("�Էµ� ���ڿ�: ");

			for(int i =0; i< strlist.size(); i++){
				System.out.print(strlist.get(i) + " ");
			}
			System.out.println("");
		
		}
	


	}

}
