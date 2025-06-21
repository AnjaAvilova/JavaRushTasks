-- Write your code here:
select year(date_of_birth) as year_date,
    month(date_of_birth) as month_date,
    count(id) as count
from employee
group by year_date,month_date