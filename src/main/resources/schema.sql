CREATE TABLE customer
        (
        id NUMBER(20) NOT NULL,
        name VARCHAR2(20) NOT NULL,
        PRIMARY KEY (id)
        );

CREATE TABLE favorite_payee
        (
        id Number(20) NOT NULL,
        customer_name VARCHAR2(50) NOT NULL,
		payee_name VARCHAR2(50) NOT NULL,
        iban_code VARCHAR2(20) NOT NULL,
		bank_name VARCHAR2(50) NOT NULL
        );

CREATE TABLE bank_details
        (
        iban_code VARCHAR2(4) NOT NULL,
        bank_name VARCHAR2(50) NOT NULL
        );

