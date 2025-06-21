-- Write your code here:
select year(date_time) as y, month(date_time) as m, day(date_time) as d,
       count(type) as count
from event
group by y, m, d
having count>5

