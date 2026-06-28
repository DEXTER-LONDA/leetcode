class Solution {
    public int compareBitonicSums(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long preFix=0;
        long postFix=0;
        while(i<nums.length-1 || j>0){
            if(nums[i]<nums[i+1]) preFix+=nums[i];
            if(nums[j]<nums[j-1]) postFix+=nums[j];
            i++;
            j--;
        }
        if(preFix==postFix) return -1;
        if(preFix>postFix) return 0;
        return 1;
    }
}