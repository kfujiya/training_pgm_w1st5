select t1.title, t3.name
from film t1
inner join film_category t2 on t1.film_id = t2.film_id
inner join category t3 on t2.category_id = t3.category_id
order by t1.title;