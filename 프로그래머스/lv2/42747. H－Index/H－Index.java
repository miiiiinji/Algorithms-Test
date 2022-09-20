import java.lang.*;

class Solution {
    
    int h = 0;
    public int solution(int[] citations) {
     
        for(int i=0;i<citations.length;i++){ 
        int k = citations[i]; 
        int n = 0; 
            
            if(k<h){
                continue;
            }
            
            for(int j=0;j<citations.length;j++){ 

                if(citations[j]>=k){
                    n++;
                }                
            } 
            if(n>h){
            h = Math.min(k,n); 
            }
                        
        }
                
        return h;
    }
}