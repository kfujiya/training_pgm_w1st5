select concat(t1.first_name, ' ', t1.last_name) as Name, t3.address as Address
from staff t1
inner join store t2 on t1.store_id = t2.store_id
inner join address t3 on t2.address_id = t3.address_id
order by t1.staff_id;