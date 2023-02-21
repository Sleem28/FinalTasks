USE human_friends;
DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals (
SELECT * FROM cats
WHERE `birthday` > (NOW() - INTERVAL 3 YEAR) AND  `birthday` < (NOW() - INTERVAL 1 YEAR)

UNION ALL 

SELECT * FROM humsters
WHERE `birthday` > (NOW() - INTERVAL 3 YEAR) AND  `birthday` < (NOW() - INTERVAL 1 YEAR) 

UNION ALL 

SELECT * FROM dogs
WHERE `birthday` > (NOW() - INTERVAL 3 YEAR) AND  `birthday` < (NOW() - INTERVAL 1 YEAR) 

UNION ALL 

SELECT * FROM horses
WHERE `birthday` > (NOW() - INTERVAL 3 YEAR) AND  `birthday` < (NOW() - INTERVAL 1 YEAR)

UNION ALL 

SELECT * FROM donkeys
WHERE `birthday` > (NOW() - INTERVAL 3 YEAR) AND  `birthday` < (NOW() - INTERVAL 1 YEAR)
);

ALTER TABLE young_animals ADD age VARCHAR(100);
UPDATE young_animals SET age = CONCAT(TIMESTAMPDIFF(YEAR,`birthday`,NOW()),' year ', MOD(TIMESTAMPDIFF(MONTH,`birthday`,NOW()),12),' month');
