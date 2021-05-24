package com.sist.lv1_0523;

public class Pocketmon_donguk {
	 public int solution(int[] nums) {
	        int answer = 0;
	        int count=1;
	        for(int i=0; i<nums.length-1;i++){
	            for(int j=i+1; j<nums.length;j++){
	                if(nums[i]>nums[j]){
	                    int temp=nums[i];
	                    nums[i]=nums[j];
	                    nums[j]=temp;
	                }
	            }
	        }
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i]!=nums[i+1]){
	            count++;
	            }
	        }
	        if(nums.length/2<=count){
	            answer=nums.length/2;
	        }else{
	            answer=count;
	        }
	        return answer;
	    }
}
