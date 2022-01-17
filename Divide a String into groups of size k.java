class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size =0;
        // finding the size of the groups which will contain k elements
        if(n % k ==0){
            size = n/k;
        }else {
            size = n/k + 1;
        
        }
        
        String [] r = new String[size];
        int index =0; 
        //checking for every 1 group of size k
        for(int i=0; i <n; i+=k){
            String l = "";
            // filling the group by k elements till the length of string and adding to l by using substring
            if(i+k < n){
               l = s.substring(i,i+k);
               // for the remaining elements which is extra after the multiple of groups we fill that unless an 
               // until the group becomes of size k
                l =s.substring(i);
                while(l.length() != k){
                    l+=fill;
                }
            }
            // now return the array r which store l.
            r[index++] = l;
            
        }
        return r;
        
    }
}