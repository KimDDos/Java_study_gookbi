package day15;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg) String[] fileName =
		 * {"java.txt","String.jpg","method.png", "String.pdf","java.pdf"}
		 * 
		 * --이미지 파일-- String.jpg method.png
		 */
		String[] fileName = new String[5];
		Scanner sc = new Scanner(System.in);
		inputFilename(fileName, sc);
		searchImage(fileName);
	}
	
	// 파일명을 입력받는 메서드
	public static String[] inputFilename(String[] arr, Scanner sc) {
		for (int i=0; i < arr.length; i++) {
			System.out.println(i+1 + "번째 자료를 입력 해주세요.");
			arr[i] = sc.next();
		}
		return arr;
	}

	// 이미지 파일을 검색하여 출력하는 코드
	public static void searchImage(String[] arr) {
		System.out.println("이미지의 자료형을 출력합니다.");
		for(String tmp : arr) {
			if(tmp.contains("jpg")||tmp.contains("png")||tmp.contains("JPG")||tmp.contains("PNG")
					||tmp.contains("gif")||tmp.contains("jpeg")||tmp.contains("GIF")||tmp.contains("JPEG")) {
				System.out.println(tmp);
			}
		}
	}
}
