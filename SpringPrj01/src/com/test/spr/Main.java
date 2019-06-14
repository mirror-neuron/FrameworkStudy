/*============================================
 	Main.java
 	- main() 메소드가 포함된 테스트 클래스
=============================================*/

package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		// [스프링이 처리하고 관리하게 될 영역(스프링 컨테이너 안에서 벌어질 일)] 
		//-----------------------------------------------------------------------------
		
		// ① RecordImpl1(Record 타입) 객체 생성 과정
		//Record rec1 = new RecordImpl1();				//-- dependency (의존 객체)
		
		// ② RecordImpl2(Record 타입) 객체 생성 과정
		Record rec2 = new RecordImpl2();				//-- dependency (의존 객체)
		
		// RecordViewImpl(RecordView) 객체 생성 과정
		//-- Record 객체(의존객체 - RecordImpl1 / RecordImpl2) 필요
		RecordView view = new RecordViewImpl();
		
		// 의존 객체 주입
		//-- 의존 객체 주입 방법을 사용하게 되면
		//   느슨한 결합(인터페이스)을 구성할 수 있게 되고,
		//   한 쪽의 변동 상황이 다른 쪽에 영향을 덜 줄 수 있게 된다.
		view.setRecord(rec2);							//-- setter injection
														//   (setter 를 통한 주입)
		
		//-----------------------------------------------------------------------------
		
		view.input();
		view.output();
		
	}
}
