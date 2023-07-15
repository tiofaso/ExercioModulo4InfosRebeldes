INSERT INTO public.tb_compras (id_rebelde,arma,municao,agua,comida,"data",hora) VALUES
	 (5,1,25,10,8,'2023-07-15','16:19:05.857205');
INSERT INTO public.tb_inventario (id_rebelde,conteudo) VALUES
	 (3,'- Mochila
- Cantil de metal
- Monóculo
- Faca de aço comum
- Pistola laser
- Kit de primeiros socorros
- Foto de um animal
- Diário de papel
- Caneta antiga
- Coberta fina'),
	 (4,'- Mochila de acampar
- Binóculos
- Cantil de metal
- Máscara de gás
- Fuzil laser
- 12 barras de proteína
- Comunicador via satélite
- Mapa antigo
- Caixinha de música'),
	 (1,'- Bolsa de couro
- Binóculos
- Cantil de metal
- Bastão de madeira
- 7 facas pequenas de metal
- Óculos de lente vermelha
- Livro de orações'),
	 (2,'- Pochete
- Aparelho para respirar em qualquer ambiente
- Fones de ouvido arcaicos
- Tocador de músicas
- Pistola laser
- Óculos escuros
- Pente para cabelos
- Spray para boca
- Goma de mascar'),
	 (5,'- Cinto de utilidades
- Bastão de madeira');
INSERT INTO public.tb_rebeldes (nome,idade,genero,terranatal,status) VALUES
	 ('Kai Sei''Dov',76,'homem cis','Bruri','ativo'),
	 ('Lo Pers''Is',67,'fluído','Eshom','ativo'),
	 ('Reyyrua',212,'não se aplica','Kashyyyk','ativo'),
	 ('Gir Lya''Lya',123,'não-binário','Inessaa','inativo'),
	 ('Ierrax Hamne',35,'mulher cis','Dalo','inativo');
INSERT INTO public.tb_traidor (id_delator,id_traidor) VALUES
	 (1,4),
	 (3,4),
	 (2,2),
	 (4,1),
	 (5,4),
	 (5,1),
	 (3,2),
	 (2,4),
	 (5,4),
	 (5,4);
INSERT INTO public.tb_traidor (id_delator,id_traidor) VALUES
	 (5,1),
	 (5,1),
	 (5,1),
	 (5,4);
INSERT INTO public.tb_ultimalocalizacao (id_rebelde,localizacao,"data",hora) VALUES
	 (3,'Mundua','2023-07-15','11:44:18.01173'),
	 (1,'Collia','2023-07-15','11:45:00.396553'),
	 (3,'Dere','2023-07-15','11:45:16.916024');
