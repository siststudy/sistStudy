package com.sist.lv2_0623;
import java.util.Collections;
import java.util.PriorityQueue;

public class Stack_Printer_hong {
				 public int solution(int[] priorities, int location) {
					int answer=0;
					//int형 우선순위 큐 선언(우선순위가 높은 숫자 순)
					PriorityQueue<Integer> order=new PriorityQueue<Integer>(Collections.reverseOrder());
					
					for(int p:priorities){
						order.offer(p); //큐에 객체를 저장한다
					}
					while(!order.isEmpty()){
						for(int i=0;i<priorities.length;i++){
							if(order.peek()==priorities[i]){//peek = 삭제 없이 읽어온다
								order.poll(); // poll : 큐에서 꺼내온다, 비었을 때 null반환 
								answer++;
								if(location==i){
									order.clear(); //초기화
									break;
								}
							}
						}
					}
					
					return answer;
					}
			}

