package com.sist.lv1_0519;

public class Find_kim_hong {
	class Solution {
	    public String solution(String[] seoul) {
	        String answer="";
	 for(int i=0;i<seoul.length;i++){
	if(seoul[i].equals("Kim")){
	answer="김서방은 "+i+"에 있다";
	   
	}
	}
	        return answer;
	    }

	}
}
