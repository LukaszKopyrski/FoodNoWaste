CREATE TABLE registration (id int PRIMARY KEY AUTO_INCREMENT NOT NULL, name VARCHAR(64) NOT NULL, lastname VARCHAR(128) NOT NULL, phonenumber VARCHAR(64) NOT NULL, email VARCHAR(128) NOT NULL, password VARCHAR(64) NOT NULL);
INSERT INTO registration (id, name, lastname, phonenumber, email, password) VALUES (1, 'Rafal', 'Wozniak', '556718945', 'rafal556@gmail.com', 'rafal556');
INSERT INTO registration (id, name, lastname, phonenumber, email, password) VALUES (2, 'Kamil', 'Wozniak', '781446997', 'kamil7814@gmail.com', 'kamil7814');
INSERT INTO registration (id, name, lastname, phonenumber, email, password) VALUES (3, 'Monika', 'Grysicka', '992423557', 'monika992423@gmail.com', 'monika557');

Select * From registration;