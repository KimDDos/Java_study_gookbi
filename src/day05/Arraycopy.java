package day05;

import javax.sql.rowset.serial.SerialArray;

public class Arraycopy {

	public static void main(String[] args) {
		/* arraycopy : 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘이거나 줄일수 없음.
		 * 이후 추가/삭제 불가능.
		 * 배열의 길이를 늘이거나 줄이고 싶을 배열 복사를 통해
		 * 길이를 조절.
		 * */
		
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("------------------");
		
		// 수동으로 배열을 복사
		// 통상적으로 배열을 복사할때 기존 배열을 2배로 만들어서 복사함
		int arr1[] = new int[arr.length*2];
		
		// arraycopy를 이용
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = arr[i];
//		}
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		/* 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 출력 (향상된 for문으로 출력)
		 * 
		 * 5개의 값을 담을 수 있는 String 배열 생성후 arraycopy
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 * */
		
		System.out.println();
		
		String[] str = new String[] {"국어","영어","수학"};
		
		for(String tmp : str) {
			System.out.println(tmp);
		}
		
		String[] str1 = new String[5];
		System.arraycopy(str, 0, str1, 0, str.length);
		
		str1[3] = "사회";
		str1[4] = "과학";
		
		for(String s : str1) {
			System.out.print(s + " ");
		}
		
	}

}
