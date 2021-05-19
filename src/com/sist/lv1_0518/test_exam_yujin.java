package com.sist.lv1_0518;

import java.util.*;

public class test_exam_yujin {
	 public int[] solution(int[] answers) {
			int[] answer= {};
			
			int[] a1 = {1,2,3,4,5};
			int[] a2 = {2, 1, 2, 3, 2, 4, 2, 5};
			int[] a3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
			
			int sol1=0;
	        int sol2=0;
	        int sol3=0;
			
			for(int i=0; i<answers.length; i++) // 정답과 비교하여 맞은것이 있다면
			{
				if(answers[i]==a1[i%a1.length])
				{
					sol1++;
				}
				if(answers[i]==a2[i%a2.length])
				{
					sol2++;
				}
				if(answers[i]==a3[i%a3.length])
				{
					sol3++;
				}
			}
			
			List<Integer> list=new ArrayList<Integer>(); // 최대값 비교
			int max=Math.max(Math.max(sol1, sol2),sol3);
			
			if(max==sol1) 
			{
				list.add(1);
			}
			if(max==sol2)
			{	
				list.add(2);
			}
			if(max==sol3)
			{
				list.add(3);
			}
			
			Collections.sort(list); // 오름차순 정리
			answer=new int[list.size()];
			
			for(int i=0; i<answer.length; i++)
			{
				answer[i]=list.get(i);
			}
			
			return answer;
		}
}
