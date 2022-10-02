CREATE TABLE product (
    description VARCHAR(255) NOT NULL,
    price DOUBLE,
    salePrice DOUBLE,
    type VARCHAR(255) NOT NULL,
    serialCode VARCHAR(255) NOT NULL,
    PRIMARY KEY (serialCode)
);