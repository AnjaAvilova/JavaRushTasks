-- Write your code here:
select name as car_name, count(name) as car_count
from cars
group by name