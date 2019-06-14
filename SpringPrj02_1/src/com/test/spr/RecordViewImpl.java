package com.test.spr;

import java.util.Scanner;

public class RecordViewImpl implements RecordView
{
	private Record record;

	@Override
	public void setRecord(Record record)
	{
		this.record = record;
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("귀하의 이름/전화번호/주소를 입력해주세요(공백구분) :  ");
		String name = sc.next();
		String phone = sc.next();
		String addr = sc.nextLine();
		
		record.setName(name);
		record.setPhone(phone);
		record.setAddr(addr);
		
		sc.close();
	}

	@Override
	public void output()
	{
		System.out.println("    이름     전화번호         주소");
		System.out.printf("%7s %16s %9s%n"
				, record.getName(), record.getPhone(), record.getAddr());
		
	}
	
	
	
}
