package com.javaex.ex09;

public class StringUtil {
    

	public static String concatString(String[] Array){
		
		for(int i=1;i<Array.length;i++) {
			Array[0] = Array[0] + Array[i];
		}

		
		return Array[0];
    	
        //메소드 내용작성
        
    }

}
