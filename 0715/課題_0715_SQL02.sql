--���2
select concat(customer.first_name,' ', customer.last_name) as ���O, film.title as �^�C�g��
from rental inner join customer
on rental.customer_id = customer.customer_id
inner join inventory
on rental.inventory_id = inventory.inventory_id
inner join film
on inventory.film_id = film.film_id;

