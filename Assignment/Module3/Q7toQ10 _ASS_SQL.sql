/*1. Select unique job from EMP table.*/
SELECT Job, COUNT(Job) c FROM emp
GROUP BY Job HAVING c = 1

/*2. List the details of the emps in asc order of the Dptnos and desc of Jobs?*/
SELECT * FROM emp ORDER BY Deptno ASC,Job DESC;

/*3. Display all the unique job groups in the descending order?*/
SELECT DISTINCT Job FROM emp ORDER BY Job DESC;

/*4. List the emps who joined before 1981*/
SELECT Ename FROM emp WHERE Hiredate<'1981-01-01';

/*5. List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal. */
SELECT Empno,Ename,Sal FROM emp ORDER BY sal ASC;

/*List the Empno, Ename, Sal, Exp of all emps working for Mgr 7369*/
SELECT Empno,Ename,Sal FROM emp WHERE Mgr=7369;

/*6. Display all the details of the emps who’s Comm. Is more than their Sal?*/
SELECT * FROM emp WHERE Sal<Comm;

/*7. List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order.*/
SELECT * FROM emp WHERE Job='ANALYST'OR Job='CLERK' ORDER BY Job DESC;

/*8. List the emps Who Annual sal ranging from 22000 and 45000. */
SELECT Ename FROM emp WHERE Sal*12>= 22000 AND Sal*12<=45000;

/9LIST the Enames those are STARTING WITH ‘S’ AND WITH five characters. */
SELECT Ename FROM emp WHERE LENGTH(Ename)=5 AND Ename LIKE 'S%';

/*List the emps whose Empno not starting with digit78.*/
SELECT Ename FROM emp WHERE Empno NOT LIKE '78%';

/*10. List all the Clerks of Deptno 20.*/
SELECT Ename FROM emp WHERE Job='CLERK' AND Deptno=20; 

/*List the Emps who are senior to their own MGRS.*/


/*List the Emps of Deptno 20 who’s Jobs are same as Deptno10.*/
SELECT Ename  FROM emp WHERE  Job IN(SELECT  Job IN(SELECT * FROM emp WHERE Deptno=10))=Job IN(SELECT DISTINCT Job IN(SELECT * FROM emp WHERE Deptno=20)) ;
SELECT * FROM emp WHERE Deptno=20 OR Deptno=10

/*List the Emps who’s Sal is same as FORD or SMITH in desc order of Sal.*/
SELECT Ename FROM EMP WHERE Sal =(SELECT Sal FROM emp WHERE Ename = 'FORD') OR Sal =(SELECT Sal FROM emp WHERE Ename = 'SMITH');

/*List the emps whose jobs same as SMITH or ALLEN.*/
SELECT Ename FROM EMP WHERE Job =(SELECT Job FROM emp WHERE Ename = 'ALLEN') OR Job =(SELECT Job FROM emp WHERE Ename = 'SMITH');

/*Any jobs of deptno 10 those that are not found in deptno 20.*/
SELECT DISTINCT Job FROM emp WHERE 
Job IN( SELECT DISTINCT Job FROM emp WHERE Deptno=10 OR Deptno=20) !=Job IN (SELECT DISTINCT Job FROM emp WHERE Deptno=20)
OR
Job IN( SELECT DISTINCT Job FROM emp WHERE Deptno=10 OR Deptno=20) !=Job IN (SELECT DISTINCT Job FROM emp WHERE Deptno=10); 

/*Find the highest sal of EMP table.*/
SELECT MAX(sal) FROM emp;

/*Find details of highest paid employee.*/
SELECT * FROM emp WHERE sal=(SELECT MAX(sal) FROM emp);

/*Find the total sal given to the MGR.*/
SELECT SUM(sal) FROM emp WHERE Job='MANAGER';

/*List the emps whose names contains ‘A’.*/
SELECT Ename FROM emp WHERE Ename LIKE '%A%';

/* ++++ Find all the emps who earn the minimum Salary for each job wise in ascending 
order. */
SELECT MIN(Sal) FROM emp WHERE Job= Job IN (SELECT DISTINCT Job FROM emp) ORDER BY ;

/*List the emps whose sal greater than Blake’s sal.*/
SELECT Ename FROM emp WHERE sal>(SELECT Sal FROM emp WHERE Ename='BLAKE');

/*Create view v1 to select ename, job, dname, loc whose deptno are same. */

/*Create a procedure with dno as input parameter to fetch ename and dname. */


/*Add column Pin with bigint data type in table student.*/
ALTER TABLE emp ADD COLUMN Pin BIGINT;
