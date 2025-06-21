-- Write your code here:
select autors.country as author_country,
    count(books.book_id) as book_count
from authors
join books
 on authors.author_id = books.author_id
where books.genre = 'novel'
group by autors.country
having book_count>2