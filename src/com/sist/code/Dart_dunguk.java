package com.sist.code;
import java.util.*;
public class Dart_dunguk {
public int solution(String dartResult) {
        
        int temp=100;//임시 
        ArrayList<Integer> list =new ArrayList<Integer>();
			for(int i=0; i<dartResult.length();i++) {
				try {
					String a=String.valueOf(dartResult.charAt(i));
					Integer.parseInt(a);
					if(temp+1 == i ) { //연속된 두숫자면 제거 예)10
						continue;
					}
					temp=i;
					list.add(i);
					if(list.size() == 3) { //subString 을 위한 숫자추출
						list.add(dartResult.length());
						break;
					}
					
				}catch (Exception e) {
					continue;
				}
			}
			String[] arr= new String[3];
			int result=0;
			int[] arr2= new int[3];
		for(int i=0; i<3; i++) {
        	arr[i]=(dartResult.substring(list.get(i),list.get(i+1)));
        	int num=Integer.parseInt(arr[i].replaceAll("[^0-9]", ""));
        	if(arr[i].contains("D")) {
        		num=num*num;
        	}else if(arr[i].contains("T")){
        		num=num*num*num;
        	}
        	if(arr[i].contains("*")) {
        		if(i != 0) {
        			arr2[i-1]*=2;
        			num*=2;
        		}else {
        			num*=2;
        		}
        	}else if(arr[i].contains("#")) {
        		num=num*-1;
        	}
        	arr2[i]=num;
        	
        }

		return arr2[0]+arr2[1]+arr2[2];
        
    }
}
