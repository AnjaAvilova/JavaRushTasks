-- Write your code here:
select customers.email, orders.*
from orders
right join customers on customers.customer_id = orders.customer_id