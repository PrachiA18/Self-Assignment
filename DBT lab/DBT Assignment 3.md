

mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| company            |

| information\_schema |

| mydb               |

| mysql              |

| performance\_schema |

| sys                |

| testdb             |

+--------------------+

7 rows in set (0.03 sec)



mysql> use testdb;

Database changed

mysql> show tables;

+---------------------+

| Tables\_in\_testdb    |

+---------------------+

| a                   |

| activity            |

| agent               |

| airline\_seats       |

| andor               |

| atm                 |

| b                   |

| bank                |

| bankloan            |

| batch\_schedule      |

| betweensalary       |

| bitwise             |

| blanktablea         |

| blanktableb         |

| blog                |

| bonus               |

| books               |

| brands              |

| bus\_stops           |

| cafe                |

| candidate           |

| cardpayments        |

| cars                |

| cashpayments        |

| categories          |

| category            |

| city                |

| classandsubjects    |

| client              |

| cnumbers            |

| coalesce            |

| comments            |

| company             |

| countnulls          |

| countnumbers        |

| cricketwinnerteam   |

| customer            |

| customers           |

| demodept1           |

| demodept2           |

| dept                |

| dept1               |

| dhl                 |

| docs                |

| doctor              |

| doctorvisits        |

| dummy               |

| duplicate           |

| emp                 |

| emp1                |

| emp2                |

| emp\_attendance      |

| emp\_cards           |

| emp\_phone           |

| empj                |

| envelope            |

| facebook            |

| fedex               |

| food                |

| food\_category\_tags  |

| food\_items          |

| fromstoreorders     |

| fruits              |

| fullname            |

| hall\_ticket         |

| hobby               |

| ipl                 |

| item                |

| job\_list            |

| key\_parts           |

| labtestlist         |

| leading\_zeroes      |

| leadtable           |

| licence             |

| linkedin            |

| location            |

| managers            |

| mass\_table          |

| medicinelist        |

| menucard            |

| missingnumbers      |

| nearest             |

| new                 |

| newbooks            |

| null1               |

| null2               |

| nullif              |

| numberstring        |

| onlineorders        |

| ord                 |

| order1              |

| order\_items         |

| orderdetails        |

| orders              |

| overlapping\_dates   |

| overtime            |

| patient             |

| phonecall           |

| pivot\_table         |

| plumber             |

| plumber\_service\_map |

| points              |

| population          |

| price               |

| product             |

| product\_sales       |

| products            |

| pune\_metro\_stations |

| quarterly\_revenue   |

| r                   |

| r1                  |

| r2                  |

| races               |

| regexpr             |

| repeatingnumbers    |

| replacedept         |

| reservations        |

| revenue             |

| rockets             |

| room\_assigned       |

| room\_staff          |

| rooms               |

| runners             |

| runningserver       |

| sales               |

| sales1              |

| sales\_channel       |

| salespeople         |

| salesperson         |

| salgrade            |

| security            |

| server              |

| service             |

| seta                |

| setb                |

| shop                |

| softdrink           |

| sort                |

| sourcecity          |

| sourcenames         |

| stadium             |

| stages              |

| states              |

| station             |

| status              |

| stocks              |

| stringnumber        |

| student             |

| swapcity            |

| tablea              |

| tableaa             |

| tableb              |

| tablebb             |

| targetcity          |

| targetnames         |

| tasks               |

| teams               |

| temp1               |

| trainers            |

| trains              |

| traintimetable      |

| transactions        |

| unpivot\_table       |

| ups                 |

| vote\_response       |

| votes               |

| warehouse           |

| x                   |

| year\_of\_service     |

| yearly\_revenue      |

| years               |

| z                   |

+---------------------+

172 rows in set (0.04 sec)



**<Q.1.List names of employees whose job is MANAGER. >**



mysql> select ename from emp where job = 'MANAGER';

+---------+

| ename   |

+---------+

| JONES   |

| BLAKE   |

| CLARK   |

| HOFFMAN |

| ALEX    |

+---------+

5 rows in set (0.00 sec)



**<Q.2. List names of employee having salary greater than equal to 3000. >**



mysql> select ename from emp where sal >= 3000;

+---------+

| ename   |

+---------+

| AARAV   |

| SCOTT   |

| KING    |

| FRED    |

| FORD    |

| HOFFMAN |

+---------+

6 rows in set (0.00 sec)



**<Q.3. List all employees having ‘A’ as second letter in their names.>** 



mysql> select \* from emp where ename like '\_A%';

+-------+---1   ------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

| EMPNO | ENAME   | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |

+-------+---------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

|  6781 | BANDISH | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |

|  7415 | AARAV   | M      | CLERK               | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV        | NULL       | 7032300084 |        0 |

|  7521 | WARD    | M      | SALESMAN            | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |

|  7654 | MARTIN  | M      | SALESMAN            | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |

|  7900 | JAMES   | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |

|  7945 | AARUSH  | M      | SALESMAN            | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |

|  8433 | NATASHA | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |

|  9400 | SANGITA | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |

+-------+---------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

8 rows in set (0.01 sec)



**<Q.4.List the Employee Number, Name, Hiredate and Job Title of the Employees in the Department 10. >**



mysql> select empno,ename,hiredate,job from emp where deptno =10;

+-------+--------+------------+-----------+

| empno | ename  | hiredate   | job       |

+-------+--------+------------+-----------+

|  7415 | AARAV  | 1981-12-31 | CLERK     |

|  7421 | THOMAS | 1981-07-19 | CLERK     |

|  7782 | CLARK  | 1981-06-09 | MANAGER   |

|  7839 | KING   | 1981-11-17 | PRESIDENT |

|  7934 | MILLER | 1982-01-23 | CLERK     |

+-------+--------+------------+-----------+

5 rows in set (0.00 sec)



**<Q.5. Display the details of those Employees who earn a monthly Salary of more than 2000. >**



mysql> select \* from emp where sal >2000;

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

| EMPNO | ENAME   | GENDER | JOB            | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME  | PWD        | PHONE      | isActive |

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

|  7415 | AARAV   | M      | CLERK          | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV      | NULL       | 7032300084 |        0 |

|  7566 | JONES   | M      | MANAGER        | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB  | a12recmpm  | 7132300039 |        1 |

|  7698 | BLAKE   | M      | MANAGER        | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN    | sales@2017 | 7132300027 |        1 |

|  7782 | CLARK   | M      | MANAGER        | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK      | r50mpm     | 7032300001 |        1 |

|  7788 | SCOTT   | M      | ANALYST        | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND | a12recmpm  | NULL       |        1 |

|  7839 | KING    | M      | PRESIDENT      | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING       | r50mpm     | 7132300081 |        1 |

|  7840 | FRED    | M      | vice PRESIDENT | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE | a12recmpm  | NULL       |        1 |

|  7902 | FORD    | M      | ANALYST        | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO    | a12recmpm  | NULL       |        0 |

|  7919 | HOFFMAN | M      | MANAGER        | 7566 | 1982-03-24 | 4150 | NULL |     30 |       3 | INTERVAL   | sales@2017 | NULL       |        1 |

|  7920 | GRASS   | M      | SALESMAN       | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS      | sales@2017 | NULL       |        1 |

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

10 rows in set (0.00 sec)



**<6. Display the names of all Employees from Department 10 and 20 whose name start with “A” and ends with “B”. >**



mysql> select ename,deptno from emp where deptno in (10,20);

+---------+--------+

| ename   | deptno |

+---------+--------+

| AARAV   |     10 |

| THOMAS  |     10 |

| CLARK   |     10 |

| KING    |     10 |

| MILLER  |     10 |

| SHARMIN |     20 |

| BANDISH |     20 |

| SMITH   |     20 |

| JONES   |     20 |

| SCOTT   |     20 |

| FRED    |     20 |

| ADAMS   |     20 |

| FORD    |     20 |

+---------+--------+

13 rows in set (0.00 sec)



**<Q.7. Display the details of the employees who have joined on 21-DEC-1990. >**



mysql> select \* from emp where hiredate = '1990-12-21';

Empty set (0.01 sec)



**<Q. 8. Display the Employee Code, Name, Job \& Annual Salary for all Employees belonging to Department Number** 

**10>**



mysql> select empno,ename,job,sal\*12 As annual\_salary from emp where deptno =10;

+-------+--------+-----------+---------------+

| empno | ename  | job       | annual\_salary |

+-------+--------+-----------+---------------+

|  7415 | AARAV  | CLERK     |         40200 |

|  7421 | THOMAS | CLERK     |         21000 |

|  7782 | CLARK  | MANAGER   |         29400 |

|  7839 | KING   | PRESIDENT |         60000 |

|  7934 | MILLER | CLERK     |         15600 |

+-------+--------+-----------+---------------+

5 rows in set (0.00 sec)



**<Q.9. Display the details of the Employees who earn an Annual salary of more than 25000. Sort the records in the descending order of Salary.>** 

mysql> select empno as "Employee code ", ename AS "Name",job AS"Job", sal \*12 As "Annual Salay " from emp where deptno=10;

+----------------+--------+-----------+---------------+

| Employee code  | Name   | Job       | Annual Salay  |

+----------------+--------+-----------+---------------+

