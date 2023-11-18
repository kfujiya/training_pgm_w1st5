--問題1
select film.film_id, film.title as タイトル, category.name as カテゴリー
from film inner join film_category
on film.film_id = film_category.film_id
inner join category
on category.category_id = film_category.category_id;

