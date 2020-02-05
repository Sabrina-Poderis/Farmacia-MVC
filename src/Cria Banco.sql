create database fairmacia;

use fairmacia;

create table filme (
	codFilme int primary key,
	titulo   varchar(100),
	alugado  tinyint,
	preco	 decimal(10,2),
	codProdutora int
);

create table produtora (
	codProdutora int primary key,
	descricao 	 varchar(60)
);
