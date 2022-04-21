CREATE TABLE IF NOT EXISTS student(
  id SERIAL,
  name VARCHAR (100) NOT NULL,
  age INT,
  PRIMARY KEY (id)
  );

CREATE TABLE IF NOT EXISTS teacher(
    id SERIAL,
    name VARCHAR (100) NOT NULL,
    age INT,
    PRIMARY KEY (id)
    FOREIGN KEY ...
    );

CREATE TABLE IF NOT EXISTS student(
    id SERIAL,
    name VARCHAR (100) NOT NULL,
    age INT,
    PRIMARY KEY (id)
    );