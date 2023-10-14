--*DataTitle 問題1
SELECT
  f.title, 
  ca.name 
FROM
  film f 
  INNER JOIN film_category fa 
    ON f.film_id = fa.film_id 
  INNER JOIN category ca 
    ON fa.category_id = ca.category_id;

