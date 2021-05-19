package src.com.sist.lv1_0518;

public class test_exam_seungjun {
	public int[] solution(int[] answers) {        
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        int s1=0;
        int s2=0;
        int s3=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==n1[i%5]) 
            	s1++;
            if(answers[i]==n2[i%8]) 
            	s2++;
            if(answers[i]==n3[i%10]) 
            	s3++;
        }
        if(s1==s2 && s2==s3){
            int answer[] = {1,2,3};
            return answer;
        } 
        else if(s1==s2 && s3<s1){
            int answer[] = {1,2};
            return answer;
        }
        else if(s2==s3 && s1<s2){
            int answer[] = {2,3};
            return answer;
        }
        else if(s1==s3 && s2<s1){
            int answer[] = {1,3};
            return answer;
        }
        else if(s1>s2 && s3<s1){
            int answer[] = {1};
            return answer;
        }
        else if(s1<s2 && s3<s2){
            int answer[] = {2};
            return answer;
        }
        else if(s1<s3 && s3>s2){
            int answer[] = {3};
            return answer;
        }
        else{
            int answer[] = {0};
            return answer;
        }
    }
}
