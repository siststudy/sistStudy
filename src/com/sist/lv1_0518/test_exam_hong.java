package com.sist.lv1_0518;
import java.util.*;
public class test_exam_hong {
	
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] s1={1,2,3,4,5};
	        int[] s2={2,1,2,3,2,4,2,5};
	        int[] s3={3,3,1,1,2,2,4,4,5,5};
	        int count1=0;
	        int count2=0;
	        int count3=0;
	        
	        /*
	        //정답확인
	        for(int i=0;i<answer.length;i++){
	            if(s1[i]==answers[i]){
	                count1++;
	            }
	            if(s2[i]==answers[i]){
	                count2++;
	            }
	            if(s3[i]==answers[i]){
	                count3++;
	            }
	            
	        }*/
	        for(int i=0;i<answers.length;i++){
	              if(s1[i%s1.length] == answers[i]){
	                  count1++;
	            }
	            if(s2[i%s2.length] == answers[i]){
	                  count2++;
	            }
	            if(s3[i%s3.length] == answers[i]){ 
	                  count3++;
	            }
	        }
	        
	        //갯수비교
	       int max=Math.max(Math.max(count1,count2),count3);
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        if(max==count1) 
	            list.add(1);
	        if(max==count2)
	            list.add(2);
	        if(max==count3)
	            list.add(3);
	        
	        answer=new int[list.size()];
	        
	        //값넣기
	        for( int i=0;i<answer.length;i++){
	            answer[i]=list.get(i);
	        }
	             return answer;
	        
	    }
	       
	}    

}
