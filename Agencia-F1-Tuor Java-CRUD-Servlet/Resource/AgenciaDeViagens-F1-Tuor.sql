CREATE SCHEMA AgenciaDeViagens;
USE AgenciaDeViagensNyssa;

CREATE TABLE IF NOT EXISTS AgenciaDeViagens.Cliente (
    idCLIENTE INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeCLIENTE VARCHAR(50) NOT NULL,
    enederecoCLIENTE VARCHAR(50) NOT NULL UNIQUE,
    numeroCPF VARCHAR(50) NOT NULL UNIQUE,
    numeroTELEFONE VARCHAR(50) NOT NULL,
    enderecoEMAIL VARCHAR(50) NOT NULL,
    fk_Promocao_idPromocao INT UNSIGNED NOT NULL 
);

CREATE TABLE IF NOT EXISTS AgenciaDeViagens.Pacote (
    idPacote INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomePacote VARCHAR(100) NOT NULL,
    dataChegada VARCHAR(100) NOT NULL,
    dataSaida VARCHAR(100) NOT NULL,
    nomeHotel VARCHAR(100) NOT NULL,
    idVoo VARCHAR(100) NOT NULL,
    valor FLOAT NOT NULL,
    idPromocao VARCHAR(100) NOT NULL
);
 
ALTER TABLE Cliente ADD CONSTRAINT FK_Cliente_2
    FOREIGN KEY (fk_Pacote_idPacote)
    REFERENCES Pacote (idPacote)
    ON DELETE RESTRICT;
