
public class PE_clothes_yoojeong {
	import java.util.*;
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	       int answer = 0;
	        int count = 0;
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        if(n<=30 && n>=2){
	        for(int i=0; i<lost.length; i++){//뺏김
	            for(int j=0; j<reserve.length; j++){
	                if(lost[i]==reserve[j]){
	                    lost[i]=0;
	                    reserve[j]=0;
	                    break;
	                }
	            }
	        }
	        for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if(lost[i]==0) break;
	                else if(reserve[j]!=0 && reserve[j]==lost[i]-1){//-1값 빌려줌
	                    lost[i]=0;
	                    reserve[j]=0;
	                    break;
	                }
	                else if(reserve[j]!=0 && reserve[j]==lost[i]+1){//+1값 빌려줌
	                    lost[i]=0;
	                    reserve[j]=0;
	                    break;
	                }
	            }
	         }
	        }
	        for(int i=0; i<lost.length; i++){//못빌린애 갯수
	            if(lost[i]!=0) count++;
	        }
	        answer = n-count;
	        return answer;
	    }
	}
}
