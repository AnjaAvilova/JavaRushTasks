-- Write your code here:
select department, count(position) as count
from employee
where position = 'backend developer'
group by department
