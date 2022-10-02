 CREATE TABLE employee(
 id_employee INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
 surname VARCHAR(255),
 name VARCHAR(255),
 age INT,
 hours INT,
 hasChildren BOOLEAN,
 isMale BOOLEAN,
 dateAssumption DATE DEFAULT CURRENT_DATE
 );






