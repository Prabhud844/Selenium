package Test.Test;

public class reves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my god ayyppa";
		String words[] =str.split(" ");
		String reve =" ";
		int lebb = words.length;
		System.out.println("len"+lebb);
		System.out.println("word"+words[0]);
		System.out.println("word"+words[1]);
		System.out.println("word"+words[2]);
		
		
		
		
		for( int i =0;i<lebb;i++){
			if (i==words.length-1){
				reve = words[i]+reve;
			}
			
			reve =  words[0] + words[1]+ reve;
		}

		System.out.println("Revers string::  "+reve);
	}

}
