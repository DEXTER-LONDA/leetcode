class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> s = new HashSet<>();
        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count=0;
            st.add(A[i]);
            s.add(B[i]);
            for(int j:st){
                if(s.contains(j))count++;
            }
            result[i]=count;
        }
        return result;
    }
}