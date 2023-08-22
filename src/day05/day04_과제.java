package day05;

import java.util.Scanner;

public class day04_과제 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고, 점수의 합계와, 평균을 출력
		 * 최고점수
		 * 
		 * 입력 > Scanner
		 * for문은 활용하여 입력받은 점수를 저장
		 * 최댓값 if / Math.max
		 * */
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		int sum=0;
		double avg=0;
		
		//최대값
		int max=0;
		int max1=0;
		
		//최소값
		int min = 100;
		int min1 = 100;
		
		System.out.println("점수를 입력해주세요. (5명)");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			// 최대값 
			if(max < arr[i]) {
				max = arr[i];
			}
			//최소값
			if(min>arr[i]) {
				min = arr[i];
			}
			// Math.max
			max1 = Math.max(max1, arr[i]);
			min1 = Math.min(min1, arr[i]);
		}
		
		avg = (double)sum / arr.length;
		
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		System.out.println("최대값:"+max);
		System.out.println("Math.최대값:"+max1);
		System.out.println("최소값:"+min);
		System.out.println("Math.최소값:"+min1);
		
		sc.close();
		
	}

}
