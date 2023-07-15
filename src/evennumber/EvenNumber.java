package evennumber;

import java.util.Scanner;

public class EvenNumber {

	public static int[] evenNumbersInRange(int array[],int query[][]) {
		int[] value = new int[query.length];
		for(int i=0;i<query.length;i++) {
			int count = 0;
			int l = query[i][0];
			int r = query[i][1];
			for(int j=l;j<=r;j++) {
				if(array[j]%2==0) {
					count++;
				}
			}
			value[i] = count;
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int n2 = scanner.nextInt();
		int[][] queries = new int[n2][2];
		for(int i=0;i<n2;i++) {
			for(int j=0;j<2;j++) {
				queries[i][j] = scanner.nextInt();
			}
		}
		System.out.println(evenNumbersInRange(array,queries));
	}

}
