--*DataTitle 問題3
SELECT
  f.title, 
  re.rental_date 
FROM
  rental re 
  INNER JOIN inventory i 
    ON re.inventory_id = i.inventory_id 
  INNER JOIN film f 
    ON i.film_id = f.film_id;

