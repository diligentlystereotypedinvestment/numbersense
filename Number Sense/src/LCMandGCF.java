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

	public static int LCM(int... nums) {
		if (nums.length == 0) {
			System.out.println(nums.length + " is an invalid number of arguments for function LCM");
			return -1;
		} else {
			int[] numsTemp = Arrays.copyOf(nums, nums.length);
			int lcm = LCM(nums[0], nums[1]);
			for(int i = 2; i < nums.length; i++){
				lcm = LCM(lcm, nums[i]);
			}
			return lcm;
		}
	}

	public static int LCM(int num1, int num2){
		return num1 * num2 / GCF(num1, num2);
	}
}
