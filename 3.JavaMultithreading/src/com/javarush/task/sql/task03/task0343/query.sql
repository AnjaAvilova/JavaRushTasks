-- Write your code here:
select film_directors.full_name
from film_directors
left join (select title, director_id from films
                        where genre = 'comedy') as f
on film_directors.id = f.director_id