package com.kittu;

public class MySqlTest {
    create database Address_Book_Service;
    use Address_Book_Service;
    show databases;

    create table address_book(
            first_name varchar(40),
    last_name varchar(30),
    address varchar(50),
    city varchar(30),
    state varchar(40),
    zip int,
    phone_number long,
    email varchar(20));

    select * from address_book;
    insert into address_book values("Santhosh","Naik","Colony","Hyd","TS",509338,9494291232,"msnjul1997@gmail.com");

    SET SQL_SAFE_UPDATES = 0;
    update address_book set city="Sec" where first_name = "Santhosh";
    delete from address_book  where first_name = "Santhosh";

    select * from address_book where city = "Hyd" or state = "TS";

    select count(state&city) from address_book;

    select * from address_book order by first_name;
}
