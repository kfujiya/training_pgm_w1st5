/*Q1*/
select film.title, category.name
from film_category 
join film on film.film_id = film_category.film_id
join category on category.category_id = film_category.film_id ;

/*Q2*/
select customer.first_name,customer.last_name,film.title
from rental
join inventory on inventory.inventory_id = rental.inventory_id
join film on inventory.film_id = film.film_id
join customer on customer.customer_id = rental.customer_id ;

/*Q3*/
select film.title,rental.rental_date
from rental
join inventory on inventory.inventory_id = rental.inventory_id
join film on inventory.film_id = film.film_id;

/*Q4*/
select 
customer.first_name,customer.last_name,
address.address,address.address2,address.district,
city.city
from customer
join address on customer.address_id = address.address_id
join city on city.city_id = address.city_id;

/*Q5*/
select staff.first_name,staff.last_name,
address.address,address.address2,address.district
from staff
join store on store.store_id = staff.store_id
join address on store.address_id = address.address_id;
