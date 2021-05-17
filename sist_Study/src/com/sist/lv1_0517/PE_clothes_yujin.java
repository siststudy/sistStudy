import java.util.Arrays;

public class PE_clothes_yujin {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; // 체육수업을 들을 수 있는 학생의 최댓값
        answer=n-lost.length; // 도난당한 학생수 빼기
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생이 도난 당한 경우
        for(int i=0; i<lost.length; i++)
        {
        	for(int j=0; j<reserve.length; j++)
        	{
        		if(lost[i]==reserve[j])
        		{
        			answer++; // 여벌 체육복을 가지고 있는 학생은 체육복이 한개 남아있기때문에
        			lost[i]=-1; // 도난당한 학생 목록에서 제외 시키기
        			reserve[j]=-1; // 여벌 체육복 가지고 있는 학생 목록에서 제외시키기
        			break;
        		}
        	}
        }
        
        // 도난당한 학생에게 체육복을 빌려주는 경우
        for(int i=0; i<lost.length; i++)
        {
        	for(int j=0; j<reserve.length; j++)
        	{
        		if(lost[i]+1==reserve[j] || lost[i]-1==reserve[j])
        		{
        			answer++;
        			reserve[j]=-1; // 체육복을 이미 빌려줬기 때문에 제외시키기
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
