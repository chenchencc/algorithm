package com.jason.algorithm;

public class 组后一个单词的长度 {

	public void cal(String s){
		 int turn = 0;
	     for(int i=s.length()-1;i>=0;i--){
	         if(s.charAt(i) != ' '){
	         	turn++;
	         }
	         if(turn >0 &&s.charAt(i) == ' '){
	         	break;
	         }
	     }
	    System.out.println(turn);
	}
}
