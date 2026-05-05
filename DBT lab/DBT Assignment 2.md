&#x20;**<Q.1 .Display the Employee Name, Job, and Start Date of Employees hired from February 1981 to May 1981.>**

mysql> select ename,job,hiredate from emp where hiredate between '1981-05-01' AND '1981-05-31';

+-------+---------+------------+

| ename | job     | hiredate   |

+-------+---------+------------+

| BLAKE | MANAGER | 1981-05-01 |

+-------+---------+------------+



Dis

mysql> SELECT ename, job, hiredate

&#x20;   -> FROM emp

&#x20;   -> WHERE DATE\_FORMAT(hiredate, '%Y-%m') = '1981-05';

+-------+---------+------------+

| ename | job     | hiredate   |

+-------+---------+------------+

| BLAKE | MANAGER | 1981-05-01 |

+-------+---------+------------+





**< Q.2 .Display the Name and Hiredate of every Employee who was hired in 1982.>**

mysql> select ename,hiredate

&#x20;   -> from emp

&#x20;   -> where year(hiredate)=1982;

+---------+------------+

| ename   | hiredate   |

+---------+------------+

| SCOTT   | 1982-12-09 |

| HOFFMAN | 1982-03-24 |

| MILLER  | 1982-01-23 |

| ALEX    | 1982-01-24 |

+---------+------------+

**< Q.3.Write a query to display the current date. Label the column as Current Date.>**



mysql> SELECT CURDATE() 'CURRENT\_DATE';

+--------------+

| CURRENT\_DATE |

+--------------+

| 2026-04-17   |

+--------------+



**< Q.4 .Display the Employee’s Name, Hiredate, Salary and Review Date, which is first Monday after six months of service.>**





**< Q.5. Modify the query to display the dates as “Sunday, the Seventh of September, 1981”.>**

mysql> SELECT DATE\_FORMAT(HIREDATE, '%W, the %D of %M, %Y')

&#x20;   -> FROM emp;

+-----------------------------------------------+

| DATE\_FORMAT(HIREDATE, '%W, the %D of %M, %Y') |

+-----------------------------------------------+

| Sunday, the 19th of July, 1981                |

| Sunday, the 19th of July, 1981                |

| Sunday, the 19th of July, 1981                |

| Sunday, the 19th of July, 1981                |

| Wednesday, the 17th of December, 1980         |

| Thursday, the 31st of December, 1981          |

| Sunday, the 19th of July, 1981                |

| Friday, the 20th of February, 1981            |

| Sunday, the 22nd of February, 1981            |







&#x20;**<Q.6.Create a query to display the name and salary for all Employees. Format the salary to be 15 characters long by adding ‘$’.>**



mysql> SELECT ENAME,lPAD(SAL,15,'$') FROM EMP;

+----------+------------------+

| ENAME    | lPAD(SAL,15,'$') |

+----------+------------------+

| GITA     | $$$$$$$$$$$1750  |

| VRUSHALI | $$$$$$$$$$$1750  |

| SHARMIN  | $$$$$$$$$$$1750  |

| BANDISH  | $$$$$$$$$$$1750  |

| SMITH    | $$$$$$$$$$$$800  |

| AARAV    | $$$$$$$$$$$3350  |

| THOMAS   | $$$$$$$$$$$1750  |

| ALLEN    | $$$$$$$$$$$1600  |

| WARD     | $$$$$$$$$$$1250  |

| JONES    | $$$$$$$$$$$2975  |



**<Q.7 .Display the Name, Hiredate and day of the week on which the employees started. Order the results by the Day of the week starting with Monday.>**



mysql> SELECT ENAME,HIREDATE,DATE\_FORMAT(HIREDATE,'%V') FROM EMP;

+----------+------------+----------------------------+

| ENAME    | HIREDATE   | DATE\_FORMAT(HIREDATE,'%V') |

+----------+------------+----------------------------+

| GITA     | 1981-07-19 | 29                         |

| VRUSHALI | 1981-07-19 | 29                         |

| SHARMIN  | 1981-07-19 | 29                         |

| BANDISH  | 1981-07-19 | 29                         |

| SMITH    | 1980-12-17 | 50                         |

| AARAV    | 1981-12-31 | 52                         |

| THOMAS   | 1981-07-19 | 29                         |

| ALLEN    | 1981-02-20 | 07                         |





&#x20;**<Q.8.Display details of orders received in the year 1981.>**  



