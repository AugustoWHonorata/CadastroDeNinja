-- V1: Criação da tabela tb_missoes

CREATE TABLE tb_missoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    dificuldade VARCHAR(50) NOT NULL
);
