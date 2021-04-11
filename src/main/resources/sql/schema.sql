CREATE TABLE customer
        (
        id INT NOT NULL,
        name VARCHAR(20) NOT NULL
        PRIMARY KEY (id)
        );

CREATE TABLE payee.favorite_payee
        (
        customer_name VARCHAR(50) NOT NULL,
	payee_name VARCHAR(50) NOT NULL,
        iban_code VARCHAR(20) NOT NULL,
	bank_name VARCHAR(50) NOT NULL,
	INDEX customer_name_index (customer_name),
        CONSTRAINT FK_Customer_Name FOREIGN KEY (customer_name)
        REFERENCES payee.customer(name)
        );

CREATE TABLE bank_details
        (
        iban_code VARCHAR(4) NOT NULL,
        bank_name VARCHAR(50) NOT NULL
        );

