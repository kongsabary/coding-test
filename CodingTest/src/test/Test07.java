package test;

public class Test07 {
	// 두 정수 사이의 합
	public static void main(String[] args) {
		soultion(3, 5);
		System.out.println(soultion(3, 5));
	}
	
	public static long soultion(int a, int b) {
		long result = 0;
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				result+=i;
			}
		} else if(a>b) {
			for(int i=b;i<=a;i++) {
				result+=i;
			}
		} else if(a==b) {
			return result=a;
		}
		return result;
	}
}
