-- Write your code here:
select ip_from, ip_to, country_name
from ip2country
order by ip_to desc
limit 1000
offset 74