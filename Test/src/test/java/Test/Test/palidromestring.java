package Test.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public abstract class palidromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String input ="";
		
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);*/
		
		String input ="prabhu weds prahala";
		
		char[] tempmain =input.toCharArray();
		int left, right =0;
		right =tempmain.length-1;
		for (left =0;left<right;left++,right--){
			char temp =tempmain[left];
			tempmain[left] =tempmain[right];
			tempmain[right] =temp;
			
		}
		
		for(char c :tempmain){
			System.out.print(c);
			//System.out.println(c);
		}
		
		/*char [] ch = input.toCharArray();
		List<Character> ls =new LinkedList<>();
		for (char c :ch) 
			ls.add(c);
			Collections.reverse(ls);
			ListIterator it = ls.listIterator();
			while(it.hasNext()) {
				System.out.print(it.next());
			
		}*/
		
		
		
		
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb = sb.reverse();
		System.out.println("Revers String is");
		for(int i =0;i<sb.length();i++){
			System.out.print(sb.charAt(i));
		}*/
		
		
		
		/*try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input =br.readLine();
			char try1[] =input.toCharArray();
			for (int i=try1.length-1;i>=0;i--){
				System.out.print(try1[i]);
			}
			
		}
		
catch(IOException e) {
	e.printStackTrace();
	
}
	*/
		
		

	}
}
