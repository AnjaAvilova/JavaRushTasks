-- Write your code here:
select top_retailers.rank                as conpany_rank,
       top_retailers.name                as company_name,
       suppliers.annual_revenue_billions as supplier_revenue
from top_retailers,
     suppliers
where suppliers.annual_revenue_billions > 25