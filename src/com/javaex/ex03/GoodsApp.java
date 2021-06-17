package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	System.out.println("상품을 입력해주세요(종료q)");
    	
    	while(true) {
    		String inputstring = sc.next();
    		if(inputstring.equals("q")) {
    			System.out.println("[입력완료]");
    			break;
    		}else {
    		String[] splitArray = inputstring.split(",");
    		Integer.parseInt(splitArray[1]);
    		Integer.parseInt(splitArray[2]);
    		Goods g01 = splitArray[0];
    		
    		}
    		
    	}
    	
    	
    	
    	
    	sc.close();
       
    }

}
