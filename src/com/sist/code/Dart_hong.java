package com.sist.code;

public class Dart_hong {
	class Solution {
	    public int solution(String dartResult) {
	    	        int answer = 0;
	    	        int n = 0, index = 0, jumsu = 0;
	    	        int[] score = new int[3]; // 각 단계별 획득 점수
	    	 
	    	        for (int i = 0; i < dartResult.length(); i++) {
	    	            char c = dartResult.charAt(i); //문자 반환
	    	 
	    	            //점수
	    	            if (Character.isDigit(c)) { //입력받은 문자열이 숫자인지 판별
	    	                n = 0;
	    	                if (c == '1' && dartResult.charAt(i + 1) == '0') {
	    	                    n = 10;
	    	                    i++; // 인덱스 다음으로 증가
	    	                } else {
	    	                    n = Character.getNumericValue(c); //숫자로된 char->int로변경
	    	                }
	    	                
	    	                jumsu++;
	    	                
	    	            //점수와 옵션
	    	            } else {
	    	                switch (c) {
	    	                case 'S':
	    	                    score[index++] = (int) Math.pow(n, 1);//1제곱
	    	                    break;
	    	                    
	    	                case 'D':
	    	                    score[index++] = (int) Math.pow(n, 2);//2제곱
	    	                    break;
	    	                    
	    	                case 'T':
	    	                    score[index++] = (int) Math.pow(n, 3);//3제곱
	    	                    break;
	    	                    
	    	                case '*':// 스타상 : 바로 전에 얻은 점수를 각 2배    
	    	                    index = index - 2 < 0 ? 0 : index - 2;
	    	                    while (index < jumsu) {
	    	                        score[index++] *= 2;
	    	                    }
	    	                    n = 0;
	    	                    break;
	    	                    
	    	                case '#': // 아차상 : 해당 점수는 마이너스-1배
	    	                    score[index-1] *= -1;    
	    	                    n = 0;
	    	                    break;
	    	                }
	    	            }
	    	        }
	    	        
	    	        for (int i : score) {
	    	            answer += i;
	    	        }
	    	 
	    	        return answer;
	    	    }
	    	}
}
