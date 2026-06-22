class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int max=Integer.MAX_VALUE;
        for(char ch:mp.keySet()){
            if(!m.containsKey(ch)){
                return 0;
            }else{
                max=Math.min(m.get(ch)/mp.get(ch),max);
            }
        }
        return max;
    }
}