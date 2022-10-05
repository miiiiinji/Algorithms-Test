import java.lang.Math;

class Solution {
    public int solution(int[][] sizes) {
        
        int firstSide=0;
        int secondSide=0;
        int answer = 0;
        
        for (int[] size: sizes){
            if(firstSide<Math.max(size[0], size[1])){
                firstSide = Math.max(size[0], size[1]);
            }
            if(secondSide<Math.min(size[0], size[1])){
                secondSide = Math.min(size[0], size[1]);
            }
        }
        
        answer = firstSide*secondSide;
        return answer;
    }
}