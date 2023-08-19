--*DataTitle 問題5
SELECT
  sta.first_name, 
  sta.last_name, 
  ad.address, 
  ad.address2 
FROM
  staff sta 
  INNER JOIN store sto 
    ON sta.store_id = sto.store_id 
  INNER JOIN address ad 
    ON sto.address_id = ad.address_id

