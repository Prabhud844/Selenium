package Test.Test;

public class strlencheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "automation";
		

		String bb = str.substring(0,str.length()-2);
		System.out.println(bb);
		
		String cc = str.substring(1,str.length()-2);
		System.out.println(cc);
		System.out.println(cc.length());
		
		StringBuilder sb =new StringBuilder(str);
		StringBuilder ab= sb.deleteCharAt(0);
		 System.out.println(ab);
		 
		 StringBuilder ac =ab.deleteCharAt(ab.length()-1);
		 
		 System.out.println(ac);
		 
		 System.out.println(ac.length());
		 
		 
		
		

	}

}
