--���4
select concat(customer.first_name,' ', customer.last_name) as ���O,
 concat(address.address, ', ', address.district, ', ', address.postal_code, ', ', city.city) as �Z��
from  address inner join customer
on address.address_id = customer.address_id
inner join city
on address.city_id = city.city_id
order by ���O;

