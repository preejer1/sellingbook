DROP TABLE REPLY_TB;
DROP TABLE book_tb;
DROP TABLE user_tb;

drop sequence user_id_seq;

--user
create table user_tb(
	USER_ID		INTEGER NOT NULL,
	USER_EMAIL    VARCHAR(50) NOT NULL ,
	USER_PASSWORD     VARCHAR(25)  NOT NULL,
	USER_NICKNAME     VARCHAR(25)
);

ALTER TABLE USER_TB ADD (CONSTRAINT user_tb_pk PRIMARY KEY (user_email));

CREATE SEQUENCE user_id_seq
 START WITH     1
 INCREMENT BY   1
 MAXVALUE       99999999
 NOCACHE
 NOCYCLE;
--


--book
CREATE TABLE BOOK_TB(
BOOK_ID INTEGER NOT NULL,
BOOK_TITLE VARCHAR(255) NOT NULL,
BOOK_CONTENT VARCHAR(255) NOT NULL,
BOOK_NAME VARCHAR(255) NOT NULL,
BOOK_AUTHOR VARCHAR(100) NULL,
BOOK_PUBLISHER VARCHAR(50) NULL,
BOOK_IMAGE_PATH VARCHAR(255) NULL,
BOOK_CONDITION INTEGER NOT NULL, 
BOOK_PRICE INTEGER NOT NULL,
BOOK_W_PRICE INTEGER NOT NULL ,
REGION SMALLINT  NOT NULL, 
BOOK_SALES CHAR(1) NOT NULL ,   
REG_DATE VARCHAR(50) NOT NULL,
USER_EMAIL VARCHAR(50)
);

alter table book_tb add( CONSTRAINT BOOK_TB_pk PRIMARY KEY (BOOK_ID), CONSTRAINT book_tb_fk FOREIGN KEY (USER_EMAIL) REFERENCES  user_tb (USER_EMAIL));
--


--reply
create table reply_tb(
REPLY_ID INTEGER NOT NULL,
REPLY_CONTENTS  VARCHAR(255) NOT NULL,
REPLY_PASSWORD  VARCHAR(25) NOT NULL,
USER_EMAIL	VARCHAR(50) NOT NULL,
BOOK_ID 	INTEGER NOT NULL,
REPLY_GROUP_ID  INTEGER NOT NULL,
REG_DATE	VARCHAR(50) NOT NULL,
REPLY_DEP	SMALLINT NOT NULL
);
alter table REPLY_TB add(  constraint reply_tb_PK PRIMARY KEY (REPLY_ID)  ,CONSTRAINT reply_tb_fk_BOOKID FOREIGN KEY (BOOK_ID) REFERENCES  BOOK_TB (BOOK_ID), CONSTRAINT reply_tb_fk_USER_EMAIL FOREIGN KEY (USER_EMAIL) REFERENCES  user_tb (USER_EMAIL));
--