|           7415 | AARAV  | CLERK     |         40200 |

|           7421 | THOMAS | CLERK     |         21000 |

|           7782 | CLARK  | MANAGER   |         29400 |

|           7839 | KING   | PRESIDENT |         60000 |

|           7934 | MILLER | CLERK     |         15600 |

+----------------+--------+-----------+---------------+

5 rows in set (0.00 sec)



**< Q10. Display the names of Employees whose names contain the character “F”>**

mysql> select ename from emp where ename like '%F%';

+---------+

| ename   |

+---------+

| FRED    |

| FORD    |

| HOFFMAN |

+---------+

3 rows in set (0.00 sec)



**<Q.12. Display the details of the Employees who earn an Annual salary of more than 25000. Sort the records in the descending order of Salary.>**

mysql> select empno as"Employee code" ename As "Name^C

mysql> ^C

mysql> select \* from emp where sal \* 12> 25000 order by sal DESC;

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

| EMPNO | ENAME   | GENDER | JOB            | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME  | PWD        | PHONE      | isActive |

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

|  7839 | KING    | M      | PRESIDENT      | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING       | r50mpm     | 7132300081 |        1 |

|  7840 | FRED    | M      | vice PRESIDENT | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE | a12recmpm  | NULL       |        1 |

|  7919 | HOFFMAN | M      | MANAGER        | 7566 | 1982-03-24 | 4150 | NULL |     30 |       3 | INTERVAL   | sales@2017 | NULL       |        1 |

|  7415 | AARAV   | M      | CLERK          | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV      | NULL       | 7032300084 |        0 |

|  7788 | SCOTT   | M      | ANALYST        | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND | a12recmpm  | NULL       |        1 |

|  7902 | FORD    | M      | ANALYST        | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO    | a12recmpm  | NULL       |        0 |

|  7566 | JONES   | M      | MANAGER        | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB  | a12recmpm  | 7132300039 |        1 |

|  7698 | BLAKE   | M      | MANAGER        | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN    | sales@2017 | 7132300027 |        1 |

|  7920 | GRASS   | M      | SALESMAN       | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS      | sales@2017 | NULL       |        1 |

|  7782 | CLARK   | M      | MANAGER        | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK      | r50mpm     | 7032300001 |        1 |

+-------+---------+--------+----------------+------+------------+------+------+--------+---------+------------+------------+------------+----------+

10 rows in set (0.00 sec)



**<Q.14. Display the Names and Numbers of all Departments in the descending order of the Department Names.>**



mysql> select dname AS"Department Name",deptno AS"Department Number" from dept order by dname DESC:

&#x20;   -> ^C

mysql> select dname AS"Department Name",deptno AS"Department Number" from dept order by dname DESC;

+-----------------+-------------------+

| Department Name | Department Number |

+-----------------+-------------------+

| SALES           |                30 |

| RESEARCH        |                20 |

| OPERATIONS      |                40 |

| IT              |                60 |

| HR              |                50 |

| ACCOUNTING      |                10 |

+-----------------+-------------------+

6 rows in set (0.01 sec)



**<Q.15 Display the Name, Employee Number, Designation and Salary of those Employees who earn a monthly salary** 

**of not less than 1000 and not more than 2000. >**



mysql> select ename AS "Name", empno As " Employee Number", job AS "Designation", sal As "salary" from emp where sal Between 1000 and 2000;

+----------+-----------------+---------------------+--------+

| Name     | Employee Number | Designation         | salary |

+----------+-----------------+---------------------+--------+

| GITA     |            6001 | Compliance officers |   1750 |

| VRUSHALI |            6129 | Compliance officers |   1750 |

| SHARMIN  |            6473 | Public Relation     |   1750 |

| BANDISH  |            6781 | Public Relation     |   1750 |

| THOMAS   |            7421 | CLERK               |   1750 |

| ALLEN    |            7499 | SALESMAN            |   1600 |

| WARD     |            7521 | SALESMAN            |   1250 |

| MARTIN   |            7654 | SALESMAN            |   1250 |

| TURNER   |            7844 | SALESMAN            |   1500 |

| ADAMS    |            7876 | CLERK               |   1100 |

| Ruhan    |            7888 | Network             |   2000 |

| Neel     |            7889 | vice PRESIDENT      |   1000 |

| MILLER   |            7934 | CLERK               |   1300 |

| AARUSH   |            7945 | SALESMAN            |   1350 |

| ALEX     |            7949 | MANAGER             |   1250 |

| NATASHA  |            8433 | CLERK               |   1750 |

| SANGITA  |            9400 | Compliance officers |   1750 |

| SUPRIYA  |            9473 | ANALYST             |   1750 |

+----------+-----------------+---------------------+--------+

18 rows in set, 1 warning (0.01 sec)



**< Q 16. Find out the Bonus (Bonus 1.1% of Annual Salary) that every person will receive at the end of the year.>** 



mysql> select ename As "Name ",sal \*12 As"Annual salary",(sal\*12)\*0.011 As"Bonus" from emp;

+----------+---------------+---------+

| Name     | Annual salary | Bonus   |

+----------+---------------+---------+

| GITA     |         21000 | 231.000 |

| VRUSHALI |         21000 | 231.000 |

| SHARMIN  |         21000 | 231.000 |

| BANDISH  |         21000 | 231.000 |

| SMITH    |          9600 | 105.600 |

| AARAV    |         40200 | 442.200 |

| THOMAS   |         21000 | 231.000 |

| ALLEN    |         19200 | 211.200 |

| WARD     |         15000 | 165.000 |

| JONES    |         35700 | 392.700 |

| MARTIN   |         15000 | 165.000 |

| BLAKE    |         34200 | 376.200 |

| CLARK    |         29400 | 323.400 |

| SCOTT    |         36000 | 396.000 |

| KING     |         60000 | 660.000 |

| FRED     |         60000 | 660.000 |

| TURNER   |         18000 | 198.000 |

| ADAMS    |         13200 | 145.200 |

| Ruhan    |         24000 | 264.000 |

| Neel     |         12000 | 132.000 |

| JAMES    |         11400 | 125.400 |

| FORD     |         36000 | 396.000 |

| HOFFMAN  |         49800 | 547.800 |

| GRASS    |         30900 | 339.900 |

| MILLER   |         15600 | 171.600 |

| AARUSH   |         16200 | 178.200 |

| ALEX     |         15000 | 165.000 |

| NATASHA  |         21000 | 231.000 |

| SANGITA  |         21000 | 231.000 |

| SUPRIYA  |         21000 | 231.000 |

+----------+---------------+---------+

30 rows in set (0.01 sec)



**<Q.17. Display the Name, Job and Dept No. of all the Employees who either work in Department 30 or in Department** 

**40. >**

mysql> SELECT ename AS "Name",

&#x20;   ->        job AS "Job",

&#x20;   ->        deptno AS "Dept No"

&#x20;   -> FROM emp

&#x20;   -> WHERE deptno IN (30, 40);

+---------+---------------------+---------+

| Name    | Job                 | Dept No |

+---------+---------------------+---------+

| GITA    | Compliance officers |      30 |

| ALLEN   | SALESMAN            |      30 |

| WARD    | SALESMAN            |      30 |

| MARTIN  | SALESMAN            |      30 |

| BLAKE   | MANAGER             |      30 |

| TURNER  | SALESMAN            |      30 |

| JAMES   | CLERK               |      30 |

| HOFFMAN | MANAGER             |      30 |

| GRASS   | SALESMAN            |      30 |

| AARUSH  | SALESMAN            |      30 |

| ALEX    | MANAGER             |      30 |

| NATASHA | CLERK               |      30 |

+---------+---------------------+---------+

12 rows in set (0.00 sec)



**<Q.18. Display the Employee Number, Name for Clerks and Managers who’s Salary is more than 1500. >**

mysql> select empno ,ename from emp where job in ('clerk','manager') and sal >1500;

+-------+---------+

| empno | ename   |

+-------+---------+

|  7415 | AARAV   |

|  7421 | THOMAS  |

|  7566 | JONES   |

|  7698 | BLAKE   |

|  7782 | CLARK   |

|  7919 | HOFFMAN |

|  8433 | NATASHA |

+-------+---------+

7 rows in set (0.00 sec)



**< Q.19. Display the Name, Annual Salary and Commission as “Commission Earned” of all employees whose monthly** 

**salary is greater than their Commission. The output should be in decreasing order of salary. If two or more** 

**employees have same salary, then sort them by name within the highest order of salary.  >**



mysql> select ename as name,sal \*12 as"annual salary", comm as "comission earned" from emo where sal>2000;

ERROR 1146 (42S02): Table 'testdb.emo' doesn't exist

mysql> select ename as name,sal \*12 as "annual salary" ,comm as "comission Earned" from emp where sal >2000;

+---------+---------------+------------------+

| name    | annual salary | comission Earned |

+---------+---------------+------------------+

| AARAV   |         40200 |             NULL |

| JONES   |         35700 |             NULL |

| BLAKE   |         34200 |             NULL |

| CLARK   |         29400 |             NULL |

| SCOTT   |         36000 |             NULL |

| KING    |         60000 |             NULL |

