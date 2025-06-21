-- Write your code here:
select date_of_birth, count(id) as count
from employee
group by date_of_birth
