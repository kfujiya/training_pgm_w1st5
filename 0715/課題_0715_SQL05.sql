--問題5
select concat(staff.first_name,' ', staff.last_name) as 名前,address.address as 住所
from staff inner join store
on staff.store_id = store.store_id
inner join address
on store.address_id = address.address_id;

