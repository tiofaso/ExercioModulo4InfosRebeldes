-- Criando DB
CREATE  DATABASE infosrebeldes;

-- Criando tabelas
CREATE TABLE tb_rebeldes(id SERIAL PRIMARY KEY,
								nome varchar(255) NOT NULL,
								idade integer,
								genero varchar(15),
								localizacao varchar(100),
								status varchar(7));

CREATE TABLE tb_inventario(id SERIAL PRIMARY KEY,
								id_rebelde integer,
								FOREIGN KEY (id_rebelde) REFERENCES tb_rebeldes(id),
								conteudo text);

CREATE TABLE tb_ultimalocalizacao(id SERIAL PRIMARY KEY,
								id_rebelde integer,
								FOREIGN KEY (id_rebelde) REFERENCES tb_rebeldes(id),
								localizacao varchar(100),
								data date,
								hora time);

CREATE TABLE tb_traidor(id SERIAL PRIMARY KEY,
								id_delator integer,
								FOREIGN KEY (id_delator) REFERENCES tb_rebeldes(id),
								id_delatado integer,
								FOREIGN KEY (id_delatado) REFERENCES tb_rebeldes(id));

CREATE TABLE tb_compras(id SERIAL PRIMARY KEY,
								id_rebelde integer,
								FOREIGN KEY (id_rebelde) REFERENCES tb_rebeldes(id),
								item varchar(100),
								preco decimal(5,2),
								data date,
								hora time);

CREATE TABLE tb_relatorios(id SERIAL PRIMARY KEY,
								quantidadetraidores integer,
								quantidaderebeldes decimal(3,2),
								data date,
								hora time);
						