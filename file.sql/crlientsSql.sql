CREATE TABLE client(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(255),
surname VARCHAR(255),
age INT,
email VARCHAR(255) UNIQUE,
address VARCHAR(255),
haslayaltycard BOOLEAN,
loyaltycard ENUM("STANDARDCARD","PREMIUMCARD","GOLDCARD")
);
