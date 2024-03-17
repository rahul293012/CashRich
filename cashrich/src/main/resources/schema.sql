CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       first_name VARCHAR(255),
                       last_name VARCHAR(255),
                       email VARCHAR(255) UNIQUE,
                       mobile VARCHAR(20) UNIQUE,
                       username VARCHAR(20) UNIQUE,
                       password VARCHAR(255)
);
