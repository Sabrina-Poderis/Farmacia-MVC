-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Dez-2018 às 05:51
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fairmacia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcaixa`
--

CREATE TABLE `tbcaixa` (
  `numCaixa` int(11) NOT NULL,
  `valorAtualCaixa` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcaixa`
--

INSERT INTO `tbcaixa` (`numCaixa`, `valorAtualCaixa`) VALUES
(1, '0.00'),
(2, '0.00'),
(3, '0.00'),
(4, '0.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbclienteespecial`
--

CREATE TABLE `tbclienteespecial` (
  `cpf` varchar(20) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `dataNascimento` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbclienteespecial`
--

INSERT INTO `tbclienteespecial` (`cpf`, `nome`, `rg`, `telefone`, `dataNascimento`, `email`) VALUES
('464.829.738-50', 'Matheus Guerra de Andrade', '40.434.317-X', '(11) 4962-6471', '27/03/1997', 'matheus@matheus.com'),
('384.829.738-55', 'Testonildo1', '40.464.389-5', '(11) 1555-4711', '05/05/1972', 'viotti@viotti.com'),
('111.111.111-11', 'testeeeeeee', '40.434.317-X', '(11) 4962-6471', '27/03/1997', 'matheus@matheus.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfuncionario`
--

CREATE TABLE `tbfuncionario` (
  `id` int(11) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbfuncionario`
--

INSERT INTO `tbfuncionario` (`id`, `usuario`, `senha`, `tipo`) VALUES
(1, 'admin', 'admin', 'Gerente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbgerenciamentocaixa`
--

CREATE TABLE `tbgerenciamentocaixa` (
  `idOperacoes` int(11) NOT NULL,
  `numCaixa` varchar(11) NOT NULL,
  `dataCaixa` varchar(30) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbgerenciamentocaixa`
--

INSERT INTO `tbgerenciamentocaixa` (`idOperacoes`, `numCaixa`, `dataCaixa`, `status`) VALUES
(20, '1', '00:10 06-12-2018', 'ABERTO'),
(21, '1', '00:11 06-12-2018', 'ABERTO'),
(22, '1', '00:11 06-12-2018', 'ABERTO'),
(23, '1', '00:11 06-12-2018', 'ABERTO'),
(24, '1', '00:11 06-12-2018', 'ABERTO'),
(25, '1', '00:11 06-12-2018', 'ABERTO'),
(26, '1', '00:11 06-12-2018', 'FECHADO'),
(27, '2', '00:16 06-12-2018', 'ABERTO'),
(28, '1', '00:16 06-12-2018', 'ABERTO'),
(29, '4', '00:16 06-12-2018', 'ABERTO'),
(30, '1', '00:16 06-12-2018', 'ABERTO'),
(31, '4', '00:16 06-12-2018', 'ABERTO'),
(32, '4', '00:17 06-12-2018', 'FECHADO'),
(33, '1', '00:19 06-12-2018', 'ABERTO'),
(34, '1', '00:19 06-12-2018', 'FECHADO'),
(35, '2', '00:19 06-12-2018', 'ABERTO'),
(36, '1', '00:19 06-12-2018', 'ABERTO'),
(37, '1', '00:19 06-12-2018', 'FECHADO'),
(38, '2', '00:19 06-12-2018', 'ABERTO'),
(39, '2', '00:20 06-12-2018', 'FECHADO'),
(40, '2', '00:21 06-12-2018', 'ABERTO'),
(41, '2', '00:21 06-12-2018', 'FECHADO'),
(42, '1', '00:21 06-12-2018', 'ABERTO'),
(43, '1', '00:21 06-12-2018', 'FECHADO'),
(44, '1', '01:11 06-12-2018', 'ABERTO'),
(45, '2', '01:13 06-12-2018', 'ABERTO'),
(46, '1', '01:13 06-12-2018', 'ABERTO'),
(47, '1', '01:13 06-12-2018', 'FECHADO'),
(48, '2', '01:13 06-12-2018', 'FECHADO'),
(49, '2', '01:20 06-12-2018', 'ABERTO'),
(50, '3', '01:20 06-12-2018', 'FECHADO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbmedicamentos`
--

CREATE TABLE `tbmedicamentos` (
  `ium` varchar(11) NOT NULL,
  `nomeComercial` varchar(50) DEFAULT NULL,
  `laboratorio` varchar(50) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `unidade` int(30) DEFAULT NULL,
  `descricao` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbmedicamentos`
--

INSERT INTO `tbmedicamentos` (`ium`, `nomeComercial`, `laboratorio`, `valor`, `unidade`, `descricao`) VALUES
('2', 'Tylenol', 'Tylenol Labs', '16.50', 60, 'Teste'),
('3', 'kkk boa', 'kkk', '16.50', 4, 'kkk'),
('4', 'KKKK TO TRISTE', 'ABC', '545.00', 5, 'aaaaaaaaaaaaaa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `nomeFuncionario` varchar(100) DEFAULT NULL,
  `nomeUsuario` varchar(30) DEFAULT NULL,
  `senha` varchar(15) DEFAULT NULL,
  `dataAdmissao` date DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `qtdDescontos` int(11) DEFAULT NULL,
  `qtdCaixasFechados` int(11) DEFAULT NULL,
  `qtdCaixarAbertos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvenda`
--

CREATE TABLE `tbvenda` (
  `idvenda` int(11) NOT NULL,
  `numLote` int(11) DEFAULT NULL,
  `nomeComercial` varchar(50) DEFAULT NULL,
  `qtdProdutos` int(11) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcaixa`
--
ALTER TABLE `tbcaixa`
  ADD PRIMARY KEY (`numCaixa`);

--
-- Indexes for table `tbfuncionario`
--
ALTER TABLE `tbfuncionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbgerenciamentocaixa`
--
ALTER TABLE `tbgerenciamentocaixa`
  ADD PRIMARY KEY (`idOperacoes`);

--
-- Indexes for table `tbmedicamentos`
--
ALTER TABLE `tbmedicamentos`
  ADD PRIMARY KEY (`ium`);

--
-- Indexes for table `tbvenda`
--
ALTER TABLE `tbvenda`
  ADD PRIMARY KEY (`idvenda`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbcaixa`
--
ALTER TABLE `tbcaixa`
  MODIFY `numCaixa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbfuncionario`
--
ALTER TABLE `tbfuncionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbgerenciamentocaixa`
--
ALTER TABLE `tbgerenciamentocaixa`
  MODIFY `idOperacoes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
