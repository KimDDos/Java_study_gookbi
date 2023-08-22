package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을
		 * 출력하도록 코드를 작성하시오.
		 * */
		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg",
				"String메서드.txt","String함수.jpg","java의 함수.png"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고싶은 자료에 대한 정보를 입력해주세요.");
		String find = sc.next();
		int count = 0;
		
		int i=0;
		while(i < fileName.length) {
			if(fileName[i].contains(find)) {
				System.out.println(fileName[i]);
				count++;
			}
			i++;
		}
		if(count == 0) {
			System.out.println("찾는 자료중 해당하는 내용이 없습니다.");
		}
		
		sc.close();
	}

}
