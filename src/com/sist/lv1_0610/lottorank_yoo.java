package com.sist.lv1_0610;
import java.util.*;
public class lottorank_yoo {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt=0;
        for(int i: lottos) {
        	for(int j:win_nums) {
        		if(i==j) cnt++;
        	}
        }
        
        answer[0]=7-(cnt+Collections.frequency(Arrays.asList(lottos),0))>6?6:7-(cnt+Collections.frequency(Arrays.asList(lottos),0));
        answer[1]=7-cnt<5?7-cnt:6;
        return answer;
	}
    public static void main(String[] args) {
		lottorank_yoo l =  new lottorank_yoo();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] wins = {31, 10, 45, 1, 6, 1};
		System.out.println(l.solution(lottos, wins)[0]);
	}
}