| FRED    |         60000 |             NULL |

| FORD    |         36000 |             NULL |

| HOFFMAN |         49800 |             NULL |

| GRASS   |         30900 |             2700 |

+---------+---------------+------------------+

10 rows in set (0.00 sec)



mysql> select ename AS name,sal \*12 As "annual salary", comm As "comission Earned" from emp where sal> IFNULL (comm,0) order by sal DESC,ename ASC;

+----------+---------------+------------------+

| name     | annual salary | comission Earned |

+----------+---------------+------------------+

| FRED     |         60000 |             NULL |

| KING     |         60000 |             NULL |

| HOFFMAN  |         49800 |             NULL |

| AARAV    |         40200 |             NULL |

| FORD     |         36000 |             NULL |

| SCOTT    |         36000 |             NULL |

| JONES    |         35700 |             NULL |

| BLAKE    |         34200 |             NULL |

| CLARK    |         29400 |             NULL |

| Ruhan    |         24000 |             NULL |

| BANDISH  |         21000 |             NULL |

| GITA     |         21000 |             NULL |

| NATASHA  |         21000 |             NULL |

| SANGITA  |         21000 |             NULL |

| SHARMIN  |         21000 |             NULL |

| SUPRIYA  |         21000 |             NULL |

| THOMAS   |         21000 |             NULL |

| VRUSHALI |         21000 |             NULL |

| ALLEN    |         19200 |              300 |

| TURNER   |         18000 |                0 |

| ALEX     |         15000 |              500 |

| WARD     |         15000 |              500 |

| ADAMS    |         13200 |             NULL |

| Neel     |         12000 |             NULL |

| JAMES    |         11400 |             NULL |

| SMITH    |          9600 |             NULL |

+----------+---------------+------------------+

26 rows in set (0.01 sec)



**<Q.20. Display the Name and Job of sales executives or managers whose names end with the letter ‘S’.**  

**mysql> select ename As Name,job AS Job from emp where job in ('salesman','Manager') and ename like '%s';>**



+-------+----------+

| Name  | Job      |

+-------+----------+

| JONES | MANAGER  |

| GRASS | SALESMAN |

+-------+----------+

2 rows in set (0.00 sec)



**< Q.21. Display all the Names of the Employees whose Salary is either more than 1000 but not more than 2200.>** 



mysql> select ename from emp where sal >1000 and sal <= 2200;

+----------+

| ename    |

+----------+

| GITA     |

| VRUSHALI |

| SHARMIN  |

| BANDISH  |

| THOMAS   |

| ALLEN    |

| WARD     |

| MARTIN   |

| TURNER   |

| ADAMS    |

| Ruhan    |

| MILLER   |

| AARUSH   |

| ALEX     |

| NATASHA  |

| SANGITA  |

| SUPRIYA  |

+----------+

17 rows in set (0.01 sec)



**<Q.22. Select Name \& Salary of employees who are clerks. >**

mysql> select ename as name,sal as salary from emp where job = 'clerk';

+---------+--------+

| name    | salary |

+---------+--------+

| SMITH   |    800 |

| AARAV   |   3350 |

| THOMAS  |   1750 |

| ADAMS   |   1100 |

| JAMES   |    950 |

| MILLER  |   1300 |

| NATASHA |   1750 |

+---------+--------+

7 rows in set (0.01 sec)



**<Q.23. List the Department Number and Names of all Employees having Salary less than 2500.>**



mysql> select deptno As "Department Number",ename As "Name" from emp where sal <2500;

+-------------------+----------+

| Department Number | Name     |

+-------------------+----------+

|                30 | GITA     |

|                50 | VRUSHALI |

|                20 | SHARMIN  |

|                20 | BANDISH  |

|                20 | SMITH    |

|                10 | THOMAS   |

|                30 | ALLEN    |

|                30 | WARD     |

|                30 | MARTIN   |

|                10 | CLARK    |

|                30 | TURNER   |

|                20 | ADAMS    |

|                60 | Ruhan    |

|                60 | Neel     |

|                30 | JAMES    |

|                10 | MILLER   |

|                30 | AARUSH   |

|                30 | ALEX     |

|                30 | NATASHA  |

|                50 | SANGITA  |

|                50 | SUPRIYA  |

+-------------------+----------+

21 rows in set (0.00 sec)



**<Q.24. List the Employee Number and the Name of the President.>**

mysql> select empno ,ename from emp where job= 'president';

+-------+-------+

| empno | ename |

+-------+-------+

|  7839 | KING  |

+-------+-------+

1 row in set (0.00 sec)



**<Q.25. Display Names whose job is either Clerk or Analyst or Salesman.>**

mysql> select ename from emp where job in ('clerk', 'Analyst', 'salesman');

+---------+

| ename   |

+---------+

| SMITH   |

| AARAV   |

| THOMAS  |

| ALLEN   |

| WARD    |

| MARTIN  |

| SCOTT   |

| TURNER  |

| ADAMS   |

| JAMES   |

| FORD    |

| GRASS   |

| MILLER  |

| AARUSH  |

| NATASHA |

| SUPRIYA |

+---------+

16 rows in set (0.00 sec)



**< Q.26. List the Employees whose names start with ‘B’ or ‘M’ >**

mysql> select ename from emp where ename like 'B%' or ename like 'M%';

+---------+

| ename   |

+---------+

| BANDISH |

| MARTIN  |

| BLAKE   |

| MILLER  |

+---------+

4 rows in set (0.00 sec)

**<Q.27. Give a list of Employees sorted in alphabetic order of Names. >**

mysql> select ename from emp order by ename ASC;

+----------+

| ename    |

+----------+

| AARAV    |

| AARUSH   |

| ADAMS    |

| ALEX     |

| ALLEN    |

| BANDISH  |

| BLAKE    |

| CLARK    |

| FORD     |

| FRED     |

| GITA     |

| GRASS    |

| HOFFMAN  |

| JAMES    |

| JONES    |

| KING     |

| MARTIN   |

| MILLER   |

| NATASHA  |

| Neel     |

| Ruhan    |

| SANGITA  |

| SCOTT    |

| SHARMIN  |

| SMITH    |

| SUPRIYA  |

| THOMAS   |

| TURNER   |

| VRUSHALI |

| WARD     |

+----------+

30 rows in set (0.01 sec)

**<Q.28. Find out details of Employees where Commission is greater than 5% of the Salary. >**

mysql> select \* from emp where comm >(sal \* 0.05);

+-------+--------+--------+----------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

| EMPNO | ENAME  | GENDER | JOB      | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |

+-------+--------+--------+----------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

|  7499 | ALLEN  | M      | SALESMAN | 7698 | 1981-02-20 | 1600 |  300 |     30 |       4 | ALWAYS TESTE | sales@2017 | 7032300096 |        1 |

|  7521 | WARD   | M      | SALESMAN | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |

|  7654 | MARTIN | M      | SALESMAN | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |

|  7920 | GRASS  | M      | SALESMAN | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS        | sales@2017 | NULL       |        1 |

|  7934 | MILLER | M      | CLERK    | 7782 | 1982-01-23 | 1300 | 1300 |     10 |       2 | QUARTERNOTE  | r50mpm     | 7132300055 |        0 |

|  7945 | AARUSH | M      | SALESMAN | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |

|  7949 | ALEX   | M      | MANAGER  | 7698 | 1982-01-24 | 1250 |  500 |     30 |       5 | QUARTERREST  | sales@2017 | 7156567183 |        1 |

+-------+--------+--------+----------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

7 rows in set (0.01 sec)



**<Q.29. Create query to display the Employee Name and Department Number for empno 7566.>**



mysql> select ename AS"Employee Name",deptno AS "Department Number" from emp where empno = 7566;

+---------------+-------------------+

| Employee Name | Department Number |

+---------------+-------------------+

| JONES         |                20 |

+---------------+-------------------+

1 row in set (0.01 sec)



&#x20;**<Q.30. List the Name and Salary of Employees who earn more than $1500 and are in Department 10 or 30. Label the** 

**columns NAME and Monthly Salary, respectively. >**



mysql> select ename AS Name, sal AS "Monthly Salary" from emp where sal >1500 and deptno IN (10,30);

+---------+----------------+

| Name    | Monthly Salary |

+---------+----------------+

| GITA    |           1750 |

| AARAV   |           3350 |

| THOMAS  |           1750 |

| ALLEN   |           1600 |

| BLAKE   |           2850 |

| CLARK   |           2450 |

| KING    |           5000 |

| HOFFMAN |           4150 |

| GRASS   |           2575 |

| NATASHA |           1750 |

+---------+----------------+

10 rows in set (0.02 sec)



**<Q.31. Display the Name, Salary and Commission for all Employees who earn Commission. Sort data in descending** 

**order of Salary and Commission. >** 

mysql> select ename as name ,sal as salary ,comm as comission from emp where comm is not null order by sal desc,comm desc;

+--------+--------+-----------+

| name   | salary | comission |

+--------+--------+-----------+

| GRASS  |   2575 |      2700 |

| ALLEN  |   1600 |       300 |

| TURNER |   1500 |         0 |

| AARUSH |   1350 |      2700 |

| MILLER |   1300 |      1300 |

