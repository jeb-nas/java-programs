class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums)
        hs.add(i);
       int  hsize=hs.size();
        if(hsize==nums.length)
        return false;
        return true;
    }
}
