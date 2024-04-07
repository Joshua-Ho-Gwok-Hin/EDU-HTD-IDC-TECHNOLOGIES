use sakila;
select * from staff;
select * from country;
select * from states;
select * from customers; 

select * from user_profile;
select * from user_log_in;

INSERT INTO `abc_jobs`.`user_profile` (`email`, `first_name`, `last_name`, `gender`, `country`, `city`, `marital_status`, `birthday`) VALUES ('test@test.com', 'John', 'Williams', 'M', 'Singapore', 'Singapore', '1', '1989-06-01 00:00:00');
SET @last_user_id = LAST_INSERT_ID();
INSERT INTO user_log_in (user_name, user_password, secure_id, user_id) VALUES ('jamesbond', '007', '3', @last_user_id); 

INSERT INTO user_profile (email, first_name, last_name, gender, country, city, marital_status, birthday) VALUES ('jamesbond@mi6.com', 'James', 'Bond', 'M', 'Singapore', 'Singapore', '1', '1989-06-01 00:00:00');
SET @last_user_id = LAST_INSERT_ID();
INSERT INTO user_log_in (user_name, user_password, secure_id, user_id) VALUES ('jamesbond', '007', '3', @last_user_id); 

UPDATE user_log_in
SET user_name = 'ApplePig'
WHERE user_id = 2;
select * from security_ans;

alter table user_log_in
change last_update
last_update timestamp NOT NULL
DEFAULT CURRENT_TIMESTAMP
ON UPDATE CURRENT_TIMESTAMP;

alter table job_application
change apply_last_edit
apply_last_edit timestamp NOT NULL
DEFAULT CURRENT_TIMESTAMP
ON UPDATE CURRENT_TIMESTAMP;

alter table job_listing
change job_last_edit
job_last_edit timestamp NOT NULL
DEFAULT CURRENT_TIMESTAMP
ON UPDATE CURRENT_TIMESTAMP;

delete from user_log_in where user_id=105;
delete from user_profile where user_id=105;

select * from admin_profile;
select * from security_ans;
select * from marital_status_table;
select * from user_profile;
select * from user_log_in;
SELECT LAST_INSERT_ID(null);
INSERT INTO user_profile (email, first_name, last_name, gender, country, city, marital_status, birthday) VALUES('harry@potter.com','?','?','?','?','?','1','1998-12-31'); SET @last_user_id = LAST_INSERT_ID();INSERT INTO user_log_in (user_name, user_password, secure_id, user_id) VALUES('test32','fdfd','3',@last_user_id); 

select * from spring_test;
select * from user_type;
select * from user_profile;
select * from user_log_in;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `contact_number` varchar(45) DEFAULT NULL,
  `role_id` int(11) DEFAULT '2',
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tb_user_ibfk_1_idx` (`role_id`),
  CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `tb_role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;



CREATE TABLE `tb_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ;
truncate table user_profile;
truncate table user_log_in;

select * from 
