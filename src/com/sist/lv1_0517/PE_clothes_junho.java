package com.sist.lv1_0517;

public class PE_clothes_junho {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		answer = n;
		for (int i = 0; i < lost.length; i++) {
			boolean check = false; // 여분 확인
			int j = 0;
			while (!check) {
				if (j == reserve.length) { // 여분 전체 체크
					break;
				}
				if (lost[i] == reserve[j]) {
					reserve[j] = -1;
					check = true; // 여분이 있으면 true
				} else if (lost[i] - reserve[j] == 1) {
					reserve[j] = -1;
					check = true;

				} else if (lost[i] - reserve[j] == -1) {
					reserve[j] = -1;
					check = true;
				} else {
					j++;
				}

				if (!check) { // 여분이 없다면
					answer--;
				}

			}

		}
		return answer;
	}

}
