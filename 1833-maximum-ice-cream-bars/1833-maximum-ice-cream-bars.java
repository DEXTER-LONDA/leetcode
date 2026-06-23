class Solution {
    public int maxIceCream(int[] nums, int coins) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0 && coins>=i){
                coins=coins-i;
                count++;
                arr[i]--;
            }
        }
        return count;
    }
}