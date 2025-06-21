-- Write your code here:
select name, min(price), max(price)
from cars
where price < 200000
group by name