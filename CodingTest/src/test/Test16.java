package test;

public class Test16 {
	public static void main(String[] args) {
		// 핸드폰 번호 가리기
//		String[] phone_number = { "0", "1", "0", "3", "3", "3" ,"3" ,"4" ,"4" ,"4" ,"4" };
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));
//		for (String answer : phone_number) {
//			System.out.print(answer);
//		}
	}
	public static String solution(String phone_number) {
		String answer = "";
//		String str = phone_number;
		String last4 = phone_number.substring(phone_number.length()-4,phone_number.length());
		
		for (int i = 0; i <= phone_number.length()-4; i++) {
			answer = "*";
			answer += last4;
		}
		return answer;
	}
}
