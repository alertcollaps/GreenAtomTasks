-- Предполагается, что таблица в БД существует.
-- Предполагается, что имя таблицы - demo.
-- Предполагается, что таблица заполнена нужными значениями.
DROP TABLE if EXISTS temp1;
CREATE TABLE if not EXISTS temp1 as 
SELECT * FROM demo 
WHERE id not in ( 
SELECT id FROM demo
WHERE expirience = (SELECT MAX(expirience) from demo) 
LIMIT 1
);
SELECT * from temp1
WHERE expirience = (SELECT MAX(expirience) from temp1)
LIMIT 1;
drop TABLE temp1;