package com.sist.lv1_0525;
import java.util.*;
class Solution {
   
        public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            if(budget<d[i]) {
                break;
            } else {
                budget =budget - d[i];
                count++;
            }
        }
        return count;
  }
}