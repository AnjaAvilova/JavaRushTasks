-- Write your code here:
select year(date_of_birth) as y, month(date_of_birth) as m,
    count(id) as count
from employee
group by y, m

