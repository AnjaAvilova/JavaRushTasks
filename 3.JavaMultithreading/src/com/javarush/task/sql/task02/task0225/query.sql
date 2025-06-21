-- Write your code here:
select prod_year, count(name) as count
from cars
where name = 'Blue Car'
group by prod_year

