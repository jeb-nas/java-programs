class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        
        double ar[]=new double[m+n];
        int  k=0;
        for(int i=0;i<m;i++)
            ar[k++]=nums1[i];
        for(int i=0;i<n;i++)
            ar[k++]=nums2[i];
        Arrays.sort(ar);
        int mid=ar.length/2;
        if(ar.length%2!=0)
            return ar[mid];
        else
            return (ar[mid-1]+ar[mid])/2;
    }
}
