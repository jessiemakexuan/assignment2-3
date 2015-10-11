package modifycounta;

import java.util.Scanner;

public class CountLetter {
	public int countletter(String word,char a){
		char character[]=word.toCharArray();
		int count=0;
		for(int i=0; i<character.length; i++){
			if(character[i]==a){
				count++;
			}
     	}
		return count;
	}
	public int countlettera(String word1){
		return countletter(word1,'a');
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		CountLetter count=new CountLetter();
		System.out.println("Please input a word or sentence");
		String word=in.nextLine();
		System.out.println("Please input a character you want to count");
		String c=in.next();
		char a=c.charAt(0);	
		if(count.countletter(word,a)>=1){
			System.out.println(word+" has "+count.countletter(word,a)+" "+a+".");
		}
	    else{ 
		    System.out.println(word+" has no '"+a+"'.");
	    }
		System.out.println("Please input a word or sentence to let us count 'a'.");
		String word1=in.next();
		if(count.countlettera(word1)>=1){
			System.out.println(word1+" has "+count.countlettera(word1)+" 'a'.");
		}
		else{
			System.out.println(word1+" has no 'a'.");
		}
		in.close();
	}

}
