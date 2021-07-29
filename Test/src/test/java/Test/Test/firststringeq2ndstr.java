package Test.Test;

import java.util.Scanner;

public abstract class firststringeq2ndstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String ");
		String sc1 = sc.nextLine();
		
		System.out.println("Enter the Second String ");
		
		String sc2 = sc.nextLine();
		
		sc.close();
		boolean result = booltest(sc1,sc2);
		System.out.println(result);
		System.out.println(sc1 +" cotains"+ sc2);
		
		

	}
	
	public static boolean  booltest(String fsstring ,String secstring){
		
		boolean result = false;
		
		result = fsstring.contains(secstring);
		return result;
		
	}

}
