package com.sist.lv1_0520;
import java.util.*;
public class Picking_dolls_donguk {
    public int solution(int[][] board, int[] moves) {
        int answer=0;
        ArrayList list=new ArrayList();
        for(int i=0; i<moves.length; i++){
            for(int j=0;j<board.length; j++){
                if(board[j][moves[i]-1]!=0){ //숫자 0이아닌거 체크
                    list.add(board[j][moves[i]-1]); //바구니 넣기
                    board[j][moves[i]-1]=0;         //숫자 0되돌리기
                    i++;
                    j=0;
                    if(list.size()>=2){           //마지막 두개 같은거 확인
                      if(list.get(list.size()-1)==list.get(list.size()-2)) {
                         list.remove(list.size()-1);
                         list.remove(list.size()-1);
                         answer++;
                         answer++;
                      }
                    }
                    if(i==moves.length)
                        break;
                }
                    
            }
        }
        
        return answer;
    }
}
