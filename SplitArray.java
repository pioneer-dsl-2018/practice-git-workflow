public class SplitArray {
	
	public static boolean splitArray(int[] nums) {
		return canSplit(nums, 0, 0, 0);
	}

	/**
	 * Helper function that recursively determines if the values in nums can be
	 * split into to groups, where each group sums to the same number
	 * 
	 * @param nums
	 *            numbers that have not yet been allocated to a group
	 * @param currentNumIndex
	 *            the index of the first non-allocated number
	 * @param group1Sum
	 *            running total of numbers in group 1
	 * @param group2Sum
	 *            running total of numbers in group 2
	 * @return true if each value in nums can be added to either group1Sum or
	 *         group2Sum, so that group1Sum is eventually the same as group2Sum
	 */
	private static boolean canSplit(int[] nums, int currentNumIndex, int group1Sum, int group2Sum) {
		// base case: we've advanced past the end of nums
		if (currentNumIndex == nums.length) {
			return group1Sum == group2Sum;
		}

		// pull the current element out of the array and advance the index to the next element
		int firstElement = nums[currentNumIndex];
		int newCurrentNumIndex = currentNumIndex + 1;

		// put the current element in the first group, and see if that (recursively) leads to a solution
		boolean firstGroupSolution = canSplit(nums, newCurrentNumIndex, group1Sum + firstElement, group2Sum);

		// put the current element in the second group, and see if that (recursively) leads to a solution
		boolean secondGroupSolution = canSplit(nums, newCurrentNumIndex, group1Sum, group2Sum + firstElement);

		// if we get a solution by putting the element in either of the two groups, return true
		return firstGroupSolution || secondGroupSolution;
	}
}