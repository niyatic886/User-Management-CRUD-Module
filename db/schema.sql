CREATE TABLE user (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      email_id VARCHAR(100) NOT NULL UNIQUE,
                      name VARCHAR(100) NOT NULL,
                      whatsapp_number VARCHAR(15),
                      gender VARCHAR(10)
);
