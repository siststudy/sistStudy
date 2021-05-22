package com.sist.lv1_0522;

public class New_id_jun {
	class Solution {
	    public String solution(String new_id) {
	    	//1
	    	 String id = new_id.toLowerCase();
	    	 //2,3,4
	         id = id.replaceAll("[^-_.a-z0-9]", "").replaceAll("[.]{2,}", ".").replaceAll("^[.]|[.]$", "");
	         //5
	         if(id.equals("")) id += "a"; 
	         //6
	         if(id.length() >= 16){
	             id = id.substring(0, 15);
	             id = id.replaceAll("^[.]|[.]$", "");
	         }
	         //7
	         if(id.length() <= 2)  
	             while(id.length() < 3)
	                 id += id.charAt(id.length() - 1);

	         return id;
	    }
	}
}
