package com.sist.lv1_0519;

import java.util.Arrays;
import java.util.List;

public class Find_kim_Junho {
	   public String solution(String[] seoul) {
	        
	    	List<String> arrList = Arrays.asList(seoul);
	        int index = arrList.indexOf("Kim");        
	        String answer = "김서방은 " + index + "에 있다";
	        
	        
	        
	        return answer;
	        
	        
	        
	    }
}
