-- Write your code here:
select name, count(name) as count
from cars
group by name
having count>1