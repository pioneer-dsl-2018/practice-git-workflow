//my solution may be complicated. It passes all the tests on the codingbat, except for the "other tests" section.
//first find the half sum of the array. If the sum cannot divided by two, then return false directly
//then sort the array, if there are same numbers, make them 0, and subtract that number from half sum.(cleanNumbers method)
//at last, use recursion(check method)to deal with the rest.
//if the number is smaller than half-sum, add to group1, and check whether the numbers can be added to half-sum
public boolean splitArray(int[] nums) {
        Arrays.sort(nums);//sort for the first time
        int sum = getSum(0,nums,0);
        int halfSum = sum/2;
        nums = cleanNumbers(nums,0,halfSum);
        Arrays.sort(nums);//sort second time
        sum = getSum(0,nums,0);
        if(nums.length==0)//an empty array will return true
        return true;
        if(sum%2!=0)
        return false;
        return checker(sum/2,0,nums,0);
    }   
    
    //this method returns the sum of the array
    public int getSum(int sum, int[]nums, int index){
        if(index==nums.length)//avoid index out of bounds exception
        return sum;
        sum = sum + nums[index];
        return getSum(sum, nums, index+1);//inrease the index by 1
    }
    
    //this method is the main body of recursion
    public boolean checker(int halfsum, int group1, int[] numbers,int index){
        if(index<numbers.length-1){//avoid index out of bound exception
        if((group1+numbers[index])==halfsum)
            return true; 
        if((group1+numbers[index])<halfsum)
            return checker(halfsum, group1+numbers[index], numbers, index+1);//repeat this procedure
        }
            return false;
    }
    //this method returns a "cleaned" array. 
public int[] cleanNumbers(int[] numbers, int index, int halfsum){
    if(index<numbers.length-1){
    if(numbers[index]==numbers[index+1]){
        halfsum=halfsum-numbers[index];
        numbers[index]=0;
        numbers[index+1]=0;
    }
    return cleanNumbers(numbers, index+1,halfsum);//repeat this procedure
}
return numbers;
}
