USE human_friends;

ALTER TABLE donkeys ADD prev_table_name VARCHAR(100);
UPDATE donkeys SET prev_table_name = 'donkeys';

ALTER TABLE horses ADD prev_table_name VARCHAR(100);
UPDATE horses SET prev_table_name = 'horses';

ALTER TABLE cats ADD prev_table_name VARCHAR(100);
UPDATE cats SET prev_table_name = 'cats';

ALTER TABLE dogs ADD prev_table_name VARCHAR(100);
UPDATE dogs SET prev_table_name = 'dogs';

ALTER TABLE humsters ADD prev_table_name VARCHAR(100);
UPDATE humsters SET prev_table_name = 'humsters';

CREATE TABLE all_animals(
SELECT * FROM donkeys
UNION ALL
SELECT * FROM horses
UNION ALL
SELECT * FROM cats
UNION ALL
SELECT * FROM dogs
UNION ALL
SELECT * FROM humsters
);