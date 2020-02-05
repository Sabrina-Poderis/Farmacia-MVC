create database fairmacia;

use fairmacia;

create table tbClienteEspecial (
    cpf varchar(11) primary key,
    nome varchar(100),
    rg varchar(9),
    telefone varchar(11),
    dataNascimento date,
    email varchar(50)
);

create table tbMedicamentos (
    ium int primary key,
    nomeComercial varchar(50),
    laboratorio varchar(50),
    prescricao boolean,
    concentracao int,
    valorUnitario decimal(10,2),
    unidade varchar(30),
    validade date,
    invulucro varchar(30),
    principioAtivo varchar(30),
    descricao varchar(200)
);

create table tbEstoque (
    numLote int primary key,
    quantidade int,
    validade date,
    dataEntrada date
);

create table tbCaixa(
    idOperacoes int primary key,
    dataCaixa date,
    numeroCaixa int,
    status boolean,
    fundoCaixa decimal(10,2),
    valorCaixaFinal decimal(10,2)
);

create table tbVenda (
    idvenda int primary key,
    numLote int,
    nomeComercial varchar(50),
    qtdProdutos int,
    valor decimal(10,2),
    total decimal(10,2)
);

create table tbPagamento (
    registroVenda int primary key,
    cpf varchar(11),
    descontos decimal(10,2),
    formaPagamento varchar(30),
    valorTotal decimal(10,2),
    valorDescontos decimal(10,2),
    valorFinal decimal(10,2)
);

create table tbUsuario (
    nomeFuncionario varchar(100),
    nomeUsuario varchar(30),
    senha varchar(15),
    dataAdmissao date,
    salario decimal(10,2),
    qtdDescontos int, 
    qtdCaixasFechados int,
    qtdCaixarAbertos int
);