-- Write your code here:
select DISTINCT country_name
from ip2country
where country_name NOT LIKE  '% %'