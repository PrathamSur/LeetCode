class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map=new HashMap<>();
        String[] st=s.split(" ");
        if(pattern.length()!=st.length) return false;

        for(int i=0;i<pattern.length();++i){
            char p = pattern.charAt(i);
            String word = st[i];
            if(!map.containsKey(p)){
                if(map.containsValue(word)) return false;
                map.put(p,word);
            }

            else{
                if(!map.get(p).equals(st[i])) return false;
            }
        }
        return true;


        
    }
}