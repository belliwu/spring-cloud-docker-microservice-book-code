DROP TABLE user if EXISTS;

CREATE TABLE user (
    id BIGINT NOT NULL, 
    username VARCHAR(40) NOT NULL,
    name VARCHAR(20) NOT NULL,    
    age SMALLINT, 
    PRIMARY KEY (id)
);