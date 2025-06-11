class sample {
    int nums[]={1,2,3,4,5,6,7,8};
    int tar=5;
    int mid=-1;
  public  int Binsearch(int l,int r){
    
   
    while(l<r){
         if((l+r)%2!=0)
    mid=(l+r+1)/2;
    else{
        mid=(l+r)/2;
    }
    if(nums[mid]==tar)return mid;
    else if(nums[mid]<tar)l=mid+1;
    else if(nums[mid]>tar)r=mid-1;}

    return -1;
  }
    public static void main(String [] args) {
      sample obj=new sample();

        int l=0;int r=obj.nums.length-1;
        
        int t=obj.Binsearch(l,r);
   System.out.println(t);
      }
       
    
}