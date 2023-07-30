select t1.title, t3.rental_date
from film t1
inner join inventory t2 on t1.film_id = t2.film_id
inner join rental t3 on t2.inventory_id = t3.inventory_id
order by t3.rental_date desc;