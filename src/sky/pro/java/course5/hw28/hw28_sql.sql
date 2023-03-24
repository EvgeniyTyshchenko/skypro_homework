CREATE TABLE employee (
        id BIGSERIAL NOT NULL PRIMARY KEY,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        gender VARCHAR(6) NOT NULL,
        age INT NOT NULL
);

INSERT INTO employee (first_name, last_name, gender, age)
VALUES ('Петр', 'Онищенко', 'М', 37),
       ('Ксения', 'Иванова', 'Ж', 43),
       ('Дмитрий', 'Герасимов', 'М', 29),
       ('Екатерина', 'Петрова', 'Ж', 34),
       ('Павел', 'Соболев', 'М', 38);


SELECT * FROM employee;

--Получите информацию об именах и фамилиях по всем сотрудникам. Колонки должны называться «Имя» и «Фамилия»
SELECT first_name AS Имя,
       last_name AS Фамилия
FROM employee;

--Получите всю информацию о сотрудниках, которые младше 30 или старше 50 лет
SELECT * FROM employee
WHERE NOT age BETWEEN 30 AND 50;

--Получите всю информацию о сотрудниках, которым от 30 до 50 лет
SELECT * FROM employee
WHERE age BETWEEN 30 AND 50;

--Выведите полный список сотрудников, которые отсортированы по фамилиям в обратном порядке
SELECT * FROM employee
ORDER BY last_name DESC;

--Выведите сотрудников, имена которых длиннее 4 символов
SELECT * FROM employee
WHERE first_name LIKE '_____%';

--Измените имена у двух сотрудников так, чтобы на 5 сотрудников было только 3 разных имени,
--то есть чтобы получились две пары тезок и один сотрудник с уникальным именем
UPDATE employee SET first_name = 'Дмитрий' WHERE id = 1;
UPDATE employee SET first_name = 'Екатерина' WHERE id = 2;

--Посчитайте суммарный возраст для каждого имени. Выведите в двух столбцах «имя» и «суммарный возраст»
SELECT first_name AS Имя,
       SUM(age) AS Суммарный_возраст
FROM employee GROUP BY Имя;

--Выведите имя и самый юный возраст, соответствующий имени
SELECT first_name AS Имя,
       age AS Возраст
FROM employee
WHERE age = (
    SELECT MIN(age)
    FROM employee
);

--Выведите имя и максимальный возраст только для неуникальных имен.
--Результат отсортируйте по возрасту в порядке возрастания
SELECT first_name AS Имя,
       MAX(age) AS Возраст
FROM employee GROUP BY Имя
HAVING COUNT(first_name) > 1
ORDER BY Возраст;