package com.sist.lv1_0526;

public class Treasure_hunt_donguk {
	public String[] solution(int n, int[] arr1, int[] arr2) {   
        String[] answer = new String[n];
         for(int i=0; i<n; i++) {  
             int row1=arr1[i];
             int row2=arr2[i];
             answer[i]="";
             int count=n;
             while(count>0){
            	 if(row1%2==1 || row2%2==1){ //맨뒤부터 확인
            		 answer[i]+="#";
            	 }else{                        //자리수가 없거나 0이면
            		 answer[i]+=" ";
            	 }
              row1=row1/2;
              row2=row2/2;
              count--;
         	}
            answer[i]=new StringBuffer(answer[i]).reverse().toString();//뒤집기
         }
        return answer;
    }
}
