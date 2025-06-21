select name, sum(price) as price
from cars
group by name
