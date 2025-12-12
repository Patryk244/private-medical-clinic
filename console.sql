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


-- offers

INSERT INTO offers (offer_name, description, specialization, price_pln) VALUES
                                                                          ('Comprehensive Eye Exam', 'A thorough examination of eye health, including vision testing, glaucoma screening, and retinal imaging.', 'Ophthalmology', 250.00),
                                                                          ('LASIK Pre-Op Assessment', 'Detailed evaluation before laser eye surgery.', 'Ophthalmology', 190.00),
                                                                          ('Pediatric Vision Screening', 'Routine check-up for children to assess visual acuity and development.', 'Ophthalmology', 140.00),
                                                                          ('Cataract Surgery Consultation', 'Initial meeting to discuss cataract removal procedure and options.', 'Ophthalmology', 160.00),
                                                                          ('Glaucoma Follow-up Visit', 'Monitoring of eye pressure and optic nerve health for existing patients.', 'Ophthalmology', 95.00),
                                                                          ('Retinal Imaging and Analysis', 'High-resolution photography of the retina to detect diseases.', 'Ophthalmology', 120.00),
                                                                          ('Dry Eye Syndrome Treatment Plan', 'Diagnosis and personalized plan for chronic dry eyes.', 'Ophthalmology', 110.00),
                                                                          ('Low Vision Rehabilitation Assessment', 'Evaluation for patients with permanent visual impairment.', 'Ophthalmology', 200.00),

                                                                          ('Psychological Intake Session', 'First session to understand mental health concerns and outline treatment goals.', 'Psychiatry', 160.00),
                                                                          ('Medication Management Follow-up', 'Routine session to monitor effectiveness and side effects of psychiatric medication.', 'Psychiatry', 90.00),
                                                                          ('Cognitive Behavioral Therapy (CBT)', 'Individual 50-minute session focused on cognitive restructuring.', 'Psychiatry', 130.00),
                                                                          ('Couples Therapy Session', 'Joint session to address relationship dynamics and conflicts.', 'Psychiatry', 180.00),
                                                                          ('Child/Adolescent Psychiatry Eval', 'Comprehensive evaluation of mental health in younger patients.', 'Psychiatry', 220.00),
                                                                          ('Group Therapy Session (Anxiety)', 'Structured group session focused on managing anxiety disorders.', 'Psychiatry', 60.00),
                                                                          ('Telepsychiatry Appointment (30 min)', 'Virtual session for established patients.', 'Psychiatry', 100.00),
                                                                          ('Initial PTSD Assessment', 'Specialized evaluation for trauma-related disorders.', 'Psychiatry', 175.00),

                                                                          ('Urology Consultation (Initial)', 'Assessment for general urinary tract or reproductive system concerns.', 'Urology', 135.00),
                                                                          ('Kidney Stone Diagnostic Imaging', 'Imaging tests to locate and assess kidney stones.', 'Urology', 280.00),
                                                                          ('Prostate Cancer Screening', 'PSA blood test interpretation and physical exam.', 'Urology', 110.00),
                                                                          ('UTI Recurrence Evaluation', 'In-depth assessment for frequent urinary tract infections.', 'Urology', 145.00),
                                                                          ('Cystoscopy Procedure (Diagnostic)', 'Endoscopic examination of the bladder (excluding facility fee).', 'Urology', 350.00),
                                                                          ('Male Infertility Evaluation', 'Comprehensive testing and consultation for male reproductive health.', 'Urology', 210.00),
                                                                          ('Vasectomy Consultation', 'Pre-procedure consultation and patient education.', 'Urology', 85.00),
                                                                          ('Bladder Health Assessment', 'Evaluation for incontinence or other bladder control issues.', 'Urology', 125.00),

                                                                          ('Cardiology Stress Test', 'Monitoring of heart function during physical exertion.', 'Cardiology', 320.00),
                                                                          ('Echocardiogram (TTE)', 'Ultrasound of the heart to assess structure and function.', 'Cardiology', 450.00),
                                                                          ('Routine Cardiac Check-up', 'Follow-up appointment for patients with known heart conditions.', 'Cardiology', 100.00),
                                                                          ('Electrocardiogram (ECG/EKG)', 'Recording of the electrical activity of the heart.', 'Cardiology', 75.00),
                                                                          ('Hypertension Management Plan', 'Initial consultation for managing high blood pressure.', 'Cardiology', 150.00),
                                                                          ('Holter Monitor Installation & Analysis', '24-hour monitoring of heart rhythm.', 'Cardiology', 200.00),
                                                                          ('Arrhythmia Consultation', 'Assessment for irregular heart rhythms and palpitations.', 'Cardiology', 170.00),
                                                                          ('Pacemaker/ICD Check', 'Electronic device check and programming.', 'Cardiology', 120.00),

                                                                          ('Dilated Fundus Exam', 'Detailed eye exam focusing on the retina and optic nerve.', 'Ophthalmology', 155.00),
                                                                          ('Psychiatric Crisis Evaluation', 'Urgent assessment for acute mental health distress.', 'Psychiatry', 250.00),
                                                                          ('Urodynamic Study', 'Test to evaluate how the bladder and urethra are storing and releasing urine.', 'Urology', 400.00),
                                                                          ('Peripheral Arterial Disease Screening', 'Screening test to check circulation in the limbs.', 'Cardiology', 130.00),
                                                                          ('Corneal Topography', 'Mapping the curvature of the cornea.', 'Ophthalmology', 105.00),
                                                                          ('Addiction Counseling Session', 'Individual therapy focused on substance use and recovery.', 'Psychiatry', 140.00),
                                                                          ('BPH (Enlarged Prostate) Treatment Eval', 'Assessment of treatment options for benign prostatic hyperplasia.', 'Urology', 165.00),
                                                                          ('Pre-Surgical Cardiac Clearance', 'Assessment to ensure the patient is fit for non-cardiac surgery.', 'Cardiology', 195.00);

delete from offers where offer_id = 1;