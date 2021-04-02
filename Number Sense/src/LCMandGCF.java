import java.util.Arrays;

public class LCMandGCF {
	
	public static int GCF(int... nums) {
		if (nums.length == 0) {
			System.out.println(nums.length + " is an invalid number of arguments for function GCF");
			return -1;
		} else {
			int[] numsTemp = Arrays.copyOf(nums, nums.length);
			int gcf = numsTemp[0];
			for (int i = 1; i < numsTemp.length; i++) {
				while (numsTemp[i] != 0) {
					int t = numsTemp[i];
					numsTemp[i] = gcf % numsTemp[i];
					gcf = t;
				}
			}
			return gcf;
		}
	}

	public static void main(String[] args) {
		System.out.println(GCF(462, 1071));
		System.out.println(LCM(462, 1071));
	}

	public static int LCM(int... nums) {
		if (nums.length == 0) {
			System.out.println(nums.length + " is an invalid number of arguments for function LCM");
			return -1;
		} else {
			int lcm = nums[0] / GCF(nums);
			for (int i = 1; i < nums.length; i++) {
				lcm *= nums[i];
			}
			return lcm;
		}
	}

}
