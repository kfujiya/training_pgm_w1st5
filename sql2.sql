--*DataTitle 問題2
SELECT
  cu.first_name, 
  cu.last_name, 
  concat(cu.first_name, ' ', cu.last_name) AS name, 
  f.title 
FROM
  customer cu 
  INNER JOIN rental re 
    ON cu.customer_id = re.customer_id 
  INNER JOIN inventory i 
    ON re.inventory_id = i.inventory_id 
  INNER JOIN film f 
    ON i.film_id = f.film_id;

