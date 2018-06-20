--����ѧ��������Ϣ���ݱ�----
create table dorm_student(
       dorm_stu_sno varchar2(10) not null,                       --ѧ��
       dorm_stu_cno varchar2(10) not null,                        --���
       dorm_stu_name varchar2(30) not null,                    --����
       dorm_stu_sex varchar2(6) not null,                      --�Ա�
       dorm_roo_rno varchar2(10) ,                               --����
       dorm_stu_specialty varchar2(30),                        --רҵ
       dorm_stu_password varchar2(30) default '123abc'  not null,     --����(ѧ��Ĭ��Ϊ123abc)
       dorm_stu_state varchar2(9) default '����',                     --״̬(Ĭ��Ϊ�����������޸�Ϊ����)
       PRIMARY KEY(dorm_stu_sno)
)
DROP TABLE dorm_student;
select rowid,a.*from dorm_student a;
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20181002','181001','����','��','101','�����ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20182003','181014','����','Ů','120','����ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20183004','181081','����','��','301','���ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty,dorm_stu_password,dorm_stu_state)
                  values('20183005','181045','����','��','401','����ϵ','123456','δ���');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184001','181002','����','��','311','����ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184002','181021','�ܰ�','��','516','����ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184003','181023','����','��','411','ͨ�Ź���ϵ');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184004','181034','��ʮ','��','221','�����ϵ');
                                    
update dorm_student set dorm_stu_state = 0 where dorm_stu_sno = 20181002;
--ɾ��������������
DELETE FROM dorm_student;
TRUNCATE TABLE dorm_student;
select * from dorm_student where dorm_stu_sno = '20181002' and dorm_stu_password = '123abc' 

--��������Ա���ݱ�----
create table dorm_admin(
       dorm_adm_ano varchar2(10) not null,                      --Ա����
       dorm_adm_name varchar2(30) not null,                       --Ա����
       dorm_adm_sex varchar2(6) not null,                           --�Ա�
       dorm_adm_password varchar2(30) not null,                 --����
       dorm_adm_state varchar2(15) default '��ͨ����Ա',          --Ȩ��(Ĭ��Ϊ1����Ч���ݣ���0ΪʧЧ)
       PRIMARY KEY(dorm_adm_ano)
)
DROP TABLE dorm_admin;
--��������
create sequence dorm_admin$SEQ
minvalue 1000
maxvalue 99999999
increment by 1
start with 1000
nocycle
nocache;
--ɾ������
drop sequence dorm_admin$SEQ;
select rowid,a.*from dorm_admin a;
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','��','qwer123');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','Ů','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','��','ada2222');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','��','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','��','qwer123');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'�﷼','Ů','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'����','Ů','123456');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password,dorm_adm_state)
                values('123456','����','��','123456','��������Ա');                
update dorm_admin SET dorm_adm_name = '����', dorm_adm_sex = '��', dorm_adm_password = '321bca' where dorm_adm_ano = '1004' 
--ɾ��������������
DELETE FROM dorm_admin;
TRUNCATE TABLE dorm_admin;


--�����������ݱ�----
create table dorm_room(
       dorm_roo_xno varchar2(10) not null,                 --���
       dorm_roo_rno varchar2(10) not null,               --����
       dorm_roo_pno varchar2(10) not null,                 --¥��
       dorm_roo_bnum varchar2(2),                         --��λ��
       PRIMARY KEY(dorm_roo_xno)
)
DROP TABLE dorm_room;
--��������
create sequence dorm_room$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--ɾ������
drop sequence dorm_room$SEQ;

select rowid,a.*from dorm_room a;
insert into dorm_room(dorm_roo_xno,dorm_roo_rno,dorm_roo_pno,dorm_roo_bnum)
                values(dorm_room$SEQ.nextval,'100','01','4');
insert into dorm_room(dorm_roo_xno,dorm_roo_rno,dorm_roo_pno,dorm_roo_bnum)
                values(dorm_room$SEQ.nextval,'103','02','4');
--ɾ��������������
DELETE FROM dorm_room;
TRUNCATE TABLE dorm_room;


