-- Write your code here:
select *
from authors
where author_id !=
(select author_id from books
  where author_id = 7 and title = 'War and Peace')
