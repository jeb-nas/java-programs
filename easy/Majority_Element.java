class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>(n/2)){
                return i;
            }
        }
        return 0;
    }
}
