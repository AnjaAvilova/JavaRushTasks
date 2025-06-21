-- Write your code here:
select ret.hq_location                  as ret_location,
       supplier.annual_revenue_billions as sup_revenue
from top_retailers as ret,
     suppliers as supplier
where top_retailers.hq_location != 'USA'