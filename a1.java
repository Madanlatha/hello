package Array;

public class a1 {

	public static void main(String[] args) {
		//boolean x = false;
		String x = null;
		int nums[]=new int[] {1,2,3,1};
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					x="true";
				}
				else {
					x="false";
				}
			}
		}
		System.out.println(x);
		
		

	}

}
