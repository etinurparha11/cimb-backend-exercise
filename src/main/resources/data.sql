DROP TABLE IF EXISTS PEGAWAI;  
CREATE TABLE PEGAWAI (  
    userid INT AUTO_INCREMENT  PRIMARY KEY,  
    nama VARCHAR(100) NOT NULL,  
    alamat VARCHAR(250) NOT NULL  
);

INSERT INTO PEGAWAI (nama,alamat) VALUES ('ETI', 'CIPONDOH');  
INSERT INTO PEGAWAI (nama,alamat) VALUES ('NURPARHA', 'TANGERANG');  