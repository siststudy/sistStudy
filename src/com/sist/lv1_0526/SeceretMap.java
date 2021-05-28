package com.sist.lv1_0526;

import java.util.Arrays;

public class SeceretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {   
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++) {
        	answer[i]=String.format("%"+n+"s",Integer.toBinaryString(arr1[i]|arr2[i]))
        				.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}
