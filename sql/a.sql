use amusementpark;

-- 놀이기구
CREATE TABLE rides (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    location VARCHAR(50) NOT NULL
);

-- 입장객
CREATE TABLE visitors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    ride_id INT, 
    FOREIGN KEY (ride_id) REFERENCES rides(id)
);
