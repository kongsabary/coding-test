package test;

public class Test13 {
	public static void main(String[] args) {
		// 수박수박수박수박수박수
		solution(10);
		System.out.println(solution(10));
	}
	public static String solution(int n) {
		String answer = "";
        for(int i = 0 ; i < n; i++) {
          if(i%2==0){
              answer = answer + "수";
          } else {
              answer = answer + "박";
          }  
        }
        return answer; 
	}
}
