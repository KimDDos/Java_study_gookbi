package day04;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수의 집합(참조변수)
		 * - 참조변수는 초기화가 미리 되어 있음.  // null or 0
		 * - 기본형 변수는 초기화를 해주지 않기에, 직접 초기화를 해줘야 함
		 * - 배열 선언 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * 
		 * - 배열 선언 & 초기화
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 일반적인 방법
		 * 타입[] 배열이름 = new 타입[] {값, 값, 값, 값, 값, 값 ... };
		 * 타입[] 배열이름 = {값, 값, 값, 값 ...};
		 * // 선언과 동시에 초기화를 할 때만 가능함
		 * - 배열의 길이는 0이상이여야 한다.
		 * - 배열의 길이는 length 로 확인 가능
		 * - 배열의 시작번지는 0번지부터 시작
		 * 배열[3] => 0 1 2
		 * 배열의 마지막 번지는 항상 length - 1
		 * */
		
		int[] arr = new int[5];  // 0 0 0 0 0
		int arr1[];  // null
		int arr2[] = new int[] {1, 2, 3, 4, 5};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		// for문을 활용해서 한번에 출력 가능함
		// index는 0부터 시작이기에 i변수는 0으로 초기화해야함.
		// arr2.length를 조건식으로 넣을때는 같다는 포함 X, 
		// 메모리 할당이 되어있지 않는 값을 조회하라고 하기에 error 발생
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------");
//		System.out.println(arr2);  // 참조변수의 객체 주소가 출력됨
		
		int arr3[] = {1,2,3};
		
		/* 배열을 사용하는 이유
		 * 반복문을 이용할수 있기 때문에 편리함
		 * 관리가 쉬움
		 * */
		
		// 배열에 값을 추가
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]);  // 10
		System.out.println("------------");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i*10) + 10;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
		// arr5 배열을 생성하고 짝수만 저장하고, 출력
		int[] arr5 = new int[10];
		for(int i=0; i<arr5.length; i++) {
			arr5[i] = (i*2) + 2;
			System.out.printf("%3d", arr5[i]);
		}
		
		System.out.println();
		System.out.println("----------------");
		// arr6 배열을 생성하고 짝수만 저장, 출력
		// 2 4 6 8 10
		// 12 14 16 18 20
		// ... 
		// 90 92 94 96 98 100
		// 위와 같이 출력
		
		int arr6[] = new int[50];
		for(int i = 0; i < arr6.length; i++) {
			arr6[i] = (i*2)+2;
			System.out.printf("%4d", arr6[i]);
			if(arr6[i] % 10 == 0) {
				System.out.println();
			} 
		}
		
		
		
		
	}

}