| MARTIN |   1250 |      1400 |

| WARD   |   1250 |       500 |

| ALEX   |   1250 |       500 |

+--------+--------+-----------+

8 rows in set (0.01 sec)



**<Q.32. Display the Names of all Employees with the third letter of their Name as an “A”.>**



mysql> select ename from emp where ename like '\_A%';

+---------+

| ename   |

+---------+

| BANDISH |

| AARAV   |

| WARD    |

| MARTIN  |

| JAMES   |

| AARUSH  |

| NATASHA |

| SANGITA |

+---------+

8 rows in set (0.02 sec)



**<Q.33. Display the name of all Employees that have two ‘LS’ in the name and are in department 30 or their manager is 7782. >**



mysql> SELECT ename

&#x20;   -> FROM emp

&#x20;   -> WHERE (

&#x20;   ->         (LENGTH(ename) - LENGTH(REPLACE(ename, 'LS', ''))) / 2 = 2

&#x20;   ->       )

&#x20;   ->   AND (deptno = 30 OR mgr = 7782);

Empty set (0.06 sec)



**<Q.34. Display Name, Job \& Sal for all Emp whose job is Clerk or Analyst and their Sal is not equal to 1000, 3000 \& 5000. >**

mysql> select ename as name,job as job ,sal as sal from emp where job in('clerk','analyst') and sal not in (1000,3000,5000);

+---------+---------+------+

| name    | job     | sal  |

+---------+---------+------+

| SMITH   | CLERK   |  800 |

| AARAV   | CLERK   | 3350 |

| THOMAS  | CLERK   | 1750 |

| ADAMS   | CLERK   | 1100 |

| JAMES   | CLERK   |  950 |

| MILLER  | CLERK   | 1300 |

| NATASHA | CLERK   | 1750 |

| SUPRIYA | ANALYST | 1750 |

+---------+---------+------+

8 rows in set (0.00 sec)



**<Q.35. Display the Name, Sal \& Comm for all Employees whose Comm amount is greater than their Sal increased by 10%.>**



mysql> select ename as name,sal as sal,comm as comm from emp where comm >(sal \*1.10);

+--------+------+------+

| name   | sal  | comm |

+--------+------+------+

| MARTIN | 1250 | 1400 |

| AARUSH | 1350 | 2700 |

+--------+------+------+

2 rows in set (0.00 sec)



**<Q.36.  Display Employee Number, Name, Gross Salary (Bonus + Salary\*12 + Commission) for all those Employees** 

**who belong to Department Number 20 or 30 in the ascending order of Employee Numbers. >**



mysql> SELECT empno AS "Employee Number",

&#x20;   ->        ename AS Name,

&#x20;   ->        (sal \* 12 + IFNULL(comm, 0)) AS "Gross Salary"

&#x20;   -> FROM emp

&#x20;   -> WHERE deptno IN (20, 30)

&#x20;   -> ORDER BY empno ASC;

+-----------------+---------+--------------+

| Employee Number | Name    | Gross Salary |

+-----------------+---------+--------------+

|            6001 | GITA    |        21000 |

|            6473 | SHARMIN |        21000 |

|            6781 | BANDISH |        21000 |

|            7369 | SMITH   |         9600 |

|            7499 | ALLEN   |        19500 |

|            7521 | WARD    |        15500 |

|            7566 | JONES   |        35700 |

|            7654 | MARTIN  |        16400 |

|            7698 | BLAKE   |        34200 |

|            7788 | SCOTT   |        36000 |

|            7840 | FRED    |        60000 |

|            7844 | TURNER  |        18000 |

|            7876 | ADAMS   |        13200 |

|            7900 | JAMES   |        11400 |

|            7902 | FORD    |        36000 |

|            7919 | HOFFMAN |        49800 |

|            7920 | GRASS   |        33600 |

|            7945 | AARUSH  |        18900 |

|            7949 | ALEX    |        15500 |

|            8433 | NATASHA |        21000 |

+-----------------+---------+--------------+

20 rows in set (0.01 sec)



**<Q.37. Display the Employee Number, Name, Salary, and Salary Increase by 15% expressed as a whole number.** 

**Label the column New Salary.>**



mysql> SELECT empno AS "Employee Number",

&#x20;   ->        ename AS Name,

&#x20;   ->        sal AS Salary,

&#x20;   ->        ROUND(sal \* 1.15) AS "New Salary"

&#x20;   -> FROM emp;

+-----------------+----------+--------+------------+

| Employee Number | Name     | Salary | New Salary |

+-----------------+----------+--------+------------+

|            6001 | GITA     |   1750 |       2013 |

|            6129 | VRUSHALI |   1750 |       2013 |

|            6473 | SHARMIN  |   1750 |       2013 |

|            6781 | BANDISH  |   1750 |       2013 |

|            7369 | SMITH    |    800 |        920 |

|            7415 | AARAV    |   3350 |       3853 |

|            7421 | THOMAS   |   1750 |       2013 |

|            7499 | ALLEN    |   1600 |       1840 |

|            7521 | WARD     |   1250 |       1438 |

|            7566 | JONES    |   2975 |       3421 |

|            7654 | MARTIN   |   1250 |       1438 |

|            7698 | BLAKE    |   2850 |       3278 |

|            7782 | CLARK    |   2450 |       2818 |

|            7788 | SCOTT    |   3000 |       3450 |

|            7839 | KING     |   5000 |       5750 |

|            7840 | FRED     |   5000 |       5750 |

|            7844 | TURNER   |   1500 |       1725 |

|            7876 | ADAMS    |   1100 |       1265 |

|            7888 | Ruhan    |   2000 |       2300 |

|            7889 | Neel     |   1000 |       1150 |

|            7900 | JAMES    |    950 |       1093 |

|            7902 | FORD     |   3000 |       3450 |

|            7919 | HOFFMAN  |   4150 |       4773 |

|            7920 | GRASS    |   2575 |       2961 |

|            7934 | MILLER   |   1300 |       1495 |

|            7945 | AARUSH   |   1350 |       1553 |

|            7949 | ALEX     |   1250 |       1438 |

|            8433 | NATASHA  |   1750 |       2013 |

|            9400 | SANGITA  |   1750 |       2013 |

|            9473 | SUPRIYA  |   1750 |       2013 |

+-----------------+----------+--------+------------+

30 rows in set (0.01 sec)



mysql> SELECT CONCAT(UPPER(LEFT(ename, 1)), LOWER(SUBSTRING(ename, 2))) AS Name

&#x20;   -> FROM emp;

+----------+

| Name     |

+----------+

| Gita     |

| Vrushali |

| Sharmin  |

| Bandish  |

| Smith    |

| Aarav    |

| Thomas   |

| Allen    |

| Ward     |

| Jones    |

| Martin   |

| Blake    |

| Clark    |

| Scott    |

| King     |

| Fred     |

| Turner   |

| Adams    |

| Ruhan    |

| Neel     |

| James    |

| Ford     |

| Hoffman  |

| Grass    |

| Miller   |

| Aarush   |

| Alex     |

| Natasha  |

| Sangita  |

| Supriya  |

+----------+

30 rows in set (0.01 sec)

**<Q.38. Write a query that will display the employees name with the first letter capitalized an other letters** 

**lowercase and the length of their name, for all employees whose name starts with J, A or M..>** 



mysql> SELECT CONCAT(UPPER(LEFT(ename, 1)), LOWER(SUBSTRING(ename, 2))) AS Name,

&#x20;   ->        LENGTH(ename) AS "Name Length"

&#x20;   -> FROM emp

&#x20;   -> WHERE ename LIKE 'J%'

&#x20;   ->    OR ename LIKE 'A%'

&#x20;   ->    OR ename LIKE 'M%';

+--------+-------------+

| Name   | Name Length |

+--------+-------------+

| Aarav  |           5 |

| Allen  |           5 |

| Jones  |           5 |

| Martin |           6 |

| Adams  |           5 |

| James  |           5 |

| Miller |           6 |

| Aarush |           6 |

| Alex   |           4 |

+--------+-------------+

9 rows in set (0.00 sec)



**<Q.39. Create a query that will display the Employees name and commission amount. If the employee does not** 

**earn commission, put “No Commission”.>**



mysql> SELECT ename AS Name,

&#x20;   ->        IFNULL(comm, 'No Commission') AS Commission

&#x20;   -> FROM emp;

+----------+---------------+

| Name     | Commission    |

+----------+---------------+

| GITA     | No Commission |

| VRUSHALI | No Commission |

| SHARMIN  | No Commission |

| BANDISH  | No Commission |

| SMITH    | No Commission |

| AARAV    | No Commission |

| THOMAS   | No Commission |

| ALLEN    | 300           |

| WARD     | 500           |

| JONES    | No Commission |

| MARTIN   | 1400          |

| BLAKE    | No Commission |

| CLARK    | No Commission |

| SCOTT    | No Commission |

| KING     | No Commission |

| FRED     | No Commission |

| TURNER   | 0             |

| ADAMS    | No Commission |

| Ruhan    | No Commission |

| Neel     | No Commission |

| JAMES    | No Commission |

| FORD     | No Commission |

| HOFFMAN  | No Commission |

| GRASS    | 2700          |

