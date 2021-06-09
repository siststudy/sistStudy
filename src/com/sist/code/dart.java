package com.sist.code;

import java.util.Arrays;

public class dart {
	public int solution(String dartResult) {
        int answer = 0;
        String[] temp = dartResult.split("\\D");
        String[] numbers = new String[3];
        String[] bonus = dartResult.replaceAll("[0-9]","").split("");
        int[] results = new int[3];
        int cnt=0,n=0;
        for(int i=0;i<temp.length;i++) {
        	System.out.println(temp[i].length());
        	if(temp[i].length()>=1) {
        		numbers[n]=temp[i];
        		n++;
        	}
        	
        }
        for(int i=0;i<bonus.length;i++) {
        	switch(bonus[i]) {
            case "S" :
            	results[cnt]=Integer.parseInt(numbers[cnt]);
            	cnt++;
                break;
            case "D" :
            	results[cnt]=(int) Math.pow(Integer.parseInt(numbers[cnt]),2);
            	cnt++;
                break;
            case "T" :
            	results[cnt]=(int) Math.pow(Integer.parseInt(numbers[cnt]),3);
            	cnt++;
                break;
            case "*" :
            	results[cnt-1]*=2;
            	if (i-2 >= 0) {
                    results[cnt-2] *= 2;
                }
                break;
            case "#" :
            	results[cnt-1]*=-1;
                break;
        	}

        }
       
        for(int i:results) {
        	System.out.println(i);
        	answer+=i;
        }
        // split 2
        // math.pow밑, 지수
        // 보너스   * = *-1,*-2 2배 / # *-1 마이너스
        
        
        return answer;
    }
	public static void main(String[] args) {
		dart d = new dart();
		System.out.println(d.solution("1D2S#10S"));
	}

}