mysql> SELECT \* FROM orderdetails WHERE

&#x20;   -> YEAR(ORDERdATE)=1986;

Empty set (0.01 sec)







&#x20;**<Q.9 Write a query to find out the DAY (for example, SUNDAY) of the current date.>**



mysql> SELECT DATE\_FORMAT(NOW(),'%a');

+-------------------------+

| DATE\_FORMAT(NOW(),'%a') |

+-------------------------+

| Fri                     |

+-------------------------+

1 row in set (0.01 sec)







**<Q.10.Display the name and the date of joining of the employees who belong to department number 10. The date of joining should be formatted. For eg. if it is ‘10-JUN-97’ it should be displayed as Fifteenth JUNE, 1997. The name of the employee should be in upper case.>**



mysql> select ename,date\_format(hiredate,'%D%M,%Y') from emp where deptno=10;

+--------+---------------------------------+

| ename  | date\_format(hiredate,'%D%M,%Y') |

+--------+---------------------------------+

| AARAV  | 31stDecember,1981               |

| THOMAS | 19thJuly,1981                   |

| CLARK  | 9thJune,1981                    |

| KING   | 17thNovember,1981               |

| MILLER | 23rdJanuary,1982                |

+--------+---------------------------------+







**< Q.11.Consider the Ord table. Find the difference between the Order Date and Ship Date in months as well as days. Label the columns appropriately.>**





**<Q.12.List employee details who have joined in December.>**



mysql> select ename,hiredate from emp where month(hiredate)=12;



+-------+------------+

| ename | hiredate   |

+-------+------------+

| SMITH | 1980-12-17 |

| AARAV | 1981-12-31 |

| SCOTT | 1982-12-09 |

| JAMES | 1981-12-03 |

| FORD  | 1981-12-03 |

+-------+------------+







&#x20;**<Q.13. Display day on which KING joined.>**



mysql> select day(hiredate) 'KINGJOINED' from emp where ename='KING';

+------------+

| KINGJOINED |

+------------+

|         17 |

+------------+









&#x20;**<Q.14 .Display month on which MARTIN joined.>**

mysql> select month(hiredate) 'MARTINJOINED' from emp where ename='MARTIN';

+--------------+

| MARTINJOINED |

+--------------+

|            9 |

+--------------+







**< Q.15 .Find number of days elapsed between today’s date and hiredate of ‘ADAMS’.>**



mysql> select datediff(curdate(),hiredate)

&#x20;   -> from emp

&#x20;   -> where ename='ADAMS';

+------------------------------+

| datediff(curdate(),hiredate) |

+------------------------------+

|                        15801 |

+------------------------------+







&#x20;**<Q.16.Print the date, 15 days alter today’s date.>**





mysql> select curdate(),curdate()+interval 15 day as '15 days alert';

+------------+---------------+

| curdate()  | 15 days alert |

+------------+---------------+

| 2026-04-17 | 2026-05-02    |

+------------+---------------+

1 row in set (0.00 sec)









**< Q .17. List all employee hired in the month of December.>**



mysql> select ename,hiredate from emp where month(hiredate)=12;

+-------+------------+

| ename | hiredate   |

+-------+------------+

| SMITH | 1980-12-17 |

| AARAV | 1981-12-31 |

| SCOTT | 1982-12-09 |

| JAMES | 1981-12-03 |

| FORD  | 1981-12-03 |

+-------+------------+







**< Q.18.List all employee hired after 1980.>**



mysql> select \* from emp

&#x20;   -> where year(hiredate)=1980;

+-------+--------+--------+----------+------+------------+------+------+--------+---------+-----------+------------+------------+----------+

| EMPNO | ENAME  | GENDER | JOB      | MGR  | HIREDATE   | SAL  | COMM | DEPTNO | BONUSID | USER NAME | PWD        | PHONE      | isActive |

+-------+--------+--------+----------+------+------------+------+------+--------+---------+-----------+------------+------------+----------+

|  7369 | SMITH  | M      | CLERK    | 7902 | 1980-12-17 |  800 | NULL |     20 |       2 | TRITONE   | a12recmpm  | 7032300023 |        0 |

|  7920 | GRASS  | M      | SALESMAN | 7919 | 1980-02-14 | 2575 | 2700 |     30 |       5 | GRASS     | sales@2017 | NULL       |        1 |

