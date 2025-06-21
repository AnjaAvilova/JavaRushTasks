-- Write your code here:
select year(prod_date) as prod_year,
       month(prod_date) as prod_month,
       count(name) as count
from cars
where name = 'Black Car' or price >99000
group by prod_year, prod_month

