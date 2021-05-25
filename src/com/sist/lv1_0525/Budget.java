package com.sist.lv1_0525;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        for(int i=0; i<d.length;i++){ //정렬
            for(int j=i+1; j<d.length;j++){
                if(d[i]>d[j]){
                int temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        for(int i=0;i<d.length;i++){ //빼기
            budget=budget-d[i];
            answer=i+1;
                if(budget<0){
                    answer--;
                    break;
                }
                if(budget==0){
                    
                    break;
                }
        }
    
        return answer;
    }
}
