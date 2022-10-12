import java.util.*;

public class ThreeSumClosest {

	public static int threeSumClosest(int[] array, int target) {
		Arrays.sort(array);
		int min = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < array.length - 2; i++) {
			int start = i + 1;
			int end = array.length - 1;
			while (start < end) {
				int sum = array[i] + array[start] + array[end];
				if (sum == target) {
					return sum;
				} else if (sum < target) {
					if (Math.abs(target - sum) < min) {
						ans = sum;
						min = Math.abs(target - sum);
					}
					start++;
				} else {
					if (Math.abs(target - sum) <= min) {
						ans = sum;
						min = Math.abs(target - sum);
					}
					end--;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int x = 13;
		int Arr[] = { 5, 2, 7, 5 };
		System.out.println(threeSumClosest(Arr, x));
	}

}
