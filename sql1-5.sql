/* ========== 問題5:各スタッフの名前と所属店舗の住所 ========== */
select concat(A.first_name, ' ', A.last_name) as staff_name, concat(C.address, ' ', C.address2) as store_address from staff A
    inner join store B 
        on A.store_id = B.store_id
    inner join address C 
        on B.address_id = C.address_id
order by A.staff_id;

