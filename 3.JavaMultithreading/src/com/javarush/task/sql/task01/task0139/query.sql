-- Write your code here:
select country_code, ip_from, ip_to
from ip2country
ORDER BY ip_from asc
limit 17