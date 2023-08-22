package day05;

public class Array03 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 출력
		 * */
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("------------------");
		
		// 내림차순 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println("------------------");
		
		
	}

}
