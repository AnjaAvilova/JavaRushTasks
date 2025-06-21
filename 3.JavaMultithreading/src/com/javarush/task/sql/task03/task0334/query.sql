-- Write your code here:
select authors.last_name as author, authors.country as autor_country,
       books.genre as book_genre
from authors
left join books on books.author_id = authors.author_id
where books.genre = 'fantasy'
group by  authors.last_name, authors.country, books.genre
order by  authors.country asc
limit 5