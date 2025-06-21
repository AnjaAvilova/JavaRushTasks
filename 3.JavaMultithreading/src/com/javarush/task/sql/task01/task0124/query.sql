-- Write your code here:
select brand, model, car.booked_quantity
from car
where model like 'k%'