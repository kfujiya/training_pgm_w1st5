/* ========== 問題3:レンタルされた映画のタイトルとレンタル日 ========== */
select A.title, C.rental_date from film A
    inner join inventory B 
        on A.film_id = B.film_id
    inner join rental C 
        on B.inventory_id = C.inventory_id
order by A.film_id, C.rental_id;

