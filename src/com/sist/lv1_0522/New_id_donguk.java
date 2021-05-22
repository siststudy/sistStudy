package com.sist.lv1_0522;

import java.util.ArrayList;

public class New_id_donguk {
	public static void main(String[] args) {
		String answer="";
		String new_id="abcdefghijklmn.p";
		new_id=new_id.toLowerCase();//1단계
		String noText="~`!@#$%&*()+=<>,?/:;{}|";
	    String[] arr=noText.split("");
	    ArrayList list=new ArrayList();
	    
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		list.add("\\[");
		list.add("\\]");
		list.add("\"");
		list.add("\'");
		list.add("\\^");
		for(int i=0;i<list.size();i++) {//2단계
		new_id=new_id.replaceAll("["+list.get(i)+"]", "");
		}
		int count=0;
		for(int i=0; i<new_id.length();i++) {//3단계
			if(new_id.charAt(i)=='.') {
				count++;
				if(count==1) {
				answer=answer+String.valueOf(new_id.charAt(i));
				}
			}else {
					count=0;
					 answer=answer+String.valueOf(new_id.charAt(i));	
			}
		}

		if(answer.charAt(0)=='.') {//4단계
			answer=answer.substring(1);
		}else if(answer.charAt(answer.length()-1)=='.') {
			answer=answer.substring(0,answer.length()-1);
		}
		if(answer.length()==0) {//5단계
			answer="a";
		}
		if(answer.length()>=16) { //6단계
			answer=answer.substring(0,15);
			if(answer.charAt(answer.length()-1)=='.') {
				answer=answer.substring(0,answer.length()-1);
			}
		}
		while(answer.length()<=2) {//7단계
			answer+=answer.charAt(answer.length()-1);
		}
	}
}
