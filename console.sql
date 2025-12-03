create database medical_clinic;

use medical_clinic;

delete from patients where patient_id <= 100;

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Jan', 'Kowalski', 'jan.kowalski@example.com', 'SecurePassword123', '1990-01-01', FALSE, 'Warszawa', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Anna', 'Nowak', 'anna.nowak@example.com', 'SecurePassword123', '1985-05-15', FALSE, 'Kraków', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Piotr', 'Wiśniewski', 'piotr.wisniewski@example.com', 'SecurePassword123', '1978-11-20', FALSE, 'Gdańsk', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Katarzyna', 'Wójcik', 'katarzyna.wojcik@example.com', 'SecurePassword123', '1995-03-03', FALSE, 'Wrocław', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Michał', 'Kozłowski', 'michal.kozlowski@example.com', 'SecurePassword123', '2000-08-10', FALSE, 'Poznań', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Magdalena', 'Mazur', 'magdalena.mazur@example.com', 'SecurePassword123', '1965-12-25', FALSE, 'Łódź', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Krzysztof', 'Lewandowski', 'krzysztof.lewandowski@example.com', 'SecurePassword123', '1972-04-05', TRUE, 'Katowice', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Alicja', 'Zielińska', 'alicja.zielinska@example.com', 'SecurePassword123', '1998-09-18', FALSE, 'Szczecin', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Tomasz', 'Jankowski', 'tomasz.jankowski@example.com', 'SecurePassword123', '1982-06-30', FALSE, 'Lublin', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Natalia', 'Woźniak', 'natalia.wozniak@example.com', 'SecurePassword123', '1993-02-12', FALSE, 'Bydgoszcz', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Marek', 'Szymański', 'marek.szymański@example.com', 'SecurePassword123', '1960-07-07', FALSE, 'Rzeszów', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Ewa', 'Dąbrowska', 'ewa.dabrowska@example.com', 'SecurePassword123', '1991-10-01', FALSE, 'Białystok', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Jakub', 'Kaczmarek', 'jakub.kaczmarek@example.com', 'SecurePassword123', '1987-03-22', FALSE, 'Olsztyn', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Monika', 'Krawczyk', 'monika.krawczyk@example.com', 'SecurePassword123', '1975-01-08', FALSE, 'Kielce', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Damian', 'Piotrowski', 'damian.piotrowski@example.com', 'SecurePassword123', '1999-05-28', FALSE, 'Radom', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Weronika', 'Grabowska', 'weronika.grabowska@example.com', 'SecurePassword123', '1988-11-17', FALSE, 'Toruń', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Rafał', 'Zając', 'rafal.zajac@example.com', 'SecurePassword123', '1970-02-09', FALSE, 'Sosnowiec', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Joanna', 'Pawlak', 'joanna.pawlak@example.com', 'SecurePassword123', '1994-12-04', FALSE, 'Częstochowa', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Andrzej', 'Górski', 'andrzej.gorski@example.com', 'SecurePassword123', '1969-07-14', TRUE, 'Gdynia', 'Polska');

INSERT INTO patients (first_name, last_name, email, password, birth_date, is_blocked, city, country)
VALUES ('Karolina', 'Adamczyk', 'karolina.adamczyk@example.com', 'SecurePassword123', '1980-08-29', FALSE, 'Bielsko-Biała', 'Polska');

delete from patients where patient_id = 3;

drop table patients;
