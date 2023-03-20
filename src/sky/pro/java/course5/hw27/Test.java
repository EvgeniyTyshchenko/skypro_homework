package course5.hw27;

public class Test {

/*
    Server [localhost]:
    Database [postgres]:
    Port [5432]:
    Username [postgres]:
    Пароль пользователя postgres:
    psql (15.1)
    ПРЕДУПРЕЖДЕНИЕ: Кодовая страница консоли (866) отличается от основной
    страницы Windows (1251).
            8-битовые (русские) символы могут отображаться некорректно.
    Подробнее об этом смотрите документацию psql, раздел
                "Notes for Windows users".
    Введите "help", чтобы получить справку.

    postgres=# psql \! chcp 1251
    Текущая кодовая страница: 1251
    postgres-# \l
    Список баз данных
    Имя        | Владелец | Кодировка |     LC_COLLATE      |      LC_CTYPE       | локаль ICU | Провайдер локали |     Права доступа
-------------------+----------+-----------+---------------------+---------------------+------------+------------------+-----------------------
    hibernate_demo_db | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 |            | libc             |
    postgres          | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 |            | libc             |
    template0         | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 |            | libc             | =c/postgres          +
                      |          |           |                     |                     |            |                  | postgres=CTc/postgres
    template1         | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 |            | libc             | =c/postgres          +
                      |          |           |                     |                     |            |                  | postgres=CTc/postgres
    testDB            | postgres | UTF8      | Russian_Russia.1251 | Russian_Russia.1251 |            | libc             |
    (5 строк)


    postgres=# CREATE DATABASE skypro;
    CREATE DATABASE
    postgres=# \c skypro
    Вы подключены к базе данных "skypro" как пользователь "postgres".
    skypro=# CREATE TABLE employee(
    skypro(# id BIGSERIAL NOT NULL PRIMARY KEY,
    skypro(# first_name VARCHAR(50) NOT NULL,
    skypro(# last_name VARCHAR(50) NOT NULL,
    skypro(# gender VARCHAR(6) NOT NULL,
    skypro(# age INT NOT NULL
    skypro(# );
    CREATE TABLE
    skypro=# SELECT * FROM employee;
    id | first_name | last_name | gender | age
----+------------+-----------+--------+-----
        (0 строк)


    skypro=# INSERT INTO employee (
    skypro(# first_name, last_name, gender, age)
    skypro-# VALUES ('Владимир', 'Иванов', 'М', 35),
    skypro-# ('Мария', 'Петрова', 'Ж', 29),
    skypro-# ('Максим', 'Солгалов', 'М', 33);
    INSERT 0 3
    skypro=# SELECT * FROM employee;
    id | first_name | last_name | gender | age
----+------------+-----------+--------+-----
     1 | Владимир   | Иванов    | М      |  35
     2 | Мария      | Петрова   | Ж      |  29
     3 | Максим     | Солгалов  | М      |  33
    (3 строки)


    skypro=# UPDATE employee SET first_name = 'Николай', last_name = 'Назаров', age = 31 WHERE id = 1;
    UPDATE 1
    skypro=# SELECT * FROM employee;
    id | first_name | last_name | gender | age
----+------------+-----------+--------+-----
     2 | Мария      | Петрова   | Ж      |  29
     3 | Максим     | Солгалов  | М      |  33
     1 | Николай    | Назаров   | М      |  31
    (3 строки)


    skypro=# DELETE FROM employee WHERE id = 3;
    DELETE 1
    skypro=# SELECT * FROM employee;
    id | first_name | last_name | gender | age
----+------------+-----------+--------+-----
     2 | Мария      | Петрова   | Ж      |  29
     1 | Николай    | Назаров   | М      |  31
    (2 строки)


    skypro=#
 */
}