package com.sist.lv1_0517;

public class PE_clothes_douguk {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer=n-lost.length;
        int num=0;
        for(int i=0; i<reserve.length; i++){ 
            for(int j=num; j<lost.length; j++){
                
                if(Math.abs(reserve[i]-lost[j])<=1){
                    answer++;
                    i++;
                    num++;
                    if(i==reserve.length)
                        break;
                }    
                
            }
        }
        return answer;
    }
}
