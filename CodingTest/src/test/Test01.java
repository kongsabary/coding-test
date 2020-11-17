package test;

public class Test01 {
	// 짝수와 홀수
	public static void main(String[] args) {
		solution(4);
		System.out.println(solution(4));
	}
	
	public static String solution(int num) {
		String answer = "";
		
		if(num%2==0){
	            answer = "Even";
	        } else {
	            answer = "Odd";
	        }
		return answer;
	}
}
