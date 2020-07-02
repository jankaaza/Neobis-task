create table customer
(
    id      bigserial primary key,
    name    varchar,
    address     varchar,
    phone_number  varchar
);
create table ingredients
(
    id      bigserial primary key,
    ingredient1    varchar,
    ingredient2    varchar,
    ingredient3  varchar,
    ingredient4  varchar
);
create table cake
(
    id      bigserial primary key,
    name    varchar,
    origin     varchar,
    quantity  int,
    price  int,
    weight  int
);