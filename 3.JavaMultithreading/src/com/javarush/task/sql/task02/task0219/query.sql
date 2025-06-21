-- Write your code here:
select  *,
case
when euro = 'null' then 'good'
else 'bad'
end as euro
from cars