package com.sist.lv1_0610;

public class LottoRank_hong {
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	       int[] answer = {};
			        int max=0;
			        int zero=0;
			        int[] result=new int[2];
			         for(int i=0;i<lottos.length;i++){
			        	if(lottos[i]==0){
			        		zero++;
			        		continue;
			        	}
			        	for(int j=0;j<win_nums.length;j++){
			        		if(lottos[i]==win_nums[j]){
			        			max++;
			        			break;
			        		}
			        	}
			        	
			        }
			        result[0]=max+zero;
			        result[1]=max;
			        System.out.println(result[0]);
			        System.out.println(result[1]);
			        for(int i=0;i<2;i++){
				        switch(result[i]){
				        case 6:
				        	result[i]=1;
				        	break;
				        case 5:
				        	result[i]=2;
				        	break;
				        case 4:
				        	result[i]=3;
				        	break;
				        case 3:
				        	result[i]=4;
				        	break;
				        case 2:
				        	result[i]=5;
				        	break;
				        default:
				        	result[i]=6;
				        	break;
				        }
			        	
			        }
			        	
			        
			        return result;
			    	    }
			    	}


}
