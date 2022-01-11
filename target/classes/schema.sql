DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS job;

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar2(100) NOT NULL,
    e_mail varchar2(50) NOT NULL,
    UUID UUID

);

CREATE TABLE job (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar2(50) NOT NULL,
    location varchar2(50) NOT NULL
);

