package com.sist.lv1_0524;

public class ConvertToThree_yoo {
	class Solution {
		public int solution(int n) {
			String sb = new StringBuffer(Integer.toString(n,3)).reverse().toString();
		    return Integer.parseInt(sb,3);
	    }
	}
}
