-- Write your code here:
select name, count(name) as car_coutn
from cars
group by name
having car_coutn < 3
