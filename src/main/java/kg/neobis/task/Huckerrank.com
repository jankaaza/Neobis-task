Select All

select * from city;
-------------------------------------------------------------------------------------------------------------------
Select By ID

SELECT * FROM CITY WHERE ID = 1661;
--------------------------------------------------------------------------------------------------------------------
Japanese Cities’ Attributes

select * from city where countrycode='JPN';
-------------------------------------------------------------------------------------------------------------------
Japanese Cities’ Names

SELECT NAME FROM CITY WHERE COUNTRYCODE='JPN';
------------------------------------------------------------------------------------------------------------------
Weather Observation Station 1

select city,state from station;
-------------------------------------------------------------------------------------------------------------------
Weather Observation Station 3

select distinct city from station where mod(id, 2)=0;
-------------------------------------------------------------------------------------------------------------------
 Weather Observation Station 5

SELECT city,LENGTH(city) FROM station WHERE city = (SELECT MIN(city) FROM station WHERE LENGTH(city) = (SELECT MIN(LENGTH(city)) FROM station)) OR city = (SELECT MIN(city) FROM station
WHERE LENGTH(city) = (SELECT MAX(LENGTH(city))FROM station));
------------------------------------------------------------------------------------------------------------------
Weather Observation Station 7


select distinct city from station where city like '%a' or city like '%e' or city like '%i' or city like '%o' or city like '%u';
--------------------------------------------------------------------------------------------------------------------
Higher Than 75 Marks

select Name from students where Marks>75 order by substr(Name, -3, 3),id;
------------------------------------------------------------------------------------------------------------------
Employee Names

select Name from employee order by Name;