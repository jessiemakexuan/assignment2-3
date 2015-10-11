package evencount;

import java.util.Scanner;

public class Evencount {
	public int[] count(int number){
		int size =number/2;
		int evennumbers[] = new int[size];
		int index=0;
		for(int i=0; i<number/2;i++){
			evennumbers[index]=2+i*2;
			index++;
		}
		return evennumbers;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please input an positive integer number");
		int number=in.nextInt();
		Evencount numbercount=new Evencount();
		for (int i = 0; i < numbercount.count(number).length; i++) {
			System.out.print(numbercount.count(number)[i]);
			if (i < numbercount.count(number).length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		numbercount.count(number);
		in.close();
	}

}
