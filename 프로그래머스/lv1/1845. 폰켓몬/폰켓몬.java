import java.lang.Math;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(Integer monster:nums){
            set.add(monster);
        }
        
        answer = Math.min(nums.length/2, set.size());
        
        
        return answer;
    }
}