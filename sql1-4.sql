/* ========== 問題4:顧客の名前と住所 ========== */
select concat(A.first_name, ' ', A.last_name) as customer_name, concat(B.address, ' ', B.address2, ' ', C.city) as customer_address from customer A
    inner join address B 
        on A.address_id = B.address_id
    inner join city C 
        on B.city_id = C.city_id
order by A.customer_id;

