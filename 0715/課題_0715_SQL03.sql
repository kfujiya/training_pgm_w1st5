--���3
select film.film_id, film.title as �^�C�g��, rental.return_date as �����^����
from inventory inner join film
on inventory.film_id = film.film_id
inner join rental
on inventory.inventory_id = rental.inventory_id
order by film.film_id;

