class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> temp = null;
    for(int i=0;i<nums.length;i++){
      int j=i+1, k= (nums.length) -1;
      while(j<k)
      {
        if((nums[j]+nums[k]) > -nums[i])
        k--;


        else if ((nums[j]+nums[k]) == -nums[i]){
          temp = new ArrayList<Integer>();
          temp.add(nums[i]);
          temp.add(nums[j]);
          temp.add(nums[k]);
          result.add(temp);
          if(nums[j]==nums[j+1])  {
            while(j<(nums.length-1 ) && nums[j]==nums[j+1])
            j++;}


            if(nums[k]==nums[k-1])    {
              while(k>0 && nums[k]==nums[k-1])
              k--;}
              j++;
              k--;


            }

            else
            j++;



          }
          while(i<(nums.length-1 ) && nums[i]==nums[i+1])
          i++;

        }
        return result;
      }
    }
