-- Write your code here:
select count(*) as count, department
from employee
group by department