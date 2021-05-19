package com.sist.lv1_0519;
import java.util.*;

public class Find_kim_yoo {
	   public String solution(String[] seoul) {
    	List<String> list = Arrays.asList(seoul);  //array to list
        int idx = list.indexOf("Kim");        
        return "김서방은 "+idx+"에 있다";
    }
}
