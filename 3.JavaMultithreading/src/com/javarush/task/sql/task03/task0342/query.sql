-- Write your code here:
select *
from film_derectors
where full_name like (select concat(first_name, ' ', last_name)
      from film_directors
    limit 1)