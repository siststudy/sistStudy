package com.sist.lv1_0613;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;
        int right = 12;

        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];

            if (num == 1 || num == 4 || num == 7) {
                //왼손 범위
                answer += "L";
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                //오른손 범위
                answer += "R";
                right = num;
            } else {
                //가운데일 경우 
                int leftFinger = cal(left, num);
                int rightFinger = cal(right, num);

                if (leftFinger > rightFinger) {
                    //왼손이 거리가 더 멀면 오른손
                    answer += "R";
                    right = num;
                } else if (leftFinger < rightFinger) {
                    //오른손이 거리가 더 멀면 왼손
                    answer += "L";
                    left = num;
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = num;
                    } else {
                        answer += "L";
                        left = num;
                    }
                }

            }
        }

        return answer;
    }

    public static int cal(int location, int num) {

        if (location == 0) {
            location = 11;
        }

        if (num == 0) {
            num = 11;
        }

        int locationX = (location - 1)/3;
        int locationY = (location - 1)%3;

        int numX = (num - 1)/3;
        int numY = (num - 1)%3;

        int result = Math.abs(locationX - numX) + Math.abs(locationY - numY);

        return result;
    }
}
