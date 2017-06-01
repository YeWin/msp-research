DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id serial,
  content text,
  user_name VARCHAR(100) NOT NULL,
  email VARCHAR(100),
  gender VARCHAR(10),
  age int,
  created_date date,
  updated_date date,
  PRIMARY KEY (id));