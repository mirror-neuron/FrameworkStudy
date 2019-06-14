SELECT USER
FROM DUAL;
--==>> SCOTT

SELECT *
FROM TBL_MEMBERLIST;

DESC TBL_MEMBERLIST;
--==>>
/*
�̸�    ��?       ����            
----- -------- ------------- 
ID    NOT NULL VARCHAR2(30)  
PW    NOT NULL VARCHAR2(20)  
NAME  NOT NULL VARCHAR2(50)  
TEL   NOT NULL VARCHAR2(50)  
EMAIL          VARCHAR2(100)
*/


--�� ���� ������ ����
DELETE
FROM TBL_MEMBERLIST;
--==>> 1 �� ��(��) �����Ǿ����ϴ�.


--�� Ŀ��
COMMIT;
--==>> Ŀ�� �Ϸ�.


--�� ������ �Է�(��ȣȭ �Լ� ���)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'admin'), '������', '010-1234-1234', 'admin@test.com');
--> �� �� ����
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL) VALUES('admin', CRYPTPACK.ENCRYPT('java006$', 'admin'), '������', '010-1234-1234', 'admin@test.com')
;
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ŀ�� 
COMMIT;
--==>> Ŀ�� �Ϸ�.

--�� �⺻ ��ȸ ���� ����
SELECT ID, NAME, TEL, EMAIL
FROM TBL_MEMBERLIST
ORDER BY ID;
--> �� �� ����
SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST ORDER BY ID
;
--==>> admin	������	010-1234-1234	admin@test.com

--�� ������ �߰� �Է�(���� ���� �ǽ��� ���� �غ� ����)
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL)
VALUES('suyeon', CRYPTPACK.ENCRYPT('java006$', 'suyeon'), '������', '010-1111-1111', 'suyeon@test.com');
--> �� �� ����
INSERT INTO TBL_MEMBERLIST(ID, PW, NAME, TEL, EMAIL) VALUES('suyeon', CRYPTPACK.ENCRYPT('java006$', 'suyeon'), '������', '010-1111-1111', 'suyeon@test.com')
;
--==>> 1 �� ��(��) ���ԵǾ����ϴ�.

--�� Ŀ�� 
COMMIT;
--==>> Ŀ�� �Ϸ�.