-- Write your code here:
select count(*) as count, prod_year
from cars
group by prod_year
