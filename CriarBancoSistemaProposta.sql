create database sistemaProposta;
use sistemaProposta;
create table administradora(
	id integer auto_increment primary key,
    nome varchar(50),
    cnpj varchar(14)
);

create table assessoria(
	id integer auto_increment primary key,
    nome varchar(50),
    cnpj varchar(14)
);

create table assessoria_administradora(
	idAssessoria integer,
    idAdministradora integer,
    primary key(idAssessoria,idAdministradora),
    foreign key(idAssessoria) references assessoria(id),
    foreign key(idAdministradora) references administradora(id)
);

CREATE TABLE uf (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    uf VARCHAR(2) UNIQUE,
    estado VARCHAR(50),
    capital VARCHAR(50),
    regiao VARCHAR(15),
    pais VARCHAR(2)
    
    
);
CREATE TABLE cidade (
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nomeCidade VARCHAR(50),
    idUf Integer,
    FOREIGN KEY (idUf) REFERENCES uf (id)
);


create table cliente(
	id integer auto_increment primary key,
    nome varchar(50),
    cnpj_cpf varchar(14),
    idUf integer,
    idCidade integer,
    foreign key (idUf) references uf(id),
    foreign key (idCidade) references cidade(id)
);


create table contrato(
	numContrato varchar(50) primary key,
    idCliente integer,
    idAssessoria integer,
    idAdministradora integer,
    foreign key (idCliente) references cliente(id),
    foreign key (idAssessoria) references assessoria(id),
    foreign key (idAdministradora) references administradora(id)
    
);

CREATE TABLE divida (
    id INTEGER auto_increment,
    numContrato varchar(50),
    vlrPrincipal FLOAT,
    vlrMultas FLOAT,
    vlrJuros FLOAT,
    vlrDespesas FLOAT,
    perc_HO FLOAT,
    vlrCategoria FLOAT,
    perc_SaldoDevedor FLOAT,
    vlrPOS FLOAT,
    vlrDebitoBem FLOAT,
    dtAtraso date,
    dtAtualizacao DATE,
    PRIMARY KEY (id, numContrato),
    foreign key(numContrato) references contrato(numContrato)
);


CREATE TABLE proposta (
    id INTEGER auto_increment PRIMARY KEY,
    idDivida INTEGER,
    vlrPrincipal FLOAT,
    vlrMultas FLOAT,
    vlrJuros FLOAT,
    vlrDespesas FLOAT,
    perc_HO FLOAT,
    qtdParcelas INTEGER,
    tipoProposta varchar(20),
    StatusPagamento VARCHAR (10),
    StatusProposta VARCHAR(14),
    dtProposta DATE,
    dtVencimento DATE,
    idContraProposta INTEGER,
    foreign key (idDivida) references divida(id)
    
);

 CREATE TABLE parcela (
    idProposta INTEGER not null,
    nParcela INTEGER not null,
    vlrApagar FLOAT not null,
	dtVencimento date,
    dtPagamento date,
    statusPagamento Varchar(20),
    PRIMARY KEY (idProposta, nParcela),
    foreign key (idProposta) references proposta(id)
);


CREATE TABLE conversa (
    idConversa INTEGER auto_increment PRIMARY KEY,
    idProposta INTEGER,
    conversa text,
    dataConversa DATE,
    foreign key (idProposta) references proposta(id)
);
 

