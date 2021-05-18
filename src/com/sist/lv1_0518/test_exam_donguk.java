package com.sist.lv1_0518;

public int[] solution(int[] answers) {
    int[] answer = {};
    int count1=0;
    //1번 점수
    for(int i=0; i<answers.length; i++){
        if(answers[i]==(i+1)%6){
            count1++;
        }
    }
    //2번점수
    int[] arr2={0,1,0,3,0,4,0,5};
    int count2=0;
    for(int j=0; j<answers.length; j++){
        if(j%2==0){
            if(answers[j]==2){
                count2++;
            }
        }else{
            if(answers[j]==arr2[j%8]){
                count2++;
            }
        } 
            
    }   
    //3번점수
    int[] arr3={3,3,1,1,2,2,4,4,5,5};
    int count3=0;
    for(int k=0; k<answers.length; k++){
        if(answers[k]==arr3[k%11]){
            count3++;
        }
    
    }
    //등수 나누기 1등은 -1로 교체
    int arrCount=0;
    int[] totalArr={count1,count2,count3};
    for(int s=10000;s>=0; s--){
        for(int ss=0; ss<3; ss++){
            if(s==totalArr[ss])
                totalArr[ss]=-1;
                    arrCount++;
            }
        }
    //1등이 생기면 break
        if(totalArr[0]==-1 || totalArr[1]==-1 ||totalArr[2]==-1){
        	break;
        }
        
    }
	//1등 찾아서 배열에 넣기
    answer=new int[arrCount];
    for(int x=0; x<3;x++){
        for(int z=0;z<arrCount;z++){
            if(totalArr[x]==-1){
                answer[z]= x+1;
                x++;
            }
        }
    }
    return answer;
}