|  7945 | AARUSH | M      | SALESMAN | 7902 | 1980-02-14 | 1350 | 2700 |     30 |    NULL | AARUSH    | ABCDEF     | NULL       |        0 |

+-------+--------+--------+----------+------+------------+------+------+--------+---------+-----------+------------+------------+----------+





**< Q.19.Display names and jobs of employee in the format SMITH-CLERK.>**



mysql> select concat(ename,'-',job)as r1 from emp;

+------------------------------+

| r1                           |

+------------------------------+

| GITA-Compliance officers     |

| VRUSHALI-Compliance officers |

| SHARMIN-Public Relation      |

| BANDISH-Public Relation      |

| SMITH-CLERK                  |

| AARAV-CLERK                  |

| THOMAS-CLERK                 |

| ALLEN-SALESMAN               |

| WARD-SALESMAN                |

| JONES-MANAGER                |

| MARTIN-SALESMAN              |



**< Q.20.Show the length of names in EMP table. Eliminate duplicate length. Do not show the names.>**



mysql> select distinct length(ename) from emp;

+---------------+

| length(ename) |

+---------------+

|             4 |

|             8 |

|             7 |

|             5 |

|             6 |





&#x20;**<Q.21.List the names and hiredate of EMP in dept 20, display hiredate formatted as 12/03/1984.>**



mysql> select ename,date\_format(hiredate,'%d/%m/%Y') from emp where deptno=20;

+---------+----------------------------------+

| ename   | date\_format(hiredate,'%d/%m/%Y') |

+---------+----------------------------------+

| SHARMIN | 19/07/1981                       |

| BANDISH | 19/07/1981                       |

| SMITH   | 17/12/1980                       |

| JONES   | 02/04/1981                       |

| SCOTT   | 09/12/1982                       |

| FRED    | 09/08/1983                       |

| ADAMS   | 12/01/1983                       |

| FORD    | 03/12/1981                       |

+---------+----------------------









**<Q.22.Find the day of week on which SMITH joined.>**

mysql> select dayofweek(hiredate) as res from emp where ename='SMITH';

+------+

| res  |

+------+

|    4 |

+------+



**< Q.23.Retrieve the ANALYST record with hiredate formatted as ‘The 3rd of Oct. 1984’.>**



mysql> select ename,date\_format(hiredate,'The %D of %b %Y') from emp where job='ANALYST';

+---------+-----------------------------------------+

| ename   | date\_format(hiredate,'The %D of %b %Y') |

+---------+-----------------------------------------+

| SCOTT   | The 9th of Dec 1982                     |

| FORD    | The 3rd of Dec 1981                     |

| SUPRIYA | The 19th of Jul 1981        







&#x20;**<Q.24.Calculate the total compensation expensive for each dept in 1 year. Assume that employees, who don't earn commission, receive non-monetary benefits than are worth Rs.1000 a month.>**



mysql> SELECT DEPTNO,

&#x20;   -> SUM((SAL + IFNULL(COMM,0) + 1000) \* 12) AS Total\_Compen

&#x20;   -> FROM emp

&#x20;   -> GROUP BY DEPTNO;

+--------+--------------+

| DEPTNO | Total\_Compen |

+--------+--------------+

|     10 |       241800 |

|     20 |       328500 |

|     30 |       507900 |

|     50 |        99000 |

|     60 |        60000 |

+--------+--------------+



&#x20;**<Q.25.Display the Names of the Managers as follows-**

&#x20;**a.If the employee code is 7788 the Manager is CLARK**

&#x20;**b.If the employee code is 7698 the Manager is BLAKE**

&#x20;**c. If the employee code is 7566 the Manager is JONES**

&#x20;**d. For all other Employees the Manager is KING >**



mysql> SELECT ENAME,

&#x20;   -> CASE

&#x20;   -> WHEN EMPNO = 7788 THEN 'CLARK'

&#x20;   -> WHEN EMPNO = 7698 THEN 'BLAKE'

&#x20;   -> WHEN EMPNO = 7566 THEN 'JONES'

&#x20;   -> ELSE 'KING'

&#x20;   -> END AS Manager

&#x20;   -> FROM emp;

+----------+---------+

| ENAME    | Manager |

+----------+---------+

| GITA     | KING    |

| VRUSHALI | KING    |

| SHARMIN  | KING    |

| BANDISH  | KING    |

| SMITH    | KING    |

| AARAV    | KING    |





