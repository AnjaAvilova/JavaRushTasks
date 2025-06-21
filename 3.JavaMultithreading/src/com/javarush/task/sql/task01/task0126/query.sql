select brand, model, quantity, booked_quantity
from car
where brand in ('renault', 'opel', 'seat', 'skoda') or (quantity - booked_quantity)<10