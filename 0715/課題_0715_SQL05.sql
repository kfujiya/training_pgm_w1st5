--–â‘è5
select concat(staff.first_name,' ', staff.last_name) as –¼‘O,address.address as ZŠ
from staff inner join store
on staff.store_id = store.store_id
inner join address
on store.address_id = address.address_id;

