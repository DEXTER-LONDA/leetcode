class Solution {
    public static boolean check(int[] nums,int mid,int h){
        int hr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid!=0){
                hr+=(nums[i]/mid)+1;
            }else{
                hr+=nums[i]/mid;
            }
        }
        return h-hr>=0;
    }
    public int minEatingSpeed(int[] nums, int h) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int i=1;
        int j=max;
        int ans=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(check(nums,mid,h)){
                j=mid-1;
                ans=mid;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
}