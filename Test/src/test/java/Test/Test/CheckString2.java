package Test.Test;

public class CheckString2 {
	
	private void coutOfWord(){

		
		
		String s = " prabhu";
		String s1 ="having bike with card";
		System.out.println(s.length());
		
		System.out.println(s.contains("w"));
		System.out.println(s1.endsWith("d"));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("c"));
		
		
		int i=0; int count=0;
		 
		while(i<s1.length()){
			if(s1.charAt(i)== ' ')
				count++;
				i++;
			
		}
		System.out.println("No of word"+ count);
	}

private void coutOfsenetance(){

		
		
		String s = "prabhu";
		String s1 =" having bike with card.chedkji yiuyiuy . teuwiuewr .";
		
		int i=0; int count=0;
		 
		while(i<s1.length()){
			if(s1.charAt(i)== '.')
				count++;
				i++;
			
		}
		System.out.println("No of Senta"+ count);
	}

public void coutOfWovels(){
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
	
	public static void main(String[] args) {
		
		CheckString2 sld = new CheckString2();
		//sld.coutOfWovels();
		sld.coutOfWord();
		//sld.coutOfsenetance();
	


	}

}
