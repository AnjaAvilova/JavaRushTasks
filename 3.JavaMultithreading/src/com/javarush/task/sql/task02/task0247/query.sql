-- Write your code here:
select department, position, count(position) as total
from employee
group by department, position
having total = 1