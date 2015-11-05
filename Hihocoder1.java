package leetcode;

import java.util.Scanner;

public class Hihocoder1 {

	public double returnArea(int ar[],int l){
		java.util.Arrays.sort(ar);
		double p = (double)(ar[0] + ar[1] + ar[2] + l) / 2;

		double area = 0, edge = 0;
		if(2*ar[2]-ar[0]-ar[1] <= l){
			edge = (2*p) / 3;
			area = Math.sqrt(p*(p-edge)*(p-edge)*(p-edge));
			
		}else if((2*ar[2]-ar[0]-ar[1]) > l && (ar[1]-ar[0]) <= l){
			edge = (double)(ar[0] + ar[1] + l ) / 2;
			area = Math.sqrt(p*(p-edge)*(p-edge)*(p-ar[2]));
		}else {
			area = Math.sqrt(p*(p-ar[0]-l)*(p-ar[1])*(p-ar[2]));
		}
		return area;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int input[][] = new int[t][3];
		int L[] = new int[t];
		for(int i=0;i<t;i++){
			 input[i][0] = scanner.nextInt();
			 input[i][1] = scanner.nextInt();
			 input[i][2] = scanner.nextInt();
			 L[i] = scanner.nextInt();
		}
		
		for(int i=0;i<t;i++){
			double area = new Hihocoder1().returnArea(input[i],L[i]);
			System.out.println(String.format("%.10f", area));
		}	
				
	}

}
