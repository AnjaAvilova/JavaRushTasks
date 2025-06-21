-- Write your code here:
select authors.last_name as author,
       books.genre as book_genre,
       books.date_released
from authors
right join books on authors.author_id = books.author_id
where books.date_released < 1900
group by authors.last_name, books.genre, books.date_released