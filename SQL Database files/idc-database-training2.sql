create table batch.order_details (id int, customer_id int, order_date timestamp);
insert into batch.order_details (customer_id) values(1),(1),(1),(2),(2),(2);
select * from batch.order_details;

create table batch.customer_details(id int primary key auto_increment, full_name varchar(255), contact varchar(12),country varchar(255));
insert into batch.customer_details (full_name, contact) values ("Peter Parker", "987645321"),("Stephen Strange", "987655321");
select * from batch.customer_details;

create table batch.shippers(id int primary key auto_increment, customer_id int, shipper_date timestamp);
insert into batch.shippers(customer_id) values (1),(2);

select * from batch.order_details where customer_id > 1 limit 3;
select customer_id, id from batch.order_details limit 2;

select * from batch.order_details cross join batch.customer_details;
select * from batch.order_details;
select * from batch.customer_details;

SELECT batch.order_details.id, batch.customer_details.customer_id, batch.customer_details.full_name, batch.order_details.order_date
FROM batch.order_details
INNER JOIN batch.customer_details ON batch.order_details.customer_id=batch.customer_details.id;

-- cross join
select * from batch.order_details cross join batch.customer_details on order_details.customer_id=customer_details.id;

-- inner join
select order_details.id, customer_details.full_name, order_details.order_date 
from order_details 
inner join customer_details on order_details.customer_id=customer_details.id;

select customer_details.customer_id, shippers.customer_id 
from shippers 
inner join customer_details on shippers.customer_id=customer_details.id;

select * from customer_details;
select * from shippers;
select * from order_details;

select order_details.id, customer_details.full_name, order_details.order_date, shippers.id, shippers.shipper_date
from ((customer_details 
inner join order_details on customer_details.id=order_details.customer_id)
inner join shippers on customer_details.id=shippers.customer_id);

select order_details.id, customer_details.full_name, order_details.order_date, shippers.id, shippers.shipper_date
from ((order_details 
right join order_details on order_details.customer_id=customer_details.id));
right join customer_details on customer_details.id=shippers.customer_id);


-- select customers_details.customer
-- inner join shippers on customer_details.customer_id=shippers.customer_id);


-- inner join
-- select order_details.id, customer_details.full_name, shippers.shipper_date from ((order_details inner join order_details.customer_id=customer_details.id)
-- inner join shippers.customer_id = order_details.customer_id);


