class Solution {
    public static int check(int mid,int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                n=n-(nums[i]/mid);
            }else{
                n=n-(nums[i]/mid)-1;
            }
        }
        return n;
    }
    public int minimizedMaximum(int n, int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int i=1;
        int j=max;
        while(i<=j){
            int mid=i+(j-i)/2;
            int rem=check(mid,n,nums);
            if(rem>=0){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return i;
    }
}