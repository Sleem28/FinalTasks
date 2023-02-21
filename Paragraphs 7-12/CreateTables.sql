USE human_friends;
#------------------------------Add color table-------------------------------------+
DROP TABLE IF EXISTS color;
CREATE TABLE color (
	id INT PRIMARY KEY AUTO_INCREMENT,
    color VARCHAR(20)
);
INSERT INTO color (color)
VALUES
('red'),
('black'),
('white'),
('green'),
('yellow'),
('colorfull');
#------------------------------Add status table-------------------------------------+
DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `status` VARCHAR(20)
);
INSERT INTO `status` (`status`)
VALUES
('work'),
('rest'),
('play'),
('train'),
('enjoy'),
('sleep');
#------------------------------Add skills table-------------------------------------+
DROP TABLE IF EXISTS skills;
CREATE TABLE skills (
	id INT PRIMARY KEY AUTO_INCREMENT,
    skill VARCHAR(100)
);
INSERT INTO skills (skill)
VALUES
('hunting'),
('lazying'),
('making shit'),
('jumping on the human head at night');
#------------------------------Add donkeys-------------------------------------+
DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
    `birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO donkeys (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
(NULL,'2021-01-29',4,1.2,32.5,2,1,'ia',3,NULL,NULL),
(NULL,'2021-03-19',4,1.1,35.3,3,2,'ia-ia',3,NULL,NULL),
(NULL,'2020-05-21',4,1.1,32.0,2,1,'ia-ia-ia-ia',3,NULL,NULL),
(NULL,'2019-06-29',4,1.1,30.3,2,1,'ia',3,NULL,NULL);
#------------------------------Add camels-------------------------------------+
DROP TABLE IF EXISTS camels;
CREATE TABLE camels (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
    `birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO camels (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
(NULL,'2021-01-29',4,2.2,132.5,2,1,'hrr',3,NULL,NULL),
(NULL,'2021-09-19',4,2.1,135.3,3,2,'hrr-hrr',3,NULL,NULL),
(NULL,'2020-01-09',4,2.1,132.0,2,1,'hrr-hrr-ia',3,NULL,NULL),
(NULL,'2018-01-01',4,2.1,130.3,4,1,'hrr',3,NULL,NULL);
#------------------------------Add horses-------------------------------------+
DROP TABLE IF EXISTS horses;
CREATE TABLE horses (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
    `birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO horses (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
(NULL,'2021-01-29',4,2.2,132.5,2,1,'igogo',3,NULL,NULL),
(NULL,'2020-09-24',4,2.1,135.3,3,2,'igogo-igogo',3,NULL,NULL),
(NULL,'2018-01-03',4,2.1,132.0,2,1,'igogo-igogo-igogo',3,NULL,NULL),
(NULL,'2021-06-13',4,2.1,130.3,4,1,'igogo',3,NULL,NULL);

#------------------------------Add cats-------------------------------------+
DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
	`birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO cats (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
('vaska','2021-06-13',4,0.25,2.5,2,3,'miau',1,3,4),
('murzik','2018-04-13',4,0.31,5.3,3,3,'miau-miau',2,3,4),
('noname','2017-01-03',4,0.35,2.0,2,4,'miau-miau-miau',1,2,3),
('vasilisa','2021-06-13',4,0.3,3.3,4,3,'miau',1,3,4);
#------------------------------Add dogs-------------------------------------+
DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
    `birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO dogs (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
('sam','2022-01-22',4,0.5,2.5,2,3,'whuf',1,3,4),
('hunny','2021-08-03',4,0.7,5.3,3,2,'whuf-whuf',2,3,4),
('tor','2022-02-15',4,0.8,2.0,2,4,'whuf-whuf-whuf',1,2,3),
('lucky','2017-01-03',4,0.9,2.3,4,2,'whuf',1,3,4);
#------------------------------Add humsters-------------------------------------+
DROP TABLE IF EXISTS humsters;
CREATE TABLE humsters (
	id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100),
    `birthday`DATETIME,
    legs INT,
    height DECIMAL,
    weight DECIMAL,
    id_color INT,
    id_status INT,
    cry VARCHAR(100),
    id_skill_1 INT,
    id_skill_2 INT,
    id_skill_3 INT,
    FOREIGN KEY(id_color) REFERENCES color(id),
    FOREIGN KEY(id_status) REFERENCES `status`(id),
    FOREIGN KEY(id_skill_1) REFERENCES skills(id),
    FOREIGN KEY(id_skill_2) REFERENCES skills(id),
    FOREIGN KEY(id_skill_3) REFERENCES skills(id)
);
INSERT INTO humsters (`name`,`birthday`,legs,height,weight,id_color,id_status,cry,id_skill_1,id_skill_2,id_skill_3)
VALUES
('h1','2022-01-03',4,0.05,0.5,2,3,'pi',1,3,4),
('h2','2021-11-13',4,0.06,0.3,3,2,'pi-pi',2,3,4),
('h3','2017-11-23',4,0.08,0.3,2,4,'pi-pi-pi',1,2,3),
('h4','2022-11-03',4,0.05,0.3,4,2,'pi',1,3,4);
