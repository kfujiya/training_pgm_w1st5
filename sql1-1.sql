/* ========== 問題1:各映画のタイトルとカテゴリ名 ========== */
select A.title, C.name from film A
    inner join film_category B 
        on A.film_id = B.film_id
    inner join category C 
        on B.category_id = C.category_id
order by A.film_id, C.category_id;

