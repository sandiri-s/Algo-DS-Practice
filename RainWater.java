class RainWater {
    public int trap(int[] height) {
    Set<Integer> heights = new HashSet<Integer>();
    int    tempMax=0;
for( int i=0; i<height.length;i++)
{
    if(height[i]>tempMax)
        tempMax= height[i];
}
int sum=0;
for(int each=1;each<=tempMax; each++){
    int fp=0;
    int sp=0;
    int tempSum=0;
    while(height[fp]!=each){
            fp++;
        }
    fp++;
    while(fp<=(height.length-1))
    {
       if(height[fp]<each)
       {
           tempSum += 1;
            fp++;
       }
       else
       {
           sum+= tempSum;
           tempSum =0;
               while(  (fp<=(height.length-1))   && (height[fp]!=each)){
            fp++;
        }
           fp++;
       }

    }
}
return sum;
}
}
