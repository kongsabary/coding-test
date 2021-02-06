package test;

public class Test09 {
	public static void main(String[] args) {
		// 평균 구하기
		int[] arr = {5,5};
		solution(arr);
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		double answer = 0;
        if(1<=arr.length && arr.length<100) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += (int)arr[i];
			}
			answer = (double)sum/(arr.length);
		}
        return (int)answer;
	}
}
