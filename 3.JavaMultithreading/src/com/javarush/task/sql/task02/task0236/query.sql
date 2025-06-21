-- Write your code here:
select department, count(position) count
from employee
group by department