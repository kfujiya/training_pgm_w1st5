--–â‘è4
select concat(customer.first_name,' ', customer.last_name) as –¼‘O,
 concat(address.address, ', ', address.district, ', ', address.postal_code, ', ', city.city) as ZŠ
from  address inner join customer
on address.address_id = customer.address_id
inner join city
on address.city_id = city.city_id
order by –¼‘O;

