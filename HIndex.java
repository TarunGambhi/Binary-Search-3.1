//https://leetcode.com/problems/h-index-ii
//TC:o(n)
//sc:o(1)

class Solution {
    public int hIndex(int[] citations) {
        int rPapers =citations.length;
        for(int i=0; i<citations.length; i++){
            if(citations[i]>= rPapers){
                return rPapers;
            }
            rPapers--;
        }
        return 0;
    }
}
