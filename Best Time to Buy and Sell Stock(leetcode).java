class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int k = Integer.MAX_VALUE;
        int x =0;
        for(int i=0; i<n; i++){
            //checking the minimum value in the loop and updating the value of k.
                 if(k > a[i]){
                     k = a[i];
                     // now checking the maximum profit and updating the value of x.
                 }else if(a[i]-k > x )
                     x = a[i] - k;
            
        }
        
       
        
            return x;
    }
}