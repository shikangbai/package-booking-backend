CREATE TABLE package (
  id VARCHAR(100) default sys_guid() PRIMARY KEY,
  billNo VARCHAR(64) NOT NULL,
  addressee VARCHAR(64) NOT NULL,
  photo VARCHAR (32) NOT NULL,
  status VARCHAR (12) NOT NULL,
  weight varchar (12) ,
  pickTime timestamp
);
