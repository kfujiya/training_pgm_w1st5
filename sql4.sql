--*DataTitle 問題4
SELECT
  cu.first_name, 
  cu.last_name, 
  ad.address_id, 
  ad.address2, 
  ci.city 
FROM
  city ci 
  INNER JOIN address ad 
    ON ci.city_id = ad.city_id 
  INNER JOIN customer cu 
    ON cu.address_id = ad.address_id;

