-- Write your code here:
select year(date) as y, month(date) as m, day(date) as d, sum(total) as sum
    from data
group by y, m, d