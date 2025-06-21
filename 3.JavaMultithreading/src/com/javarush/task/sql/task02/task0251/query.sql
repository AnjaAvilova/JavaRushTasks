-- Write your code here:
select department, position, count(position) as total
from employee
group by department, position
having total = 1 or total = 'manager'
limit 100
offset 1