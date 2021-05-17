public class PE_clothes_seungjun {
	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        answer=n-lost.length;
	        for(int i=0;i<lost.length;i++){
	            for(int j=0;j<reserve.length;j++){
	                if(lost[i]-reserve[j]==1 || lost[i]-reserve[j]==-1)
	                {
	                   answer++;
	                   i++;
	                   if(i==lost.length)
	                   break;
	                }
	            }
	        }
	        return answer;
	    }
}
