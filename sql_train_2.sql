select concat(t1.first_name, ' ', t1.last_name) as Name, t4.title
from customer t1
inner join rental t2 on t1.customer_id = t2.customer_id
inner join inventory t3 on t3.inventory_id = t2.inventory_id
inner join film t4 on t3.film_id = t4.film_id
order by t1.last_name;