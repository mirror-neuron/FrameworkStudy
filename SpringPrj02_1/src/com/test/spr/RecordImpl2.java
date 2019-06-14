package com.test.spr;

public class RecordImpl2 implements Record
{
	private String name, phone, addr;

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@Override
	public String getPhone()
	{
		return phone;
	}

	@Override
	public void setAddr(String addr)
	{
		this.addr = addr;		
	}

	@Override
	public String getAddr()
	{
		return addr;
	}
	
	
}
