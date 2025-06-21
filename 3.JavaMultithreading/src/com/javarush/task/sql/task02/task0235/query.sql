-- Write your code here:
select year(date_of_birth) as year_of_birth, count(id) as count
from employee
where position like '%developer%'
group by year_of_birth