-- Write your code here:
select monthname(date), count(*) as count
from event
where status ='ERROR' or status = 'FAILED'
group by monthname(date)
order by count desc
limit 1