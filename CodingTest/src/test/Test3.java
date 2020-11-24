package test;

public class Test3 {
	
	public static void main(String[] args) {
		String[] Kim = {"Jane","Kim"};
		System.out.println(solution(Kim));
	}
	
	// 서울에서 김서방 찾기
	public static String solution(String[] seoul) {
        int num = 0;
        for(String e : seoul) {
            if(e.equals("Kim")) {
                break;
            }
            num++;
        }
        return "김서방은 " + num + "에 있다";
    }
}
