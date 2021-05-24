package com.sist.lv1_0524;

public class ConvertToThree_donguk {
	public int solution(int n) {
        int answer = 0;
        int number=0;
        String strnum="";
        while(n>=3){
            number=n%3;
            strnum+=String.valueOf(number);
            n=n/3;
        }
        strnum+=String.valueOf(n);
        boolean bCheck=true;
        int i=strnum.length();
        int hammer=1;
        while(bCheck){
            answer+=Character.getNumericValue(strnum.charAt(i-1))*hammer;
            hammer=hammer*3;
            i--;
            if(i==0)
                break;
        }
        
        
        return answer;
    }
}
