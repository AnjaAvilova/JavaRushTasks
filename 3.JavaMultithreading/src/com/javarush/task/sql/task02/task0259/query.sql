-- Write your code here:
select position, group_concat(name, SEPARATOR ', ') AS employee_names
from employee
where position like '%developer%'
group by position