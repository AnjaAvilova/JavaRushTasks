-- Write your code here:
select name, sum(price), avg(price)
from cars
where price > 100000
group by name