INSERT INTO customer(id,name) VALUES (1,'Jason');
INSERT INTO customer(id,name) VALUES (2,'Rakesh');

INSERT INTO favorite_payee(id,customer_name ,payee_name ,iban_code ,bank_name) VALUES (1,'Jason','RAKESH','12345678901234567890','ABC');
INSERT INTO favorite_payee(id,customer_name ,payee_name ,iban_code ,bank_name) VALUES (2,'Jason','Santhosh','12344567901234512340','ABC');
INSERT INTO favorite_payee(id,customer_name ,payee_name ,iban_code ,bank_name) VALUES (3,'Jason','RAKESH','12342334901234567890','ABC');
INSERT INTO favorite_payee(id,customer_name ,payee_name ,iban_code ,bank_name) VALUES (4,'Jason','Santhosh','12343333901234567890','ABC');

INSERT INTO bank_details(iban_code,bank_name) VALUES (5678,'RBS');
INSERT INTO bank_details(iban_code,bank_name) VALUES (4567,'AMEX');
commit;