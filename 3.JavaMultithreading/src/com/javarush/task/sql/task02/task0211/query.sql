-- Write your code here:
select if(age <=12, 'child',
        if(age>=20, 'adult',
            if(age>12 and age<20, 'teenager', null)
        ))
           as age
from customers
limit 5