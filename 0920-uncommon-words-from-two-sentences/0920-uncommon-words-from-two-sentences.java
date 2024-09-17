class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> str =new  ArrayList<>(Arrays.asList(s1.split("\\s")));
        Map<String,Integer> map =new HashMap<>();
        for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        str =new  ArrayList<>(Arrays.asList(s2.split("\\s")));
         for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        str.clear();
        System.out.println(map);

        for(Map.Entry<String,Integer> en:map.entrySet()){
            if(en.getValue()==1)str.add(en.getKey());
        }
        System.out.println(str);
        String[] result = new String[str.size()];
        int i=0;
        for(String s:str){
            result[i++]=s;
        }
        return result;
    }
}