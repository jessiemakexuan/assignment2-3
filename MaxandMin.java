package maxandmin;

import java.util.Scanner;

public class MaxandMin {
	public int findMax(String numlist){
		String []numlist1=numlist.split(",");
		int max=Integer.parseInt(numlist1[0]);
		for(int i=1;i<numlist1.length;i++){
			int[]numberlist=new int[numlist1.length-1];
			numberlist[i-1]=Integer.parseInt(numlist1[i]);
			if(numberlist[i-1]>=max){
				max=numberlist[i-1];
			}
		}
		return max;
	}
	int findMin(String numlist){
		String []numlist1=numlist.split(",");
		int min=Integer.parseInt(numlist1[0]);
		for(int i=1;i<numlist1.length;i++){
			int[]numberlist=new int[numlist1.length-1];
			numberlist[i-1]=Integer.parseInt(numlist1[i]);
			if(numberlist[i-1]<=min){
				min=numberlist[i-1];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a list of numbers,use , between numbers");
		System.out.println("Like: 2,3,12,34,112");
		Scanner in=new Scanner(System.in);
		String numlist=in.nextLine();
		in.close();
		MaxandMin number=new MaxandMin();
		System.out.println("Max number is "+number.findMax(numlist));
		System.out.println("Min number is "+number.findMin(numlist));
	}

}
