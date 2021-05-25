package com.sist.lv1_0525;

import java.util.Arrays;

public class Budget_yoo {
	public int solution(int[] d, int budget) {
        int answer=0,cnt=0;
        Arrays.sort(d);
        for(int i:d) {
        	if(answer+i>budget) break;
        	answer+=i; cnt++;
        }
        return cnt;
    }
}
