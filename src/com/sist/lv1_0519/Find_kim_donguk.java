package com.sist.lv1_0519;

public class Find_kim_donguk {
	public String solution(String[] seoul) {
        String answer = "";
        int count=0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                count=i;
                break;
            }
        }
        
        answer="김서방은 "+count+"에 있다";
        return answer;
    }
}
