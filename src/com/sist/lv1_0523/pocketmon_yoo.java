package com.sist.lv1_0523;
import java.util.*;
public class pocketmon_yoo {
	class Solution {
		public int solution(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        for(int i:nums) set.add(i);
	        return nums.length/2<=set.size()?nums.length/2:set.size();
	    }
	}
}
