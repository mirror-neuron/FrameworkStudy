package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		//Record rec1 = new RecordImpl1();
		
		Record rec2 = new RecordImpl2();
		
		RecordView view = new RecordViewImpl();
		
		view.setRecord(rec2);
	
		
		view.input();
		view.output();
	}
	
	
}

