package com.sist.lv1_0521;
import java.util.*;
public class Failure_rate_hong {
	
	class Solution {
	    public int[] solution(int N, int[] stages) {
	        int[] answer =new int[N];
	        double[] failNum=new double[N+1];
	        double total=stages.length;//통과 스테이지 인원수 
	        double pass=0;//줄어드는 인원 수
	        ArrayList<Double> fail=new ArrayList<Double>();//실패율
	        for(int i : stages){//stage머무르는 사용자 수
	            if(i == N+1){
	                continue;
	            }
	            failNum[i]++;

	        }
	        //실패율 배열에 담기
	        for(int i=1;i<failNum.length;i++){
	            pass=failNum[i];
	            if(total==0){//사용자0=실패율0
	                failNum[i]=0;
	            }else{
	                failNum[i]=failNum[i]/total;
	                total-=pass;
	            }
	            fail.add(failNum[i]);
	        }
	    
	    //정렬
	     Collections.sort(fail,Collections.reverseOrder());
	    //배열에 넣기
	    for(int i=0;i<fail.size();i++){
	        for(int j=1;j<failNum.length;j++){
	            if(fail.get(i)==failNum[j]){
	                answer[i]=j;
	                failNum[j]=-1;
	                break;
	            }
	        }
	    }
	        return answer;
	    }
	}
}	  

