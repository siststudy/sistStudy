package src.com.sist.lv1_0519;

public class Find_Kim_seungjun {
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0;i<seoul.length;i++)
        {
            if(seoul[i].equals("Kim"))
            {
                answer="김서방은 "+i+"에 있다";
                break;
            }
        }
        
        return answer;
    }
}
