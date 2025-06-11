class Sample{
    public static void main(String [] args){
        int ar[]={6,8,10,11,2,1};
        int k=0;
        
        for(int i=0;i<ar.length-1;i++){
            int small=Integer.MAX_VALUE;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<small){
                    small=ar[j];
                   k=j;
                    
                }
            }
            int temp=small;
                                ar[k]=ar[i];
                    ar[i]=temp;
        } 
      for(int i:ar){
        System.out.print(" "+i);
      }     
}}
