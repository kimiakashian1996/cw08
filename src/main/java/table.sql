CREATE TABLE IF NOT EXISTS admin(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(255),
    username VARCHAR(255) UNIQUE ,
    password VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS patient
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(255),
    username VARCHAR(255) UNIQUE ,
    password VARCHAR(255)
    );
CREATE TABLE IF NOT EXISTS drug
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(255),
    price INT,
    inventory INT
    );
CREATE TABLE IF NOT EXISTS prescription
(
    id          SERIAL PRIMARY KEY,
    druglist_id INT REFERENCES drug_list (id),
    patient_id  INT REFERENCES patient (id),
    total_price INT
    );

CREATE TABLE IF NOT EXISTS drug_list
(
    id        SERIAL PRIMARY KEY,
    drug_id_1 INT REFERENCES drug (id),
    drug_id_2 INT REFERENCES drug (id),
    drug_id_3 INT REFERENCES drug (id),
    drug_id_4 INT REFERENCES drug (id),
    drug_id_5 INT REFERENCES drug (id)

    );

insert into drug values (DEFAULT,'ADRENALINE',10,2);
insert into drug values (DEFAULT,'NORADRENALINE',20,5);
insert into drug values (DEFAULT,'CALCIUM',10,6);
insert into drug values (DEFAULT,'DOPAMINE',40,2);
insert into drug values (DEFAULT,'ATROPINE',70,2);
insert into drug values (DEFAULT,'AMIODARONE',30,9);
insert into drug values (DEFAULT,'ADENOSINE',80,1);
insert into drug values (DEFAULT,'LIDOCAINE',40,7);


select * from drug;