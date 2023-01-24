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

//TC:o(log n)
//sc:o(1)
class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length-1;
        int len = citations.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            int rPapers = len - mid;
            if(citations[mid] == rPapers) return rPapers;
            else if(citations[mid] > rPapers) high = mid - 1;
            else low = mid + 1;
        }
        return len - low;
    }
}
