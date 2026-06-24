class Solution {
    public static boolean check(int[] nums,long mid,int days){
        int dy=1;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                dy++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return dy<=days;
    }
    public int shipWithinDays(int[] nums, int days) {
        long sum=0;
        long max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(nums[i],max);
        }
        long i=max;
        long j=sum;
        long ans=0;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(check(nums,mid,days)){
                j=mid-1;
                ans=mid;
            }else{
                i=mid+1;
            }
        }
        return (int)ans;
    }
}