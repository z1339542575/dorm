--创建学生基本信息数据表----
create table dorm_student(
       dorm_stu_sno varchar2(10) not null,                       --学号
       dorm_stu_cno varchar2(10) not null,                        --班号
       dorm_stu_name varchar2(30) not null,                    --姓名
       dorm_stu_sex varchar2(6) not null,                      --性别
       dorm_roo_rno varchar2(10) ,                               --房号
       dorm_stu_specialty varchar2(30),                        --专业
       dorm_stu_password varchar2(30) default '123abc'  not null,     --密码(学生默认为123abc)
       dorm_stu_state varchar2(9) default '正常',                     --状态(默认为正常，；可修改为禁用)
       PRIMARY KEY(dorm_stu_sno)
)
DROP TABLE dorm_student;
select rowid,a.*from dorm_student a;
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20181002','181001','张三','男','101','计算机系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20182003','181014','李四','女','120','外语系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20183004','181081','王五','男','301','会记系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty,dorm_stu_password,dorm_stu_state)
                  values('20183005','181045','赵六','男','401','航天系','123456','未审核');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184001','181002','丁七','男','311','管理系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184002','181021','曹八','男','516','航天系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184003','181023','郭九','男','411','通信工程系');
insert into dorm_student(dorm_stu_sno,dorm_stu_cno,dorm_stu_name,dorm_stu_sex,dorm_roo_rno,dorm_stu_specialty)
                  values('20184004','181034','朱十','男','221','计算机系');
                                    
update dorm_student set dorm_stu_state = 0 where dorm_stu_sno = 20181002;
--删除表内所有数据
DELETE FROM dorm_student;
TRUNCATE TABLE dorm_student;
select * from dorm_student where dorm_stu_sno = '20181002' and dorm_stu_password = '123abc' 

--创建管理员数据表----
create table dorm_admin(
       dorm_adm_ano varchar2(10) not null,                      --员工号
       dorm_adm_name varchar2(30) not null,                       --员工名
       dorm_adm_sex varchar2(6) not null,                           --性别
       dorm_adm_password varchar2(30) not null,                 --密码
       dorm_adm_state varchar2(15) default '普通管理员',          --权限(默认为1，有效数据；置0为失效)
       PRIMARY KEY(dorm_adm_ano)
)
DROP TABLE dorm_admin;
--创建序列
create sequence dorm_admin$SEQ
minvalue 1000
maxvalue 99999999
increment by 1
start with 1000
nocycle
nocache;
--删除序列
drop sequence dorm_admin$SEQ;
select rowid,a.*from dorm_admin a;
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'管理','男','qwer123');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'宿姨','女','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'王凯','男','ada2222');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'宋锐','男','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'管理','男','qwer123');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'田芳','女','sds321');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password)
                values(dorm_admin$SEQ.nextval,'陈姨','女','123456');
insert into dorm_admin(dorm_adm_ano,dorm_adm_name,dorm_adm_sex,dorm_adm_password,dorm_adm_state)
                values('123456','超管','男','123456','超级管理员');                
update dorm_admin SET dorm_adm_name = '管理', dorm_adm_sex = '男', dorm_adm_password = '321bca' where dorm_adm_ano = '1004' 
--删除表内所有数据
DELETE FROM dorm_admin;
TRUNCATE TABLE dorm_admin;


--创建房间数据表----
create table dorm_room(
       dorm_roo_xno varchar2(10) not null,                 --序号
       dorm_roo_rno varchar2(10) not null,               --房号
       dorm_roo_pno varchar2(10) not null,                 --楼号
       dorm_roo_bnum varchar2(2),                         --床位数
       PRIMARY KEY(dorm_roo_xno)
)
DROP TABLE dorm_room;
--创建序列
create sequence dorm_room$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--删除序列
drop sequence dorm_room$SEQ;

select rowid,a.*from dorm_room a;
insert into dorm_room(dorm_roo_xno,dorm_roo_rno,dorm_roo_pno,dorm_roo_bnum)
                values(dorm_room$SEQ.nextval,'100','01','4');
insert into dorm_room(dorm_roo_xno,dorm_roo_rno,dorm_roo_pno,dorm_roo_bnum)
                values(dorm_room$SEQ.nextval,'103','02','4');
--删除表内所有数据
DELETE FROM dorm_room;
TRUNCATE TABLE dorm_room;


