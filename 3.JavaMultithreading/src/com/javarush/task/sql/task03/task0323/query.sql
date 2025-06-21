-- Write your code here:
select customers.last_name,
       orders.order_id
from customers
         left join orders on orders.customer_id = customers.customer_id