--�����ÿ����ݱ�----
create table dorm_visitor(
       dorm_vis_vno varchar2(10) not null,                 --���
       dorm_vis_name varchar2(30) not null,             --�ÿ�����
       dorm_vis_sex varchar2(6),                        --�ÿ��Ա�
       dorm_roo_pno varchar2(10),                       --����¥��  
       dorm_vis_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),              --����ʱ��(Ĭ�ϵ�ǰϵͳʱ��)
       dorm_vis_remarks varchar2(600) ,                 --��ע
       PRIMARY KEY(dorm_vis_vno)
)
DROP TABLE dorm_visitor;
--��������
create sequence dorm_visitor$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--ɾ������
drop sequence dorm_visitor$SEQ;
select rowid,a.*from dorm_visitor a;
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'�ÿ�һ','��','23','����');
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'����','Ů','13','����');
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'	���','����','30','����');
--ɾ��������������
DELETE FROM dorm_visitor;
TRUNCATE TABLE dorm_visitor;

--�����������ݱ�----
create table dorm_health(
       dorm_hea_hno varchar2(10) not null,                 --���
       dorm_roo_rno varchar2(10) not null,                 --��鷿��
       dorm_roo_pno varchar2(10) not null,                 --���¥��
       dorm_hea_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --�������
       dorm_hea_score varchar2(2),                          --����
       dorm_hea_remarks varchar2(600),                       --��ע
       PRIMARY KEY(dorm_hea_hno)
)
DROP TABLE dorm_health;
--��������
create sequence dorm_health$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--ɾ������
drop sequence dorm_health$SEQ;
select rowid,a.*from dorm_health a;
insert into dorm_health(dorm_hea_hno,dorm_roo_rno,dorm_roo_pno,dorm_hea_score,dorm_hea_remarks)
                values(dorm_health$SEQ.nextval,'100','12','7','����һ��');
insert into dorm_health(dorm_hea_hno,dorm_roo_rno,dorm_roo_pno,dorm_hea_score,dorm_hea_remarks)
                values(dorm_health$SEQ.nextval,'103','05','4','�����ϲ�');
--ɾ��������������
DELETE FROM dorm_health;
TRUNCATE TABLE dorm_health;

--�����������ݱ�----
create table dorm_mend(
       dorm_men_mno varchar2(10) not null,                 --���
       dorm_roo_rno varchar2(10) not null,                 --���޷���
       dorm_roo_pno varchar2(10) not null,                 --����¥��
       dorm_men_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --����ʱ��
       dorm_men_info varchar2(600),                      --������Ϣ
       dorm_men_state varchar2(9) default 'δ����',        --����״̬                         --����״̬
       PRIMARY KEY(dorm_men_mno)
)
DROP TABLE dorm_mend;
--��������
create sequence dorm_mend$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--ɾ������
drop sequence dorm_mend$SEQ;
select rowid,a.*from dorm_mend a;
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'300','01','���ӻ���');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'101','06','������');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'003','34','���ӻ���');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'216','13','ˮ��ͷ����');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'425','22','���廵��');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'203','04','�ƻ���');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'412','25','����©ˮ'); 
--ɾ��������������
DELETE FROM dorm_mend;
TRUNCATE TABLE dorm_mend;

--����ʧ���������ݱ�----
create table dorm_lose(
       dorm_lose_lno varchar2(10) not null,                 --���
       dorm_lose_info varchar2(600) not null,                --ʧ����Ϣ
       dorm_lose_name varchar2(30) not null,                --����������
       dorm_lose_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --����ʱ��
       dorm_lose_addr varchar2(600) not null,                --��ȡ�ص�
       dorm_lose_state varchar2(9) default 'δ��ȡ',         --ʧ��״̬
       PRIMARY KEY(dorm_lose_lno)
)
DROP TABLE dorm_lose;
--��������
create sequence dorm_lose$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--ɾ������
drop sequence dorm_lose$SEQ;
select rowid,a.*from dorm_lose a;
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'һ��Կ��','����','5��¥114');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'һ��ѧ��֤','����','4��¥¥�ܴ�');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'һ����','�ط�','5��¥005');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'һ��Ǯ��','����','12��¥¥�ܴ�');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'һ��Կ��','����','3��¥114');
--ɾ��������������
DELETE FROM dorm_lose;
TRUNCATE TABLE dorm_lose;
