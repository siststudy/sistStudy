package com.sist.lv1_0521;
import java.util.*;
public class Failure_rate_donguk {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
	        ArrayList list=new ArrayList();
	        for(int i=0;i<stages.length;i++){
	            list.add(stages[i]);
	        }
	        list.sort(null);
	        ArrayList sList=new ArrayList();
	        Map map=new HashMap();
	        for(int i=1;i<=N;i++){
	            int count=0;
	               while((int)list.get(0)==i){ //같은 수 세서 비율 구하기
	                    count++;
	                    list.remove(0);
                      if(list.size()==0)break;
	                }
	            
	            map.put(i,(double)count/(list.size()+count));
	        }
	    	for(int i=1; i<=map.size(); i++) { //map의 key를 이용하여 List에 추가
	    		if(sList.size()==0) { 
	    			sList.add(1);
	    		}else {
	    			for(int j=0; j<sList.size();j++) {
	    				System.out.println(i+";"+j);
	    				if((double)map.get(i)>(double)map.get(sList.get(j))) { //큰수이면 앞에 두기
	    					sList.add(j,i);
	    					break;
	    					
	    				}else if(j==sList.size()-1) {//비교대상이 가장 끝일때 맨뒤에 추가
	    					sList.add(i);
	    					break;
	    				}
	    				
	    			}
	    		}
	    	}
	    	for(int i=0; i<sList.size();i++) {
	    		answer[i]=(int)sList.get(i);
	    	}
       return answer;
   }
}
