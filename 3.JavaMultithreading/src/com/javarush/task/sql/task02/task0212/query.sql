-- Write your code here:
select
    IF(position = 'manager' AND salary > 10000, 'good',
        IF(position <> 'manager' AND salary > 5000, 'good',
            IF(position = 'manager' AND salary <= 10000, 'bad',
                IF(position <> 'manager' AND salary <= 5000, 'bad', NULL)
            )
        )
    ) AS assessment
FROM
    employee
WHERE
    city = 'London';

