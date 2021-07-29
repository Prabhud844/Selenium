package Test.Test;

public class CheckString {
	String name;
	int i;
	
	
	public CheckString(String name,int i) {
		this.name =name;
		this.i =i;
	}

	public String toString(){
		return ""+this.i;
	}
	public static void main(String[]args){
		
		
		CheckString ck = new CheckString("check",12);
		String s1 =new String("Prabhu prahala engineering umner");
		System.out.println(s1);
		System.out.println(ck);
		char cj= s1.charAt(0);
		
		int i=0;
		int count =0;
		while(i<s1.length()){
			char ch= s1.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
				count++;
			System.out.println(s1.charAt(i));
			i++;
		}
		System.out.println(count);
		
	
		
		
	}

}
