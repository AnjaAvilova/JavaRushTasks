-- Write your code here:
select position,
       case
           when position = 'backend developer' then 'yes'
when position = 'frontend developer' then 'yes'
else 'no'
end as 'position'
from employee
where department = 'cool devs'