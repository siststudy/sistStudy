package com.sist.lv1_0524;

public class three_yoo {
	class Solution {
		public int solution(int n) {
	        StringBuilder sb = new StringBuilder();
		    while(n>0){  // 3진법+뒤집기
		        sb.append(n%3);
		        n/=3;
		    }
		    return Integer.parseInt(sb.toString(),3); // 10진수로 변환
	    }
	}
}
