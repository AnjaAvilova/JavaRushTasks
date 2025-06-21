-- Write your code here:
select *
from event
where month(curdate()) = month(date_time) and
      year(curdate()) = year(date_time)