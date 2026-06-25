class Solution {
    public static int val(char ch){
        if(ch>='a' && ch<='z') return 1;
        if(ch>='A' && ch<='Z') return 2;
        if(ch>='0' && ch<='9') return 3;
        return 5;
    }
    public int passwordStrength(String password) {
        int strength=0;
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<password.length();i++){
            if(!st.contains(password.charAt(i))){
                strength+=val(password.charAt(i));
                st.add(password.charAt(i));
            }
            
        }
        return strength;
    }
}