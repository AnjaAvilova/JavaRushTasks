-- Write your code here:
select is_full_time,
case
when is_full_time = 1 then 'true'
when is_full_time=0 then 'false'
end as is_full_time
from students