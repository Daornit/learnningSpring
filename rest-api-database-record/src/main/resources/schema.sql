DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts (
    email  varchar(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL,
    PRIMARY KEY (email)
);
