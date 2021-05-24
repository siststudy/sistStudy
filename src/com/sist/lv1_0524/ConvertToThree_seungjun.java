import java.util.*;
package com.sist.lv1_0524;

public class ConvertToThree_seungjun {
	public int solution(int n) {
        int answer = 0;
        List<Integer> list=new ArrayList<Integer>
            
        while(n>0)
        {
            if(n%3 == 0)
            {
                list.add(0);
            }
            else if(n%3 == 1)
            {   
                list.add(1);
            }
            else if(n%3 == 2)
            {   
                list.add(2);
            }
                
            n/=3;
        }
        int m=1;
        for(int i=list.size()-1;i>=0;i--)
        {
            answer=list.get(i)*m;
            m*=3;
        }
        return answer;
    }
}
