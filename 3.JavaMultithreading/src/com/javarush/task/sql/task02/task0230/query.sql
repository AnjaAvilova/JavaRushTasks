-- Write your code here:
select department as department_name, count(position) as count
from employee
where position = 'frontend developer'
group by department
