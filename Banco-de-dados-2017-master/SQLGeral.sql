CREATE TABLE estado(
idest SERIAL NOT NULL,
nome  VARCHAR(50) NOT NULL,
CONSTRAINT pk_estado PRIMARY KEY (idest),
sigla CHAR(2) NOT NULL

);


CREATE TABLE cidade(
idcid SERIAL NOT NULL,
nome VARCHAR(50) NOT NULL,
idest INTEGER NOT NULL,
CONSTRAINT pk_cidade PRIMARY KEY (idcid),
CONSTRAINT fk_cidade_estado FOREIGN KEY (idest) REFERENCES estado(idest)
);


CREATE TABLE autor(
idaut SERIAL NOT NULL,
nome VARCHAR(100) NOT NULL,
rua VARCHAR(100) NOT NULL,
numero VARCHAR(6) NOT NULL,
bairro VARCHAR(50) NOT NULL,
cep CHAR(8) NOT NULL,
email VARCHAR(200) NOT NULL,
fone VARCHAR(15) NOT NULL,
dtnas DATE NOT NULL,
idcid INTEGER NOT NULL,
CONSTRAINT pk_autor PRIMARY KEY (idaut),
CONSTRAINT fk_autor_idcid FOREIGN KEY (idcid) REFERENCES cidade (idcid)

);



CREATE TABLE editora(
idedi SERIAL NOT NULL, 
nome VARCHAR(100) NOT NULL,
email VARCHAR(200) NOT NULL,
url VARCHAR(255) NOT NULL,
fone VARCHAR(15) NOT NULL,
idcid INTEGER NOT NULL,
CONSTRAINT pk_editora PRIMARY KEY (idedi),
CONSTRAINT fk_editora_cidade FOREIGN KEY (idcid) REFERENCES cidade(idcid)
);

CREATE TABLE assunto(
idassunt SERIAL NOT NULL,
nome VARCHAR(50) NOT NULL,
CONSTRAINT pk_assunto PRIMARY KEY (idassunt),
CONSTRAINT fk_assunto FOREIGN KEY (idassunt) REFERENCES assunto(idassunt)
);


CREATE TABLE livro(
idlivr SERIAL NOT NULL,
titulo TEXT NOT NULL,
precovenda NUMERIC(6,2) NOT NULL,
idedi INTEGER NOT NULL,
idassunt INTEGER NOT NULL,
CONSTRAINT pk_livro PRIMARY KEY (idlivr),
CONSTRAINT fk_livro_editora FOREIGN KEY (idedi) REFERENCES editora(idedi),
CONSTRAINT fk_livro_assunto FOREIGN KEY (idassunt) REFERENCES assunto(idassunt)
);



CREATE TABLE publicacao(
idlivr INTEGER NOT NULL,
idaut INTEGER NOT NULL,
CONSTRAINT pk_publicacao PRIMARY KEY (idaut,idlivr),
CONSTRAINT fk_publicacao_autor FOREIGN KEY (idaut) REFERENCES autor(idaut),
CONSTRAINT fk_publicacao_livro FOREIGN KEY (idlivr) REFERENCES livro(idlivr)
);