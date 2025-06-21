-- Write your code here:
select * from film_directors
right join (title, director_id from films
where year_released >1990) as film
on film_directors.id = film.director_id
where country = 'usa'
limit 5