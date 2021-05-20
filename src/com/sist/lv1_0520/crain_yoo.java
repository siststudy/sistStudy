package com.sist.lv1_0520;
import java.util.*;
public class crain_yoo {
    public static int solution(int[][] board, int[] moves) {
    	List<Integer> answer = new ArrayList<Integer>();
        int count = 0;
        for(int m:moves) {
        	for(int[] r:board) {
        		if(r[m-1]!=0) {
        			answer.add(r[m-1]);
        			r[m-1]=0;
        			try {
        				if(answer.get(answer.size()-1)==answer.get(answer.size()-2)) {
        				count+=2;
        				answer=answer.subList(0,answer.size()-2);
        				}
        			}catch (Exception e) {}
        			break;
        		}
        	}
        }
        return count;
    }
}
