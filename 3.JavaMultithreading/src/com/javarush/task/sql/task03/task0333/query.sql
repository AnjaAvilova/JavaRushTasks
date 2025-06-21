-- Write your code here:
select authors.sex as author_sex, authors.country as author_country,
       books.copies_sold_millions as books_sold
from authors
join books on authors.author_id = books.author_id
where books.copies_sold_millions >10
group by  authors.sex, authors.country, books.copies_sold_millions
order by books.copies_sold_millions desc