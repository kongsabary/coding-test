package test;

public class Test16 {
	public static void main(String[] args) {
		// 핸드폰 번호 가리기
		String phone_number = "01033334444";
		System.out.println(solution(phone_number));

	}
	public static String solution(String phone_number) {
		String str = phone_number;
		String answer = "";
		String last4 = str.substring(str.length()-4,str.length());
		for (int i = 0; i < str.length()-4; i++) {
            answer += "*";
		}
		answer+=last4;
		return answer;
	}
}
