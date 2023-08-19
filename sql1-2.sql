/* ========== 問題2:顧客の名前とレンタルした映画のタイトル ========== */
select concat(A.first_name, ' ', A.last_name) as customer_name, D.title from customer A
    inner join rental B 
        on A.customer_id = B.customer_id
    inner join inventory C 
        on B.inventory_id = C.inventory_id
    inner join film D 
        on C.film_id = D.film_id
order by A.customer_id, C.film_id;

