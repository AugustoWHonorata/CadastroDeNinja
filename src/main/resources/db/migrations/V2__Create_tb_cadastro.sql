-- V2: Criação da tabela tb_cadastro e relacionamento com tb_missoes

CREATE TABLE tb_cadastro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    img_url VARCHAR(255),
    rank VARCHAR(50),
    idade INT NOT NULL,
    missoes_id BIGINT,
    CONSTRAINT fk_missoes FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id) ON DELETE SET NULL
);
