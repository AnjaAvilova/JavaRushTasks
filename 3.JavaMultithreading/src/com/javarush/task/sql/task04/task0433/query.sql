-- Write your code here:
select year(date), month(date), day(date), count(*) as count
from event
where user_id = 3 and type = 'SOLVE_TASK' and status = 'OK'
group by year(date), month(date), day(date)