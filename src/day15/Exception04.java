package day15;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티 캐치
		/* try{
		 *    code...
		 * } catch(하위 예외클래스 e){
		 * 
		 * } catch(하위 예외클래스 e){
		 * 
		 * } catch(Exception e){
		 * 
		 * }
		 * */
		try {
			int res = 1/0;
			System.out.println(res);
			// int arr[] = null;
			int arr1[] = new int[3];
			arr1[5] = 10;
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("종료~!!");
		
		
	}

}
