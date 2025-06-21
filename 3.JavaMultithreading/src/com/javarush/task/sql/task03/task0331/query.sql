-- Write your code here:
select authors.last_name as author,
       books.title as books_title,
       books.copies_sold_millions as books_sold
from authors
right join books on authors.author_id = books.author_id
where books.copies_sold_millions > 50