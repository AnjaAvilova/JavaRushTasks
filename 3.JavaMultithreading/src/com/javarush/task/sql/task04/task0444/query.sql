-- Write your code here:
select concat(city, '-', char_length(city))
    from cityes
order by char_length(city) asc
limit 3