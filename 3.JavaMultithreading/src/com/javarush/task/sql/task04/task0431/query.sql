-- Write your code here:
select dayname(date), count(type) as count
    from event
where type = 'REGISTRATION'
group by dayname(date)
order by count desc
limit 1