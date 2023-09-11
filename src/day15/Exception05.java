package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		// BufferedReader, InputStreamReader 입력속도 : 0.6585초
		// Scanner 입력속도 : 4.8448초
		/* buffer 사용간 용량차이에 따라 처리속도가 달라짐, 이때 Scanner는 1KB 크기의 버퍼를 갖고서 프로그램에 바로 입력이 전달 
		 * BufferedReader는 Buffer의 크기가 8KB이고 버퍼에 저장되었다가 한번에 전송하기에 속도가 빠름
		 * 
		 *  ++ Scanner는 입력을 읽는 과정에서 내부에서 정규 표현식 적용, 입력값 분할, 파싱 과정을 거쳐 속도가 느려짐
		 *  
		 *  ++ in은 InputStream 타입의 변수임을 볼수 있는데, 
		 *     InlputStream은 java.io 패키지의 바이트 단위 입력을 위한 최상위 입력 스트림 클래스임
		 *     System.in을 매개변수로 사용하기 때문에 사용자 입력을 받을 수 있다고 생각하면 됨
		 * */
		
		
		String name;
		try {
			name = br.readLine();
			System.out.println(name);
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
