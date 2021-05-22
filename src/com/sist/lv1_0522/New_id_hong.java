package com.sist.lv1_0522;

public class New_id_hong {
	class Solution {
	    public String solution(String new_id) {
	        String answer="";
			// 1단계
			new_id = new_id.toLowerCase();

			// 2단계
			String id = "";
			for(int i = 0; i < new_id.length(); i++) {
				char dan2 = new_id.charAt(i);
				if(dan2 >= 'a' && dan2 <= 'z') {
					id += String.valueOf(dan2);
				} else if(dan2 >= '0' && dan2 <= '9') {
					id += String.valueOf(dan2);
				} else if(dan2 == '.' || dan2 == '-' || dan2 == '_') {
					id += String.valueOf(dan2);
				}
			}

			// 3단계
			for(int i = 0; i < id.length(); i++) {
				if(id.charAt(i) == '.') {
					int j = i+1;
					String jum = ".";

					while(j != id.length() && id.charAt(j) == '.') {
						jum += ".";
						j++;
					}

					if(jum.length() > 1)
						id = id.replace(jum, ".");
				}
			}

			// 4단계
			if(id.startsWith(".") ) {
				id = id.substring(1, id.length());
			} else if(id.endsWith(".")) {
				id = id.substring(0, id.length()-1);
			}

			// 5단계
			if(id.length() == 0) {
				id += "a";
			}

			// 6단계
			if(id.length() >= 16) {
				id = id.substring(0, 15);
			}
			if(id.endsWith(".")) {
				id = id.substring(0, id.length()-1);
			}

			// 7단계
			String last = id.charAt(id.length()-1) + "";
			if(id.length() == 2) {
				id = id + last;
			} else if(id.length() == 1) {
				id = id + last + last;
			}
	        answer=id;
			return answer;
	    }
	}
}
