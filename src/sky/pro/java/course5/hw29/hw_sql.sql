--Создайте таблицу city с колонками city_id и city_name
CREATE TABLE city (
                   city_id BIGSERIAL NOT NULL PRIMARY KEY,
                   city_name VARCHAR(60) NOT NULL
);

--Добавьте в таблицу employee колонку city_id
ALTER TABLE employee
    ADD city_id INT;

--Назначьте ее внешним ключом и свяжите с таблицей city
ALTER TABLE employee
    ADD CONSTRAINT fk_employee_city
    FOREIGN KEY (city_id) REFERENCES city (city_id);

--Заполните таблицу city и назначьте работникам соответствующие города
INSERT INTO city(city_name)
VALUES ('Краснодар'),
       ('Москва'),
       ('Ставрополь'),
       ('Нижний Новгород'),
       ('Казань');

--Получите имена и фамилии сотрудников, а также города, в которых они проживают
UPDATE employee SET city_id = 1 WHERE id = 1;
UPDATE employee SET city_id = 2 WHERE id = 2;
UPDATE employee SET city_id = 3 WHERE id = 3;
UPDATE employee SET city_id = 4 WHERE id = 4;
UPDATE employee SET city_id = 5 WHERE id = 5;

SELECT * FROM employee;

SELECT first_name, last_name, city_name FROM employee
INNER JOIN city
ON employee.city_id = city.city_id
ORDER BY first_name;

--Получите города, а также имена и фамилии сотрудников, которые в них проживают.
--Если в городе никто из сотрудников не живет, то вместо имени должен стоять null
INSERT INTO city(city_name)
VALUES ('Самара');

SELECT city_name, first_name, last_name FROM city
LEFT JOIN employee
ON  city.city_id = employee.city_id
ORDER BY city_name;

--Получите имена всех сотрудников и названия всех городов.
--Если в городе не живет никто из сотрудников, то вместо имени должен стоять null.
--Аналогично, если города для какого-то из сотрудников нет в списке, так же должен быть получен null
INSERT INTO employee(first_name, last_name, gender, age)
VALUES ('Константин', 'Корниенко', 'М', 29);

SELECT first_name, last_name, city_name FROM employee
FULL JOIN city
ON employee.city_id = city.city_id
ORDER BY first_name;

--Получите таблицу, в которой каждому имени должен соответствовать каждый город
SELECT first_name, last_name, city_name FROM employee
CROSS JOIN city;