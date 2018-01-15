class Solution {
  public List<Integer> findAnagrams(String s, String p) {

    Map<Character, Integer> hash = new HashMap<Character, Integer>();
    List<Integer> result = new ArrayList<Integer>();
    int pLen = p.length();
    int start =0, end=pLen-1, counter=0;
    if(s.length() < p.length())
    return result;

    for(char c : p.toCharArray())
    {
      if(hash.containsKey(c))
      hash.put(c, hash.get(c) +1);
      else
      {hash.put(c,1);
        counter++;
      }
    }

    for(int i=0; i<pLen;i++)
    {
      if(hash.containsKey(s.charAt(i)))
      {hash.put(s.charAt(i), hash.get(s.charAt(i)) -1);
        if(hash.get(s.charAt(i)) == 0)
        counter--;
      }
    }
    if(counter==0)
    result.add(0);

    while(end<s.length()-1){

      if(hash.containsKey(s.charAt(start))){
        hash.put(s.charAt(start), hash.get(s.charAt(start)) + 1);
        if(hash.get(s.charAt(start))>0)
        counter++;
      }


      start++;
      end++;
      if(hash.containsKey(s.charAt(end))){
        hash.put(s.charAt(end), hash.get(s.charAt(end)) - 1);
        if(hash.get(s.charAt(end)) == 0)
        counter--;
      }


      if(counter==0)
      result.add(start);
    }

    return result;
  }
}
