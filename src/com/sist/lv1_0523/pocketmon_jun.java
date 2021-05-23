package com.sist.lv1_0523;

import java.util.LinkedHashSet;

public class pocketmon_jun {
	public int solution(int[] nums) {
		// 중복제거 및 순서대로 데이터 관리하는 LinkedHashSet 사용
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(int monster : nums) {
			lhs.add(monster); // 중복 제거
		}
		if(nums.length / 2 <= lhs.size()) {
            return nums.length / 2;
        } else {
            return lhs.size();
        }
    }
}
