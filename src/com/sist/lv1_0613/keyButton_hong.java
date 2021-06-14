package com.sist.lv1_0613;

public class keyButton_hong {
	class Solution {
	    public String solution(int[] numbers, String hand) {
			StringBuilder sb = new StringBuilder();//문자열 더할ㄸ ㅐ 새로운 객체 생성하는 것이 아니라 기존의 데이터 더하는 방식 사용(속도빠름)
			int left=10, right=12;//*=10, #=12
			int Llocatin, Rlocation;
			for(int n : numbers) {
				Llocatin = 0; Rlocation = 0;
				if(n == 1 || n == 4 || n == 7) {
					sb.append("L");
					left = n;
				
				}else if(n == 3 || n == 6 || n == 9) {
					sb.append("R");
					right = n;
				
				}else {
					if(n==0) n += 11;
					Llocatin = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
					Rlocation = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
					if(Llocatin == Rlocation) {
						if(hand.equals("right")) {
							sb.append("R");
							right = n;
						}else {
							sb.append("L");
							left = n;
						}
					}else if(Llocatin > Rlocation) {
						sb.append("R");
						right = n;
					}else {
						sb.append("L");
						left = n;
					}
				}
			}	
			return sb.toString();
	    }
	}
}
