package com.sist.lv1_0518;

import java.util.*;
import java.util.stream.Collectors;
public class test_exam_yoo {
    class Solution {
        public int[] solution(int[] answers) {
            int[] s1 = {1,2,3,4,5};
            int[] s2 = {2,1,2,3,2,4,2,5};
            int[] s3 = {3,3,1,1,2,2,4,4,5,5};
            int ac,bc,cc;
            ac=bc=cc=0;
            for(int i =0; i<answers.length; i++){
                if(s1[i%s1.length] == answers[i]) ac++;
                if(s2[i%s2.length] == answers[i]) bc++;
                if(s3[i%s3.length] == answers[i]) cc++;
            }
            int max = Math.max(Math.max(ac, bc),cc);
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(max==ac) list.add(1);
            if(max==bc) list.add(2);
            if(max==cc) list.add(3);
            int[] answer = list.stream().mapToInt(i->i).toArray();
            return answer; 
        }
    }

}
