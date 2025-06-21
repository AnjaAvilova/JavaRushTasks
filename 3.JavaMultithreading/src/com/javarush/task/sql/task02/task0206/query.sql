-- Write your code here:
select id, if(salary<=500, 1000, 0)
from employee
