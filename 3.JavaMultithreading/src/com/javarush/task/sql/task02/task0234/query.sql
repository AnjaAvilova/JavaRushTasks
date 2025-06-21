-- Write your code here:
select YEar(date_of_birth) as year_of_birth, count(id) as count
from employee
group by year_of_birth