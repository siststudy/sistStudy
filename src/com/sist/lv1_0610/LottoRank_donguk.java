package com.sist.lv1_0610;

public class LottoRank_donguk {
	 public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
		        int count=0;
		        int zCount=0;
		        for(int i=0;i<lottos.length; i++){
		        	if(lottos[i] == 0)	
	                    zCount++;
		            for(int j=0;j<win_nums.length; j++){
		                if(lottos[i] == win_nums[j]){
		                    count++;
		                }
		            }
		        }

		        int[] arr={6,6,5,4,3,2,1};
		        answer[0]=arr[count+zCount];
		        answer[1]=arr[count];
	        return answer;
	    }
}
