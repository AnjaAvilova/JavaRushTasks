-- Write your code here:
select number_of_season,
case
when number_of_season = 1 then 'winter'
when number_of_season = 2 then 'spring'
when number_of_season = 3 then 'summer'
when number_of_season = 4 then 'autumn'
    else 'unknown'
end as 'number_of_season'
from months

