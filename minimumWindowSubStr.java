class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> hash = new HashMap<Character, Integer>();
        int counter =0;
        int resLength=Integer.MAX_VALUE;
        for(char c : t.toCharArray() )
        {
            if(hash.containsKey(c))
                hash.put(c,hash.get(c) + 1);
            else {
                 hash.put(c,1);
                counter++;
                  }
        }

        int start=0,end=0;
        String result = "";
        String temp ="";

        while(end<s.length()){
            char endChar = s.charAt(end);
            if(hash.containsKey(endChar))
            {
                hash.put(endChar,hash.get(endChar)-1);
                if(hash.get(endChar)==0)
                    counter--;
            }

            while(counter==0)
               {
                   temp = s.substring(start,end+1);
                   if(temp.length()<resLength)
                   {
                       result= temp;
                       resLength=result.length();
                   }
                   char startChar = s.charAt(start);
                   if(hash.containsKey(startChar))
                   {
                       hash.put(startChar,hash.get(startChar) + 1);
                       if(hash.get(startChar)>0)
                           counter++;
                   }
                        start++;
               }
            end++;
        }
        return result;
    }
}
