package com.sist.lv1_0613;
import java.util.*;
public class KeyButton_donguk{
    public String solution(int[] numbers, String hand) {
        String answer = "";
       int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,0,12}};
        ArrayList<String> list=new ArrayList<String>(); 
        String lHand="30";
        String rHand="32";
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<4; k++){
                    if(numbers[i] == arr[k][j]){
                        list.add(String.valueOf(k)+String.valueOf(j));
                    }
                
                }
            }
        }
        for(int i=0;i<list.size();i++){
            int x=Integer.parseInt(list.get(i).substring(0,1));
            int y=Integer.parseInt(list.get(i).substring(1));
            int xLeft=Integer.parseInt(lHand.substring(0,1));
            int yLeft=Integer.parseInt(lHand.substring(1));
            int xRight=Integer.parseInt(rHand.substring(0,1));
            int yRight=Integer.parseInt(rHand.substring(1));
             System.out.println(x+":"+y+":"+xLeft+":"+yLeft+":"+xRight+":"+yRight);
            if((x==0 && y==0)||(x==1 && y==0)||(x==2 && y==0)){//1,4,7
                answer+="L";
                lHand=list.get(i);
            }else if((x==0 && y==2)||(x==1 && y==2)||(x==2 && y==2)){
                answer+="R";    
                rHand=list.get(i);
            }else{ //같으면
                
            
              if ((Math.abs(x-xLeft)+Math.abs(y-yLeft)) - (Math.abs(x-xRight)+Math.abs(y-yRight)) > 0)              {//오른손이 더 짧으면
                 answer+="R";    
                  rHand=list.get(i);
              }else if((Math.abs(x-xLeft)+Math.abs(y-yLeft)) - (Math.abs(x-xRight)+Math.abs(y-yRight))<0){
                
                  answer+="L";
                  lHand=list.get(i);
                }else{
                    answer+=hand.toUpperCase().substring(0,1);
                    if(hand.startsWith("l")){
                         lHand=list.get(i);
                    }else if(hand.startsWith("r")){
                         rHand=list.get(i);
                    }
                }
            
            }
        }
        return answer;
    }
}
