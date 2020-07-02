2602 - Basic Select

select name from customers where state='RS';
--------------------------------------------------------------------------------------------------------------------
2603 - Customer Address

select name,street from customers where city='Porto Alegre';
--------------------------------------------------------------------------------------------------------------------
2604 - Under 10 or Greater Than 100

select id,name from products where price<10 or price>100;
-------------------------------------------------------------------------------------------------------------------
2605 - Executive Representatives

select name, (select name from providers
where products.id_providers = providers.id) as name
from products
where id_categories = 6;
-------------------------------------------------------------------------------------------------------------------
2606 - Categories

select id, name from products where id_categories
in (select id from categories where name like 'super%');
-------------------------------------------------------------------------------------------------------------------
2607 - Providers' City in Alphabetical Order

SELECT DISTINCT city FROM providers order by city;
------------------------------------------------------------------------------------------------------------------
2608 - Higher and Lower Price

select max(price) as price,min(price) as price from products;
-------------------------------------------------------------------------------------------------------------------
2610 - Average Value of Products

select round(avg(price),2) from products;
------------------------------------------------------------------------------------------------------------------

