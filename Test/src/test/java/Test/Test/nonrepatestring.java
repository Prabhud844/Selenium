package Test.Test;

import java.util.ArrayList;
import java.util.List;

public class nonrepatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to find out first non repeated character from input String?
		
		System.out.println(printNoReptingcharcter("prahala"));

	}

	private static Character printNoReptingcharcter(String str) {
		char[] chars =str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(str.lastIndexOf(chars[i])== str.indexOf(chars[i])) {
				return chars[i];
				
			}
			
		}
		return null;


}
}