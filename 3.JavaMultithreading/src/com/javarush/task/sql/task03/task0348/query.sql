-- Write your code here:
with grossed_total as (select sum(films.grossed) as total from films)
select avg(total) as average_grossed
from grossed_total