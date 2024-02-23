CREATE TABLE trainer(
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(137) NOT NULL,
    age INTEGER NOT NULL,
    gender VARCHAR(12) NOT NULL,
    email VARCHAR(256) NOT NULL,
    password VARCHAR(56)
);

CREATE TABLE trainee (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(137) NOT NULL,
    age INTEGER NOT NULL,
    gender VARCHAR(12) NOT NULL,
    email VARCHAR(256) NOT NULL,
    password VARCHAR(56),
    trainer_id VARCHAR(255),
    FOREIGN KEY (trainer_id) 
        REFERENCES trainer(id)
);

CREATE TABLE workout (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(56),
    excercises JSON,
    trainee_id VARCHAR(255),
    FOREIGN KEY (trainee_id)
        REFERENCES trainee(id)
        ON DELETE CASCADE
);
