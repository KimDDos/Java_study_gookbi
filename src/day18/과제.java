package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가, 출력(정렬해서 출력)
		 * 단어를 조회, 수정, 삭제
		 * */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> wordList = new ArrayList<>();
		
		wordList.add(new Word("Car","자동차")); 
		wordList.add(new Word("Dice","주사위")); 
		wordList.add(new Word("Apple","사과")); 
		wordList.add(new Word("air","공기")); 
		
		int menu = -1;
		
		do {
			System.out.println("=== 단어장 Menu ===");
			System.out.println("1.단어입력 | 2.단어장 전체 출력 | 3.단어조회 | 4. 단어수정 | 5.단어삭제 | 6.종료하기");
			System.out.println(">> menu 입력 >");
			menu=sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("새로운 단어와 의미를 입력해주세요.");
				String wordString = sc.next();
				String meanString = sc.next();
				if(wordString == null || meanString == null) {
					System.out.println("잘못된 입력입니다.");
					break;
				} else {
					wordList.add(new Word(wordString,meanString)); 
					break;
				}
			case 2:
				System.out.println("단어장 전체를 출력합니다.");
				System.out.println(wordList);
				ArrayList<String> list = new ArrayList<String>(); 
				ArrayList<Word> list2 = new ArrayList<>(); 
				for(int i=0; i<wordList.size(); i++) {
					list.add(wordList.get(i).getWord());
				}
				list.sort(new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return o1.toLowerCase().compareTo(o2.toLowerCase());
						// 대소문자 상관없이 정렬을 위해 toLowerCase 사용
					}
				});
				for(int i=0; i<wordList.size(); i++) {
					for(int j=0; j<wordList.size(); j++) {
						if(list.get(i).equals(wordList.get(j).getWord())) {
							list2.add(wordList.get(j));
						}
					}
				}
				wordList = list2;
				System.out.println(wordList);
				break;
			case 3: 
				System.out.println("조회할 단어를 입력해주세요.");
				String search = sc.next();
				int cnt=0;
				for(int i=0; i<wordList.size(); i++) {
					if(search.contains(wordList.get(i).getWord())) {
						System.out.println("일치하는 단어:"+wordList.get(i));
						cnt++;
					}
				}
				if(cnt==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				break;
			case 4: 
				System.out.println("수정할 단어를 입력해주세요.");
				search = sc.next();
				cnt=0;
				for(int i=0; i<wordList.size(); i++) {
					if(search.contains(wordList.get(i).getWord())) {
						System.out.println("수정할 의미를 입력해주세요.");
						String means = sc.next();
						wordList.set(i, new Word(search,means));
						cnt++;
						System.out.println("수정완료");
					}
				}
				if(cnt==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				break;
			case 5: 
				System.out.println("삭제할 단어를 입력해주세요.");
				search = sc.next();
				cnt=0;
				int num=0;
				for(int i=0; i<wordList.size(); i++) {
					if(search.contains(wordList.get(i).getWord())) {
						num=i;
						cnt++;
					}
				}
				if(cnt==0) {
					System.out.println("일치하는 단어가 없습니다.");
				}
				wordList.remove(num);
				System.out.println("삭제완료");
				break;
			case 6:  break;
			default: System.out.println("잘못된 메뉴입력입니다.");
			}
			
		} while(menu !=6);
		System.out.println("프로그램 종료");
		
	}
	
}
