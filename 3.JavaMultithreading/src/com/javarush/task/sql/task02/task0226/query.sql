-- Write your code here:
select prod_year, name, count(name) as count
from cars
where prod_year = 2021
group by prod_year, name