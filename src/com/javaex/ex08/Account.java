package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    //필요한 메소드 작성
    public void deposit(int deposit) {
    	if(deposit<=0) {
    		System.out.println("1이상의 값을 입력해주세요");
    	} else {
    		balance = balance + deposit;
    	}	
    }
    
    public void withdraw(int withdraw) {
    	if(balance-withdraw<0) {
    		System.out.println("잔액이 부족합니다.");
    	} else {
    		balance = balance - withdraw;
    	}
    }
    
    public void showBalance() {
    	System.out.println(balance);
    }

}