| MILLER   | 1300          |

| AARUSH   | 2700          |

| ALEX     | 500           |

| NATASHA  | No Commission |

| SANGITA  | No Commission |

| SUPRIYA  | No Commission |

+----------+---------------+

30 rows in set (0.00 sec)



<**Q.40. Display Customers Name, Sales Amount approximate Profit Earned (Profit = 8% of Sales Amount) in** 

**whole numbers. >**



mysql> SELECT customer\_name AS "Customer Name",

&#x20;   ->        sales\_amount AS "Sales Amount",

&#x20;   ->        ROUND(sales\_amount \* 0.08) AS "Profit Earned"

&#x20;   -> FROM customers;

ERROR 1054 (42S22): Unknown column 'customer\_name' in 'field list'

mysql> SELECT name AS "Customer Name",

&#x20;   ->        amount AS "Sales Amount",

&#x20;   ->        ROUND(amount \* 0.08) AS "Profit Earned"

&#x20;   -> FROM customers;

ERROR 1054 (42S22): Unknown column 'name' in 'field list'

mysql> ^C

mysql> SELECT name AS "Customer Name",

&#x20;   ->        amount AS "Sales Amount",

&#x20;   ->        ROUND(amount \* 0.08) AS "Profit Earned"

&#x20;   -> FROM customers;

ERROR 1054 (42S22): Unknown column 'name' in 'field list'

mysql> desc customers;

+--------+-------------+------+-----+---------+-------+

| Field  | Type        | Null | Key | Default | Extra |

+--------+-------------+------+-----+---------+-------+

| CNUM   | int         | NO   | PRI | NULL    |       |

| CNAME  | varchar(10) | YES  |     | NULL    |       |

| CITY   | varchar(10) | YES  |     | NULL    |       |

| RATING | float       | YES  |     | NULL    |       |

| SNUM   | int         | YES  | MUL | NULL    |       |

+--------+-------------+------+-----+---------+-------+

5 rows in set (0.09 sec)



mysql> SELECT CNAME AS "Customer Name",

&#x20;   ->        RATING AS "Sales Amount",

&#x20;   ->        ROUND(RATING \* 0.08) AS "Profit Earned"

&#x20;   -> FROM customers;

+---------------+--------------+---------------+

| Customer Name | Sales Amount | Profit Earned |

+---------------+--------------+---------------+

| Saleel        |          250 |            20 |

| Nitish        |          250 |            20 |

| Santosh       |          100 |             8 |

| Joe           |          200 |            16 |

| Raj           |          200 |            16 |

| Grass         |          300 |            24 |

| Raja          |          100 |             8 |

| Jackson       |          100 |             8 |

| William       |          300 |            24 |

| Smith         |          300 |            24 |

| ADAMS         |          250 |            20 |

+---------------+--------------+---------------+

11 rows in set (0.01 sec)



**<Q.41. Using the sales table, you need to report the following**  

**a. Sales for the first quarter of the year of 1999** 

**b. Sales for the product SP TENNIS RACKET >**



mysql> SELECT \*

&#x20;   -> FROM sales

&#x20;   -> WHERE sale\_date BETWEEN '1999-01-01' AND '1999-03-31';

ERROR 1054 (42S22): Unknown column 'sale\_date' in 'where clause'

mysql> desc sales;

+----------+--------------+------+-----+---------+-------+

| Field    | Type         | Null | Key | Default | Extra |

+----------+--------------+------+-----+---------+-------+

| REPID    | int          | NO   |     | NULL    |       |

| CUSTID   | int          | YES  |     | NULL    |       |

| CUSTNAME | varchar(45)  | YES  |     | NULL    |       |

| PRODID   | int          | NO   |     | NULL    |       |

| PRODNAME | varchar(30)  | YES  |     | NULL    |       |

| AMOUNT   | double(19,2) | YES  |     | NULL    |       |

+----------+--------------+------+-----+---------+-------+

6 rows in set (0.02 sec)



mysql> SELECT \*

&#x20;   -> FROM sales

&#x20;   -> WHERE PRODNAME = 'SP TENNIS RACKET';

+-------+--------+----------------+--------+------------------+---------+

| REPID | CUSTID | CUSTNAME       | PRODID | PRODNAME         | AMOUNT  |

+-------+--------+----------------+--------+------------------+---------+

|  7499 |    104 | EVERY MOUNTAIN | 101860 | SP TENNIS RACKET |   24.00 |

|  7844 |    108 | NORTH WOODS    | 101860 | SP TENNIS RACKET | 4800.00 |

|  7844 |    105 | K + T SPORTS   | 101860 | SP TENNIS RACKET | 2400.00 |

+-------+--------+----------------+--------+------------------+---------+

3 rows in set (0.03 sec)



mysql> SELECT \*

&#x20;   -> FROM sales

&#x20;   -> WHERE SALEDATE BETWEEN '1999-01-01' AND '1999-03-31';

ERROR 1054 (42S22): Unknown column 'SALEDATE' in 'where clause'

mysql> ^C

mysql> SELECT \*

&#x20;   -> FROM sales

&#x20;   -> WHERE PRODNAME = 'SP TENNIS RACKET';

+-------+--------+----------------+--------+------------------+---------+

| REPID | CUSTID | CUSTNAME       | PRODID | PRODNAME         | AMOUNT  |

+-------+--------+----------------+--------+------------------+---------+

|  7499 |    104 | EVERY MOUNTAIN | 101860 | SP TENNIS RACKET |   24.00 |

|  7844 |    108 | NORTH WOODS    | 101860 | SP TENNIS RACKET | 4800.00 |

|  7844 |    105 | K + T SPORTS   | 101860 | SP TENNIS RACKET | 2400.00 |

+-------+--------+----------------+--------+------------------+---------+

3 rows in set (0.00 sec)



**<Q.42. Consider the Customer table. The Credit Limit of all the Customers is increased by 25%. Calculate the** 

**new Credit Limit and display the same along with the Name, Repid and Credit Limit for all the** 

**Customers. The following should be implemented in the query result set:** 

**a. The Credit Limit should be expressed as a whole number, prefixed with a $ symbol.** 

**b. Total length of the new Credit Limit should be 10.** 

**c. Names of the Customers should be displayed in the title case.>**

mysql> SELECT

&#x20;   ->   CONCAT(

&#x20;   ->     UPPER(LEFT(CNAME,1)),

&#x20;   ->     LOWER(SUBSTRING(CNAME,2))

&#x20;   ->   ) AS Name,

&#x20;   ->   SNUM AS REPID,

&#x20;   ->   CONCAT('$', LPAD(ROUND(CREDIT\_LIMIT \* 1.25), 9, ' ')) AS "New Credit Limit"

&#x20;   -> FROM customers;

ERROR 1054 (42S22): Unknown column 'CREDIT\_LIMIT' in 'field list'

mysql> ^C

mysql> SELECT

&#x20;   ->   CONCAT(

&#x20;   ->     UPPER(LEFT(CNAME,1)),

&#x20;   ->     LOWER(SUBSTRING(CNAME,2))

&#x20;   ->   ) AS Name,

&#x20;   ->   SNUM AS REPID,

&#x20;   ->   CONCAT('$', LPAD(ROUND(RATING \* 1.25), 9, ' ')) AS "New Credit Limit"

&#x20;   -> FROM customers;

+---------+-------+------------------+

| Name    | REPID | New Credit Limit |

+---------+-------+------------------+

| Saleel  |  1007 | $      312       |

| Nitish  |  1007 | $      312       |

| Santosh |  1001 | $      125       |

| Joe     |  1003 | $      250       |

| Raj     |  1002 | $      250       |

| Grass   |  1002 | $      375       |

| Raja    |  1001 | $      125       |

| Jackson |  1004 | $      125       |

| William |  1007 | $      375       |

| Smith   |  1007 | $      375       |

| Adams   |  1007 | $      312       |

+---------+-------+------------------+

11 rows in set (0.00 sec)



**<Q.43. Display the name and the department number of all employees. The department number should be** 

**displayed in the following manner:**  

**a. If the department number is 10, display ‘Belongs to Dept. 10’** 

**b. If 20, display ‘Belongs to the Dept. 20’** 

**c. Otherwise display ‘Neither 10 nor 20.’>**

mysql> SELECT

&#x20;   ->   ename AS Name,

&#x20;   ->   CASE

&#x20;   ->     WHEN deptno = 10 THEN 'Belongs to Dept. 10'

&#x20;   ->     WHEN deptno = 20 THEN 'Belongs to the Dept. 20'

&#x20;   ->     ELSE 'Neither 10 nor 20'

&#x20;   ->   END AS "Department Info"

&#x20;   -> FROM emp;

+----------+-------------------------+

| Name     | Department Info         |

+----------+-------------------------+

| GITA     | Neither 10 nor 20       |

| VRUSHALI | Neither 10 nor 20       |

| SHARMIN  | Belongs to the Dept. 20 |

| BANDISH  | Belongs to the Dept. 20 |

| SMITH    | Belongs to the Dept. 20 |

| AARAV    | Belongs to Dept. 10     |

| THOMAS   | Belongs to Dept. 10     |

| ALLEN    | Neither 10 nor 20       |