--创建访客数据表----
create table dorm_visitor(
       dorm_vis_vno varchar2(10) not null,                 --序号
       dorm_vis_name varchar2(30) not null,             --访客姓名
       dorm_vis_sex varchar2(6),                        --访客性别
       dorm_roo_pno varchar2(10),                       --来访楼号  
       dorm_vis_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),              --来访时间(默认当前系统时间)
       dorm_vis_remarks varchar2(600) ,                 --备注
       PRIMARY KEY(dorm_vis_vno)
)
DROP TABLE dorm_visitor;
--创建序列
create sequence dorm_visitor$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--删除序列
drop sequence dorm_visitor$SEQ;
select rowid,a.*from dorm_visitor a;
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'访客一','男','23','找人');
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'陈蓉','女','13','找人');
insert into dorm_visitor(dorm_vis_vno,dorm_vis_name,dorm_vis_sex,dorm_roo_pno,dorm_vis_remarks)
                  values(dorm_visitor$SEQ.Nextval,'	马飞','不详','30','找人');
--删除表内所有数据
DELETE FROM dorm_visitor;
TRUNCATE TABLE dorm_visitor;

--创建卫生数据表----
create table dorm_health(
       dorm_hea_hno varchar2(10) not null,                 --序号
       dorm_roo_rno varchar2(10) not null,                 --检查房号
       dorm_roo_pno varchar2(10) not null,                 --检查楼号
       dorm_hea_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --检查日期
       dorm_hea_score varchar2(2),                          --分数
       dorm_hea_remarks varchar2(600),                       --备注
       PRIMARY KEY(dorm_hea_hno)
)
DROP TABLE dorm_health;
--创建序列
create sequence dorm_health$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--删除序列
drop sequence dorm_health$SEQ;
select rowid,a.*from dorm_health a;
insert into dorm_health(dorm_hea_hno,dorm_roo_rno,dorm_roo_pno,dorm_hea_score,dorm_hea_remarks)
                values(dorm_health$SEQ.nextval,'100','12','7','卫生一般');
insert into dorm_health(dorm_hea_hno,dorm_roo_rno,dorm_roo_pno,dorm_hea_score,dorm_hea_remarks)
                values(dorm_health$SEQ.nextval,'103','05','4','卫生较差');
--删除表内所有数据
DELETE FROM dorm_health;
TRUNCATE TABLE dorm_health;

--创建报修数据表----
create table dorm_mend(
       dorm_men_mno varchar2(10) not null,                 --序号
       dorm_roo_rno varchar2(10) not null,                 --报修房号
       dorm_roo_pno varchar2(10) not null,                 --报修楼号
       dorm_men_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --报修时间
       dorm_men_info varchar2(600),                      --报修信息
       dorm_men_state varchar2(9) default '未受理',        --报修状态                         --受理状态
       PRIMARY KEY(dorm_men_mno)
)
DROP TABLE dorm_mend;
--创建序列
create sequence dorm_mend$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--删除序列
drop sequence dorm_mend$SEQ;
select rowid,a.*from dorm_mend a;
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'300','01','椅子坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'101','06','床坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'003','34','窗子坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'216','13','水龙头坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'425','22','床板坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'203','04','灯坏了');
insert into dorm_mend(dorm_men_mno,dorm_roo_rno,dorm_roo_pno,dorm_men_info)
                values(dorm_mend$SEQ.nextval,'412','25','厕所漏水'); 
--删除表内所有数据
DELETE FROM dorm_mend;
TRUNCATE TABLE dorm_mend;

--创建失物招领数据表----
create table dorm_lose(
       dorm_lose_lno varchar2(10) not null,                 --序号
       dorm_lose_info varchar2(600) not null,                --失物信息
       dorm_lose_name varchar2(30) not null,                --发布人姓名
       dorm_lose_date varchar2(30) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss'),                 --发布时间
       dorm_lose_addr varchar2(600) not null,                --领取地点
       dorm_lose_state varchar2(9) default '未领取',         --失物状态
       PRIMARY KEY(dorm_lose_lno)
)
DROP TABLE dorm_lose;
--创建序列
create sequence dorm_lose$SEQ
minvalue 1
maxvalue 99999999
increment by 1
start with 1
nocycle
nocache;
--删除序列
drop sequence dorm_lose$SEQ;
select rowid,a.*from dorm_lose a;
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'一串钥匙','张三','5号楼114');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'一个学生证','李四','4号楼楼管处');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'一本书','秦菲','5号楼005');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'一个钱包','曾曲','12号楼楼管处');
insert into dorm_lose(dorm_lose_lno,dorm_lose_info,dorm_lose_name,dorm_lose_addr)
                values(dorm_lose$SEQ.nextval,'一串钥匙','张三','3号楼114');
--删除表内所有数据
DELETE FROM dorm_lose;
TRUNCATE TABLE dorm_lose;
