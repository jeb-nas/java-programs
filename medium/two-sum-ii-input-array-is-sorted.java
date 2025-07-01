//two pointer approach
class Solution {
    public int[] twoSum(int[] n, int target) {
        
        int i=0;int j=n.length-1;
        int sum=0;
        while(i<j){
            sum=n[i]+n[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
        }
        else{
            int ind1=i;
            int ind2=j;
         return new int[]{ind1+1,ind2+1};
        }
        }

return new int[]{};
    }
}
