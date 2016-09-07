-- Sets password to Nikomysql
ALTER USER 'root'@'localhost' IDENTIFIED BY'Nikomysql';

USE springdbc;

-- Created Register Table
CREATE TABLE register
(
ID INT NOT NULL auto_increment,
email VARCHAR (20) NOT NULL,
pass VARCHAR(20) NOT NULL,
PRIMARY KEY (ID)
);

-- Inserts values into Register Table
INSERT INTO register 
VALUES
(102, "admin", "pass@123"),
(102, "admin", "123"),
(103, "admin", "ABC"),
(104, "admin", "Eduardo");


-- Validate values
SELECT * FROM register;