| WARD     | Neither 10 nor 20       |

| JONES    | Belongs to the Dept. 20 |

| MARTIN   | Neither 10 nor 20       |

| BLAKE    | Neither 10 nor 20       |

| CLARK    | Belongs to Dept. 10     |

| SCOTT    | Belongs to the Dept. 20 |

| KING     | Belongs to Dept. 10     |

| FRED     | Belongs to the Dept. 20 |

| TURNER   | Neither 10 nor 20       |

| ADAMS    | Belongs to the Dept. 20 |

| Ruhan    | Neither 10 nor 20       |

| Neel     | Neither 10 nor 20       |

| JAMES    | Neither 10 nor 20       |

| FORD     | Belongs to the Dept. 20 |

| HOFFMAN  | Neither 10 nor 20       |

| GRASS    | Neither 10 nor 20       |

| MILLER   | Belongs to Dept. 10     |

| AARUSH   | Neither 10 nor 20       |

| ALEX     | Neither 10 nor 20       |

| NATASHA  | Neither 10 nor 20       |

| SANGITA  | Neither 10 nor 20       |

| SUPRIYA  | Neither 10 nor 20       |

+----------+-------------------------+

30 rows in set (0.00 sec)

**<Q.44. Display the name, first letter of the name (as Abbreviated Name) and the annual compensation for all** 

**employees. The following issues should be taken care of:** 

**a. The annual compensation has to be calculated by adding the salary and the commission earned by** 

**the employee and multiplying the value by 12.** 

**b. The first letter of the employee name should be in upper case.**  

**c. If the employee does not earn any commission, the commission values should be taken as 600. >**

mysql> SELECT

&#x20;   ->   ename AS Name,

&#x20;   ->   UPPER(LEFT(ename, 1)) AS "Abbreviated Name",

&#x20;   ->   ((sal + IFNULL(comm, 600)) \* 12) AS "Annual Compensation"

&#x20;   -> FROM emp;

+----------+------------------+---------------------+

| Name     | Abbreviated Name | Annual Compensation |

+----------+------------------+---------------------+

| GITA     | G                |               28200 |

| VRUSHALI | V                |               28200 |

| SHARMIN  | S                |               28200 |

| BANDISH  | B                |               28200 |

| SMITH    | S                |               16800 |

| AARAV    | A                |               47400 |

| THOMAS   | T                |               28200 |

| ALLEN    | A                |               22800 |

| WARD     | W                |               21000 |

| JONES    | J                |               42900 |

| MARTIN   | M                |               31800 |

| BLAKE    | B                |               41400 |

| CLARK    | C                |               36600 |

| SCOTT    | S                |               43200 |

| KING     | K                |               67200 |

| FRED     | F                |               67200 |

| TURNER   | T                |               18000 |

| ADAMS    | A                |               20400 |

| Ruhan    | R                |               31200 |

| Neel     | N                |               19200 |

| JAMES    | J                |               18600 |

| FORD     | F                |               43200 |

| HOFFMAN  | H                |               57000 |

| GRASS    | G                |               63300 |

| MILLER   | M                |               31200 |

| AARUSH   | A                |               48600 |

| ALEX     | A                |               21000 |

| NATASHA  | N                |               28200 |

| SANGITA  | S                |               28200 |

| SUPRIYA  | S                |               28200 |

+----------+------------------+---------------------+

30 rows in set (0.00 sec)



**<Q.45. Display the Order ID, the Total Value of the Order and the Commission Plan taking into consideration** 

**the following-** 

**a. If the Commission Plan is A display it as** 

**Anonymous**  

**b. If the Commission Plan is B display it as     Business** 

**c. If the Commission Plan is C display it as**  

**Casual** 

**d. If no Commission Plan has been mentioned then display Commission Not Allowed.>**



mysql> Display the Order ID, the Total Value of the Order and the Commission Plan taking into consideration

&#x20;   -> the following-

&#x20;   -> a. If the Commission Plan is A display it as

&#x20;   -> Anonymous

&#x20;   -> b. If the Commission Plan is B display it as     Business

&#x20;   -> c. If the Commission Plan is C display it as

&#x20;   -> Casual

&#x20;   -> d. If no Commission Plan has been mentioned then display Commission Not Allowed.

&#x20;   ->

&#x20;   ->

&#x20;   -> ^C

mysql> SELECT

&#x20;   ->   order\_id AS "Order ID",

&#x20;   ->   total\_value AS "Total Value",

&#x20;   ->   CASE

&#x20;   ->     WHEN commission\_plan = 'A' THEN 'Anonymous'

&#x20;   ->     WHEN commission\_plan = 'B' THEN 'Business'

&#x20;   ->     WHEN commission\_plan = 'C' THEN 'Casual'

&#x20;   ->     WHEN commission\_plan IS NULL THEN 'Commission Not Allowed'

&#x20;   ->   END AS "Commission Plan"

&#x20;   -> FROM orders;

ERROR 1054 (42S22): Unknown column 'order\_id' in 'field list'

mysql> ^C

mysql> desc orders;

+------------------+-------------+------+-----+---------+-------+

| Field            | Type        | Null | Key | Default | Extra |

+------------------+-------------+------+-----+---------+-------+

| ONUM             | int         | NO   | PRI | NULL    |       |

| AMT              | float       | YES  |     | NULL    |       |

| ODATE            | datetime    | YES  |     | NULL    |       |

| CNUM             | int         | YES  | MUL | NULL    |       |

| SNUM             | int         | YES  | MUL | NULL    |       |

| type             | varchar(10) | YES  |     | NULL    |       |

| paymentType      | varchar(20) | YES  |     | NULL    |       |

| registered       | tinyint(1)  | YES  |     | NULL    |       |

| delivery\_partner | varchar(12) | YES  |     | NULL    |       |

+------------------+-------------+------+-----+---------+-------+

9 rows in set (0.01 sec)



mysql> SELECT

&#x20;   ->   ONUM AS "Order ID",

&#x20;   ->   AMT AS "Total Value",

&#x20;   ->   CASE

&#x20;   ->     WHEN type = 'A' THEN 'Anonymous'

&#x20;   ->     WHEN type = 'B' THEN 'Business'

&#x20;   ->     WHEN type = 'C' THEN 'Casual'

&#x20;   ->     WHEN type IS NULL THEN 'Commission Not Allowed'

&#x20;   ->     ELSE 'Commission Not Allowed'

&#x20;   ->   END AS "Commission Plan"

&#x20;   -> FROM orders;

+----------+-------------+------------------------+

| Order ID | Total Value | Commission Plan        |

+----------+-------------+------------------------+

|     2322 |       750.1 | Commission Not Allowed |

|     2364 |       750.1 | Commission Not Allowed |

|     2475 |       750.1 | Commission Not Allowed |

|     3001 |       18.69 | Commission Not Allowed |

|     3002 |      1900.1 | Commission Not Allowed |

|     3003 |      767.19 | Commission Not Allowed |

|     3005 |     5160.45 | Commission Not Allowed |

|     3006 |     1098.16 | Commission Not Allowed |

|     3007 |       75.75 | Commission Not Allowed |

|     3008 |        4723 | Commission Not Allowed |

|     3009 |     1713.23 | Commission Not Allowed |

|     3010 |     1309.95 | Commission Not Allowed |

|     3011 |     9891.88 | Commission Not Allowed |

|     3012 |     3455.78 | Commission Not Allowed |

|     3013 |     1245.98 | Commission Not Allowed |

|     3014 |     3721.53 | Commission Not Allowed |

|     3015 |       734.5 | Commission Not Allowed |

|     3016 |     1729.67 | Commission Not Allowed |

|     3017 |       18.69 | Commission Not Allowed |

|     3018 |      767.19 | Commission Not Allowed |

|     3019 |      1900.1 | Commission Not Allowed |

|     3020 |     5160.45 | Commission Not Allowed |

|     3021 |     1098.16 | Commission Not Allowed |

|     3022 |     1713.23 | Commission Not Allowed |

|     3023 |       75.75 | Commission Not Allowed |

|     3024 |        4723 | Commission Not Allowed |

|     3025 |     1309.95 | Commission Not Allowed |

|     3026 |     9891.88 | Commission Not Allowed |

|     3027 |     3455.78 | Commission Not Allowed |

|     3028 |     1245.98 | Commission Not Allowed |

|     3029 |     3721.53 | Commission Not Allowed |

|     3030 |       734.5 | Commission Not Allowed |

|     3031 |     1729.67 | Commission Not Allowed |

|     3032 |     3434.55 | Commission Not Allowed |

|     3033 |      522.23 | Commission Not Allowed |

|     3049 |      500.58 | Commission Not Allowed |

|     3050 |      1900.1 | Commission Not Allowed |

|     3074 |       457.4 | Commission Not Allowed |

|     3119 |       125.5 | Commission Not Allowed |

|     4001 |       145.2 | Commission Not Allowed |

|     4012 |       245.6 | Commission Not Allowed |

|     4021 |      600.65 | Commission Not Allowed |

|     4054 |      1200.8 | Commission Not Allowed |

|     5001 |      325.23 | Commission Not Allowed |

|     5011 |      138.35 | Commission Not Allowed |

