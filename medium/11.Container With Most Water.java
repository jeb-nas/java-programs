class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int  r=h.length-1;
         
         int mar=0;
         while (l<r){
           int  minh=Math.min(h[l],h[r]);
            
            mar=Math.max(minh*(r-l),mar);

            if(h[l]<h[r])   
                l+=1;
            else
                r-=1;}
         return mar;
    }
}
