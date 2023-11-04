--問題4
select concat(customer.first_name,' ', customer.last_name) as 名前,
 concat(address.address, ', ', address.district, ', ', address.postal_code, ', ', city.city) as 住所
from  address inner join customer
on address.address_id = customer.address_id
inner join city
on address.city_id = city.city_id
order by 名前;

