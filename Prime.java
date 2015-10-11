package prime;

import java.util.Scanner;

public class Prime {
	boolean check(int num){
		if(num>1){
			int i;
			for(i = 2; i<=(num/2);i++){
				if(num%i==0){
					return false;
				}
			}
			if(i>num/2){
				return true;
			}
		}
		else if(num==1){
			return false;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input an positive integer number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Prime prime=new Prime();
		if(prime.check(num)){
			System.out.println("Is Prime");
		}
		else
			System.out.println("Not prime");
		in.close();

	}

}
