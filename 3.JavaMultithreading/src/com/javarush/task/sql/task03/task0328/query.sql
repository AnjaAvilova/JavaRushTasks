-- Write your code here:
select customers.phone as cust_phone,
       orders.order_date, orders.total_cost,
       orders.store_id
from customers
right join orders on orders.customer_id=customers.customer_id
where customers.city = 'New York' and
      orders.order_status = 'PROCESSING'