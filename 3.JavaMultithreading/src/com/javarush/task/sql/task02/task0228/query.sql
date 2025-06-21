-- Write your code here:
select department, count(id) as number_of_employee
from employee
group by department