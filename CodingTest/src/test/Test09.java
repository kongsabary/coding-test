package test;

public class Test09 {
	public static void main(String[] args) {
		int[] arr = {5,5};
		soultion(arr);
		System.out.println(soultion(arr));
	}
	
	public static int soultion(int[] arr) {
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