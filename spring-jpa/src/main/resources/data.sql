create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1001, 'Nirakar', 'Bengaluru', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1002, 'James', 'New york', now());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(1003, 'Pieter', 'Amsterdam', now());