|     5014 |      980.65 | Commission Not Allowed |

|     5015 |     2133.35 | Commission Not Allowed |

|     5016 |     1000.95 | Commission Not Allowed |

|     5020 |      950.45 | Commission Not Allowed |

|     5034 |      120.16 | Commission Not Allowed |

|     5053 |      1500.5 | Commission Not Allowed |

|     5056 |       750.1 | Commission Not Allowed |

|     5099 |      790.75 | Commission Not Allowed |

|     6501 |      125.45 | Commission Not Allowed |

|     6502 |      535.25 | Commission Not Allowed |

|     6503 |     1100.25 | Commission Not Allowed |

|     6504 |     1350.75 | Commission Not Allowed |

|     6605 |      1900.1 | Commission Not Allowed |

|     6606 |     5160.45 | Commission Not Allowed |

|     6607 |     1098.16 | Commission Not Allowed |

|     6608 |     1713.23 | Commission Not Allowed |

+----------+-------------+------------------------+

61 rows in set (0.00 sec)



**<Q.46.  List all the employees who are living in ‘BOSTON’. >**



mysql> SELECT e.ename

&#x20;   -> FROM emp e

&#x20;   -> JOIN dept d ON e.deptno = d.deptno

&#x20;   -> WHERE d.loc = 'BOSTON';

Empty set (0.01 sec)



mysql> SELECT \* FROM dept WHERE loc = 'BOSTON';

+--------+------------+--------+---------+------------+

| DEPTNO | DNAME      | LOC    | PWD     | STARTEDON  |

+--------+------------+--------+---------+------------+

|     40 | OPERATIONS | BOSTON | opr@123 | 12/07/1989 |

+--------+------------+--------+---------+------------+

1 row in set (0.00 sec)



mysql> SELECT DISTINCT loc FROM dept;

+----------+

| loc      |

+----------+

| NEW YORK |

| DALLAS   |

| CHICAGO  |

| BOSTON   |

| PUNE     |

| BARODA   |

+----------+

6 rows in set (0.00 sec)



mysql> SELECT e.ename, d.loc

&#x20;   -> FROM emp e

&#x20;   -> JOIN dept d ON e.deptno = d.deptno;

+----------+----------+

| ename    | loc      |

+----------+----------+

| AARAV    | NEW YORK |

| THOMAS   | NEW YORK |

| CLARK    | NEW YORK |

| KING     | NEW YORK |

| MILLER   | NEW YORK |

| SHARMIN  | DALLAS   |

| BANDISH  | DALLAS   |

| SMITH    | DALLAS   |

| JONES    | DALLAS   |

| SCOTT    | DALLAS   |

| FRED     | DALLAS   |

| ADAMS    | DALLAS   |

| FORD     | DALLAS   |

| GITA     | CHICAGO  |

| ALLEN    | CHICAGO  |

| WARD     | CHICAGO  |

| MARTIN   | CHICAGO  |

| BLAKE    | CHICAGO  |

| TURNER   | CHICAGO  |

| JAMES    | CHICAGO  |

| HOFFMAN  | CHICAGO  |

| GRASS    | CHICAGO  |

| AARUSH   | CHICAGO  |

| ALEX     | CHICAGO  |

| NATASHA  | CHICAGO  |

| VRUSHALI | PUNE     |

| SANGITA  | PUNE     |

| SUPRIYA  | PUNE     |

| Ruhan    | BARODA   |

| Neel     | BARODA   |

+----------+----------+

30 rows in set (0.00 sec)



mysql> SELECT e.ename

&#x20;   -> FROM emp e

&#x20;   -> JOIN dept d ON e.deptno = d.deptno

&#x20;   -> WHERE UPPER(d.loc) = 'BOSTON';

Empty set (0.00 sec)





**<Q.47.  List the names of employees who stay in city whose second letter is ‘A’ or ‘H’.>**

mysql> SELECT e.ename

&#x20;   -> FROM emp e

&#x20;   -> JOIN dept d ON e.deptno = d.deptno

&#x20;   -> WHERE d.loc LIKE '\_A%'

&#x20;   ->    OR d.loc LIKE '\_H%';

+---------+

| ename   |

+---------+

| SHARMIN |

| BANDISH |

| SMITH   |

| JONES   |

| SCOTT   |

| FRED    |

| ADAMS   |

| FORD    |

| GITA    |

| ALLEN   |

| WARD    |

| MARTIN  |

| BLAKE   |

| TURNER  |

| JAMES   |

| HOFFMAN |

| GRASS   |

| AARUSH  |

| ALEX    |

| NATASHA |

| Ruhan   |

| Neel    |

+---------+

22 rows in set (0.01 sec)

**<Q.48. List names of employees who are working in ‘SALES’ department.>**

mysql> SELECT e.ename

&#x20;   -> FROM emp e

&#x20;   -> JOIN dept d ON e.deptno = d.deptno

&#x20;   -> WHERE d.dname = 'SALES';

+---------+

| ename   |

+---------+

| GITA    |

| ALLEN   |

| WARD    |

| MARTIN  |

| BLAKE   |

| TURNER  |

| JAMES   |

| HOFFMAN |

| GRASS   |

| AARUSH  |

| ALEX    |

| NATASHA |

+---------+

12 rows in set (0.00 sec)



<**Q.49. Print the name of employees in the ascending order of employee name. >**

mysql> SELECT ename

&#x20;   -> FROM emp

&#x20;   -> ORDER BY ename ASC;

+----------+

| ename    |

+----------+

| AARAV    |

| AARUSH   |

| ADAMS    |

| ALEX     |

| ALLEN    |

| BANDISH  |

| BLAKE    |

| CLARK    |

| FORD     |

| FRED     |

| GITA     |

| GRASS    |

| HOFFMAN  |

| JAMES    |

| JONES    |

| KING     |

| MARTIN   |

| MILLER   |

| NATASHA  |

| Neel     |

| Ruhan    |

| SANGITA  |

| SCOTT    |

| SHARMIN  |

| SMITH    |

| SUPRIYA  |

| THOMAS   |

| TURNER   |

| VRUSHALI |

| WARD     |

+----------+

30 rows in set (0.00 sec)



<**Q.50. Print employee information in the descending order of salary>**

mysql> SELECT \*

&#x20;   -> FROM emp

&#x20;   -> ORDER BY sal DESC;

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

| EMPNO | ENAME    | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

|  7839 | KING     | M      | PRESIDENT           | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING         | r50mpm     | 7132300081 |        1 |

|  7840 | FRED     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE   | a12recmpm  | NULL       |        1 |

|  7919 | HOFFMAN  | M      | MANAGER             | 7566 | 1982-03-24 | 4150 | NULL |     30 |       3 | INTERVAL     | sales@2017 | NULL       |        1 |

|  7415 | AARAV    | M      | CLERK               | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV        | NULL       | 7032300084 |        0 |

|  7788 | SCOTT    | M      | ANALYST             | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND   | a12recmpm  | NULL       |        1 |

|  7902 | FORD     | M      | ANALYST             | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO      | a12recmpm  | NULL       |        0 |

|  7566 | JONES    | M      | MANAGER             | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB    | a12recmpm  | 7132300039 |        1 |

|  7698 | BLAKE    | M      | MANAGER             | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN      | sales@2017 | 7132300027 |        1 |

|  7920 | GRASS    | M      | SALESMAN            | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS        | sales@2017 | NULL       |        1 |

|  7782 | CLARK    | M      | MANAGER             | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK        | r50mpm     | 7032300001 |        1 |

|  7888 | Ruhan    | M      | Network             | 7888 | 1983-08-09 | 2000 | NULL |     60 |       1 | Ruhan        | BRD@1122   | NULL       |        1 |

|  6001 | GITA     | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | GITA         | sales@2017 | NULL       |        1 |

|  6129 | VRUSHALI | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | VRUSHALI     | PUN@8877   | NULL       |        1 |

|  6473 | SHARMIN  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | SHARMIN      | a12recmpm  | NULL       |        1 |

|  6781 | BANDISH  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |

|  7421 | THOMAS   | M      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     10 |       1 | THOMAS       | r50mpm     | 7032300011 |        0 |

|  8433 | NATASHA  | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |

|  9400 | SANGITA  | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |

|  9473 | SUPRIYA  | F      | ANALYST             | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SUPRIYA      | XYZ@1234   | NULL       |        1 |

|  7499 | ALLEN    | M      | SALESMAN            | 7698 | 1981-02-20 | 1600 |  300 |     30 |       4 | ALWAYS TESTE | sales@2017 | 7032300096 |        1 |

|  7844 | TURNER   | M      | SALESMAN            | 7698 | 1981-09-08 | 1500 |    0 |     30 |       5 | SAND DUST    | sales@2017 | NULL       |        1 |

|  7945 | AARUSH   | M      | SALESMAN            | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |

|  7934 | MILLER   | M      | CLERK               | 7782 | 1982-01-23 | 1300 | 1300 |     10 |       2 | QUARTERNOTE  | r50mpm     | 7132300055 |        0 |

|  7521 | WARD     | M      | SALESMAN            | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |

|  7654 | MARTIN   | M      | SALESMAN            | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |

