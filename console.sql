create database medical_clinic;

use medical_clinic;

-- Patients

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Jan', 'Kowalski', 'jan.kowalski@example.com', '12345678901', '1990-01-01', FALSE, 'Warszawa', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Anna', 'Nowak', 'anna.nowak@example.com', '23456789012', '1985-05-15', FALSE, 'Kraków', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Piotr', 'Wiśniewski', 'piotr.wisniewski@example.com', '34567890123', '1978-11-20', FALSE, 'Gdańsk', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Katarzyna', 'Wójcik', 'katarzyna.wojcik@example.com', '45678901234', '1995-03-03', FALSE, 'Wrocław', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Michał', 'Kozłowski', 'michal.kozlowski@example.com', '56789012345', '2000-08-10', FALSE, 'Poznań', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Magdalena', 'Mazur', 'magdalena.mazur@example.com', '67890123456', '1965-12-25', FALSE, 'Łódź', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Krzysztof', 'Lewandowski', 'krzysztof.lewandowski@example.com', '78901234567', '1972-04-05', TRUE, 'Katowice', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Alicja', 'Zielińska', 'alicja.zielinska@example.com', '89012345678', '1998-09-18', FALSE, 'Szczecin', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Tomasz', 'Jankowski', 'tomasz.jankowski@example.com', '90123456789', '1982-06-30', FALSE, 'Lublin', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Natalia', 'Woźniak', 'natalia.wozniak@example.com', '01234567890', '1993-02-12', FALSE, 'Bydgoszcz', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Marek', 'Szymański', 'marek.szymański@example.com', '10987654321', '1960-07-07', FALSE, 'Rzeszów', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Ewa', 'Dąbrowska', 'ewa.dabrowska@example.com', '21098765432', '1991-10-01', FALSE, 'Białystok', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Jakub', 'Kaczmarek', 'jakub.kaczmarek@example.com', '32109876543', '1987-03-22', FALSE, 'Olsztyn', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Monika', 'Krawczyk', 'monika.krawczyk@example.com', '43210987654', '1975-01-08', FALSE, 'Kielce', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Damian', 'Piotrowski', 'damian.piotrowski@example.com', '54321098765', '1999-05-28', FALSE, 'Radom', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Weronika', 'Grabowska', 'weronika.grabowska@example.com', '65432109876', '1988-11-17', FALSE, 'Toruń', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Rafał', 'Zając', 'rafal.zajac@example.com', '76543210987', '1970-02-09', FALSE, 'Sosnowiec', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Joanna', 'Pawlak', 'joanna.pawlak@example.com', '87654321098', '1994-12-04', FALSE, 'Częstochowa', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Andrzej', 'Górski', 'andrzej.gorski@example.com', '98765432109', '1969-07-14', TRUE, 'Gdynia', 'Polska');

INSERT INTO patients (first_name, last_name, email, pesel, birth_date, blocked, city, country)
VALUES ('Karolina', 'Adamczyk', 'karolina.adamczyk@example.com', '09876543210', '1980-08-29', FALSE, 'Bielsko-Biała', 'Polska');

delete from patients where patient_id <= 100;

drop table patients;





-- Doctors

INSERT INTO doctors (first_name, last_name, email, specialization) VALUES
                                                                     ('Anna', 'Kowalska', 'anna.kowalska@example.com', 'Ophthalmology'),
                                                                     ('Piotr', 'Nowak', 'piotr.nowak@example.com', 'Psychiatry'),
                                                                     ('Ewa', 'Wiśniewska', 'ewa.wisniewska@example.com', 'Urology'),
                                                                     ('Krzysztof', 'Zieliński', 'krzysztof.zielinski@example.com', 'Cardiology'),
                                                                     ('Magdalena', 'Wójcik', 'magdalena.wojcik@example.com', 'Ophthalmology'),
                                                                     ('Andrzej', 'Kowalczyk', 'andrzej.kowalczyk@example.com', 'Psychiatry'),
                                                                     ('Monika', 'Lewandowska', 'monika.lewandowska@example.com', 'Urology'),
                                                                     ('Tomasz', 'Dąbrowski', 'tomasz.dabrowski@example.com', 'Cardiology'),
                                                                     ('Katarzyna', 'Michalska', 'katarzyna.michalska@example.com', 'Ophthalmology'),
                                                                     ('Jan', 'Adamek', 'jan.adamek@example.com', 'Psychiatry'),
                                                                     ('Alicja', 'Wróbel', 'alicja.wrobel@example.com', 'Urology'),
                                                                     ('Marek', 'Jankowski', 'marek.jankowski@example.com', 'Cardiology'),
                                                                     ('Karolina', 'Szymańska', 'karolina.szymanska@example.com', 'Ophthalmology'),
                                                                     ('Michał', 'Bąk', 'michal.bak@example.com', 'Psychiatry'),
                                                                     ('Julia', 'Górska', 'julia.gorska@example.com', 'Urology'),
                                                                     ('Paweł', 'Kaczmarek', 'pawel.kaczmarek@example.com', 'Cardiology'),
                                                                     ('Weronika', 'Borowska', 'weronika.borowska@example.com', 'Ophthalmology'),
                                                                     ('Łukasz', 'Mazur', 'lukasz.mazur@example.com', 'Psychiatry'),
                                                                     ('Natalia', 'Pająk', 'natalia.pajak@example.com', 'Urology'),
                                                                     ('Grzegorz', 'Wesołowski', 'grzegorz.wesolowski@example.com', 'Cardiology');

drop table doctors;