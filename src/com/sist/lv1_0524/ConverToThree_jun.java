package com.sist.lv1_0524;

public class ConverToThree_jun {
	public int solution(int n) {
        String answer = "";
        // 3진법으로 변환
        while (n > 0) {
        	answer = answer + (n % 3); // 앞뒤 반전
        	n /= 3;
        }
        System.out.println(answer);
        return Integer.parseInt(answer, 3); // 10진법으로 변환
        
    }
	
	public static void main(String[] args) {
		ConverToThree_jun jin = new ConverToThree_jun();
		System.out.println(jin.solution(125));
	}
}
