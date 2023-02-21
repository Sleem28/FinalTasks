USE human_friends;
DROP TABLE IF EXISTS `union`;
CREATE TABLE `union` (
SELECT id,`name`,`birthday`,legs,height,weight,id_color,id_status,cry FROM donkeys
UNION ALL SELECT id,`name`,`birthday`,legs,height,weight,id_color,id_status,cry FROM horses
);
