class Solution {
    public int firstMissingPositive(int[] nums) {
         int s=1;
         HashSet<Integer>hs=new HashSet<>();
         for (int i:nums)
         hs.add(i);
     
        for(int i=0;i<nums.length;i++){
            
             if (hs.contains(s)==true)
                s++;
            
             else if (hs.contains(s)==false)
                return s;}
        int max=-99999999;
        for(int i:hs){
            max=Math.max(max,i);
        }
        return max+1;
    }
}
