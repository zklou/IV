package oa;

public class A1 {
	public static int minIncrements(int[] list) {
		int minIncrements = 0;
		int increment = 0;
		int n;
		for (n = 0; n < list.length - 1; n++) { // if use list.length will exceed length for n+1;
			if (list[n] > list[n + 1]) {
				increment = list[n] - list[n + 1];
				list[n + 1] = increment + list[n + 1];
				minIncrements += increment;
			}
			
		}
		return minIncrements;
	}
	
	public static void main(String[] args) {
        int[] list = {3, 4, 1, 6, 2};
        System.out.println(minIncrements(list));  // 输出7
    }
}
