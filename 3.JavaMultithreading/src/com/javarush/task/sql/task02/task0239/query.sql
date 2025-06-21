-- Write your code here:
select year(date_of_birth) as year,
    month(date_of_birth) as month
from employee
where month = 1 or month = 2 or month = 11 or month = 12
