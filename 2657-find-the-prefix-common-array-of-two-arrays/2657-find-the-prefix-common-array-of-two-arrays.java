class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] check = new int[A.length];
        int[] result = new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(check[A[i]-1]!=0){
                count++;
            }else{
                check[A[i]-1]=A[i];
            }
            if(check[B[i]-1]!=0){
                count++;
            }else{
                check[B[i]-1]=B[i];
            }
            result[i]=count;
        }
        return result;
    }
}