-- Write your code here:
select name_b64 as base64, from_base64(name_b64)
from employee