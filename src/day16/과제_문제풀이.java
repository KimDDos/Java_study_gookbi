package day16;

public class 과제_문제풀이 {

	public static void main(String[] args) {
		/*
		 * 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg, png, gif, jpeg) String[] fileName =
		 * {"java.txt","String.jpg","method.png", "String.pdf","java.pdf"}
		 * 
		 * --이미지 파일-- String.jpg method.png
		 */
		
		과제_문제풀이 ex = new 과제_문제풀이();
		String[] fileName = {"java.txt","String.jpg","method.png", "String.pdf","java.pdf"};
		String[] img = {"jpg","png","gif","jpeg"};
		// String[] img = null;
		System.out.println("--이미지 파일--");
		try {
			for(String tmpfile:fileName) {
				String search = tmpfile.substring(tmpfile.lastIndexOf(".")+1);
				// System.out.println(search);
				if(ex.iscontains(img, search)) {
					System.out.println(tmpfile);
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	// isContains
	// 배열에서 찾는 문자열이 있는지 체크 true / false
	public boolean iscontains(String arr[], String search) {
		if(arr==null || arr.length==0) {
			throw new RuntimeException("배열이 없습니다.");
		}
		if(search == null) {
			throw new RuntimeException("검색어가 없습니다.");
		}
		
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
