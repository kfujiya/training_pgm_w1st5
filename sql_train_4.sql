select concat(t1.first_name, ' ', t1.last_name) as Name, concat(t2.address, ', ', t3.city, ', ',t2.district) as Address
from customer t1
inner join address t2 on t1.address_id = t2.address_id
inner join city t3 on t2.city_id = t3.city_id
order by t1.customer_id;