|  7949 | ALEX     | M      | MANAGER             | 7698 | 1982-01-24 | 1250 |  500 |     30 |       5 | QUARTERREST  | sales@2017 | 7156567183 |        1 |

|  7876 | ADAMS    | M      | CLERK               | 7788 | 1983-01-12 | 1100 | NULL |     20 |       1 | CRAZY ANYONE | a12recmpm  | 7132300086 |        1 |

|  7889 | Neel     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 1000 | NULL |     60 |       0 | Neel         | BRD@1122   | NULL       |        1 |

|  7900 | JAMES    | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |

|  7369 | SMITH    | M      | CLERK               | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE      | a12recmpm  | 7032300023 |        0 |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

30 rows in set (0.00 sec)



**<Q.51. Display employee information in ascending order of year.>**

mysql> SELECT \*

&#x20;   -> FROM emp

&#x20;   -> ORDER BY YEAR(hiredate) ASC;

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

| EMPNO | ENAME    | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

|  7369 | SMITH    | M      | CLERK               | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE      | a12recmpm  | 7032300023 |        0 |

|  7920 | GRASS    | M      | SALESMAN            | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS        | sales@2017 | NULL       |        1 |

|  7945 | AARUSH   | M      | SALESMAN            | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH       | ABCDEF     | NULL       |        0 |

|  6001 | GITA     | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | GITA         | sales@2017 | NULL       |        1 |

|  6129 | VRUSHALI | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | VRUSHALI     | PUN@8877   | NULL       |        1 |

|  6473 | SHARMIN  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | SHARMIN      | a12recmpm  | NULL       |        1 |

|  6781 | BANDISH  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |

|  7415 | AARAV    | M      | CLERK               | 7902 | 1981-12-31 | 3350 | NULL |     10 |    NULL | AARAV        | NULL       | 7032300084 |        0 |

|  7421 | THOMAS   | M      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     10 |       1 | THOMAS       | r50mpm     | 7032300011 |        0 |

|  7499 | ALLEN    | M      | SALESMAN            | 7698 | 1981-02-20 | 1600 |  300 |     30 |       4 | ALWAYS TESTE | sales@2017 | 7032300096 |        1 |

|  7521 | WARD     | M      | SALESMAN            | 7698 | 1981-02-22 | 1250 |  500 |     30 |       1 | WARD         | sales@2017 | 7132300034 |        1 |

|  7566 | JONES    | M      | MANAGER             | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB    | a12recmpm  | 7132300039 |        1 |

|  7654 | MARTIN   | M      | SALESMAN            | 7698 | 1981-09-28 | 1250 | 1400 |     30 |       6 | LIFE RACER   | sales@2017 | 7132300050 |        1 |

|  7698 | BLAKE    | M      | MANAGER             | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN      | sales@2017 | 7132300027 |        1 |

|  7782 | CLARK    | M      | MANAGER             | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK        | r50mpm     | 7032300001 |        1 |

|  7839 | KING     | M      | PRESIDENT           | NULL | 1981-11-17 | 5000 | NULL |     10 |       1 | KING         | r50mpm     | 7132300081 |        1 |

|  7844 | TURNER   | M      | SALESMAN            | 7698 | 1981-09-08 | 1500 |    0 |     30 |       5 | SAND DUST    | sales@2017 | NULL       |        1 |

|  7900 | JAMES    | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |

|  7902 | FORD     | M      | ANALYST             | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO      | a12recmpm  | NULL       |        0 |

|  8433 | NATASHA  | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |

|  9400 | SANGITA  | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |

|  9473 | SUPRIYA  | F      | ANALYST             | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SUPRIYA      | XYZ@1234   | NULL       |        1 |

|  7788 | SCOTT    | M      | ANALYST             | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND   | a12recmpm  | NULL       |        1 |

|  7919 | HOFFMAN  | M      | MANAGER             | 7566 | 1982-03-24 | 4150 | NULL |     30 |       3 | INTERVAL     | sales@2017 | NULL       |        1 |

|  7934 | MILLER   | M      | CLERK               | 7782 | 1982-01-23 | 1300 | 1300 |     10 |       2 | QUARTERNOTE  | r50mpm     | 7132300055 |        0 |

|  7949 | ALEX     | M      | MANAGER             | 7698 | 1982-01-24 | 1250 |  500 |     30 |       5 | QUARTERREST  | sales@2017 | 7156567183 |        1 |

|  7840 | FRED     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 5000 | NULL |     20 |       1 | SAND STONE   | a12recmpm  | NULL       |        1 |

|  7876 | ADAMS    | M      | CLERK               | 7788 | 1983-01-12 | 1100 | NULL |     20 |       1 | CRAZY ANYONE | a12recmpm  | 7132300086 |        1 |

|  7888 | Ruhan    | M      | Network             | 7888 | 1983-08-09 | 2000 | NULL |     60 |       1 | Ruhan        | BRD@1122   | NULL       |        1 |

|  7889 | Neel     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 1000 | NULL |     60 |       0 | Neel         | BRD@1122   | NULL       |        1 |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

30 rows in set (0.00 sec)



<Q.**52. Display job, deptno, names of employee whose name starts with ‘B’ or ‘M’.>**

mysql> SELECT job, deptno, ename

&#x20;   -> FROM emp

&#x20;   -> WHERE ename LIKE 'B%'

&#x20;   ->    OR ename LIKE 'M%';

+-----------------+--------+---------+

| job             | deptno | ename   |

+-----------------+--------+---------+

| Public Relation |     20 | BANDISH |

| SALESMAN        |     30 | MARTIN  |

| MANAGER         |     30 | BLAKE   |

| CLERK           |     10 | MILLER  |

+-----------------+--------+---------+

4 rows in set (0.00 sec)

**<Q.53. List the employees whose comm is null and salary does not exceed 3000>**

mysql> SELECT \*

&#x20;   -> FROM emp

&#x20;   -> WHERE comm IS NULL

&#x20;   ->   AND sal <= 3000;

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

| EMPNO | ENAME    | GENDER | JOB                 | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME    | PWD        | PHONE      | isActive |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

|  6001 | GITA     | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | GITA         | sales@2017 | NULL       |        1 |

|  6129 | VRUSHALI | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | VRUSHALI     | PUN@8877   | NULL       |        1 |

|  6473 | SHARMIN  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | SHARMIN      | a12recmpm  | NULL       |        1 |

|  6781 | BANDISH  | F      | Public Relation     | 7920 | 1981-07-19 | 1750 | NULL |     20 |       1 | BANDISH      | a12recmpm  | NULL       |        1 |

|  7369 | SMITH    | M      | CLERK               | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE      | a12recmpm  | 7032300023 |        0 |

|  7421 | THOMAS   | M      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     10 |       1 | THOMAS       | r50mpm     | 7032300011 |        0 |

|  7566 | JONES    | M      | MANAGER             | 7839 | 1981-04-02 | 2975 | NULL |     20 |       4 | HONEYCOMB    | a12recmpm  | 7132300039 |        1 |

|  7698 | BLAKE    | M      | MANAGER             | 7839 | 1981-05-01 | 2850 | NULL |     30 |       1 | BIG BEN      | sales@2017 | 7132300027 |        1 |

|  7782 | CLARK    | M      | MANAGER             | 7839 | 1981-06-09 | 2450 | NULL |     10 |       3 | CLARK        | r50mpm     | 7032300001 |        1 |

|  7788 | SCOTT    | M      | ANALYST             | 7566 | 1982-12-09 | 3000 | NULL |     20 |       3 | WHITE SAND   | a12recmpm  | NULL       |        1 |

|  7876 | ADAMS    | M      | CLERK               | 7788 | 1983-01-12 | 1100 | NULL |     20 |       1 | CRAZY ANYONE | a12recmpm  | 7132300086 |        1 |

|  7888 | Ruhan    | M      | Network             | 7888 | 1983-08-09 | 2000 | NULL |     60 |       1 | Ruhan        | BRD@1122   | NULL       |        1 |

|  7889 | Neel     | M      | vice PRESIDENT      | 7839 | 1983-08-09 | 1000 | NULL |     60 |       0 | Neel         | BRD@1122   | NULL       |        1 |

|  7900 | JAMES    | M      | CLERK               | 7698 | 1981-12-03 |  950 | NULL |     30 |       2 | CRAZY LEADER | sales@2017 | 7132300042 |        1 |

|  7902 | FORD     | M      | ANALYST             | 7566 | 1981-12-03 | 3000 | NULL |     20 |       4 | CONBRIO      | a12recmpm  | NULL       |        0 |

|  8433 | NATASHA  | F      | CLERK               | 7920 | 1981-07-19 | 1750 | NULL |     30 |       1 | NATASHA      | sales@2017 | NULL       |        1 |

|  9400 | SANGITA  | F      | Compliance officers | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SANGITA      | NULL       | NULL       |        1 |

|  9473 | SUPRIYA  | F      | ANALYST             | 7920 | 1981-07-19 | 1750 | NULL |     50 |       1 | SUPRIYA      | XYZ@1234   | NULL       |        1 |

+-------+----------+--------+---------------------+------+------------+------+------+--------+---------+--------------+------------+------------+----------+

18 rows in set (0.00 sec)

