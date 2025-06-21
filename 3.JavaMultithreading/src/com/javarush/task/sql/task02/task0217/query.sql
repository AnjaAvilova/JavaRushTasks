-- Write your code here:
select *,
    case
        when euro > 5 then 'best'
when euro=5 then 'good'
else 'bad'
end as euro
from cars
where prod_year >2020
 order by price asc
