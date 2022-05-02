create table springboard(
   idx number not null,
   title varchar2(100) not null,
   content varchar2(2000) not null,
   writer varchar2(20) not null,
   indate date default sysdate,
   count number default 0,
   constraint pk_sb primary key(idx)
)

alter table springboard add memId varchar2(20);

create sequence sboard_seq
start with 1
increment by 1
maxvalue 100
cycle
nocache;

insert into springboard(idx, title, content, writer) values (board_seq.nextval, '스프링게시판제목1','스프링게시판내용1','관리자')
insert into springboard(idx, title, content, writer) values (board_seq.nextval, '스프링게시판제목2','스프링게시판내용2','제동진')

select * from springboard
desc springboard

delete springboard

select * from springmember;

create table springmember(
	memId varchar2(20) not null,
	memPw varchar2(20) not null,
	memUser varchar2(20) not null,
	constraint pk_sm primary key(memId)
);

select * from springmember


insert into springmember values('smhrd1','smhrd1','제동진');
insert into springmember values('smhrd2','smhrd1','홍길동');
insert into springmember values('smhrd3','smhrd1','차두리');

SELECT memId,memPw,memUser from springmember where memId = 'smhrd1' and memPw = 'smhrd1'




#########################################################



create table Book(
   num number not null,
   title varchar2(50) not null,
   author varchar2(30) not null,
   company varchar2(50) not null,
   isbn varchar2(30) not null,
   count number default 0,
   constraint pk_Bnum primary key(num)
)

create sequence book_seq
start with 1
increment by 1
maxvalue 100
cycle
nocache;

insert into book values(board_seq.nextval,'코드로 배우는 스프링 웹프로젝트','구멍가게 코딩단','남가람북스','979-11-89184-01-8',100);
insert into book values(board_seq.nextval,'생활코딩! Node.js 프로그래밍','이고잉','위키북스','979-11-5839-238-3',88);
insert into book values(board_seq.nextval,'전자정부 표준프레임워크','채규태,표선영','루비페이퍼','979-11-86710-37-1',120);
insert into book values(board_seq.nextval,'토비의 스프링3.1','이일민','에이콘','978-89-6077-341-7',50);
insert into book values(board_seq.nextval,'자바 채팅 프로그래밍','안용화','구민사','978-89-7074-776-7',70);

commit;
select * from book;
delete book;







