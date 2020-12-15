create database bd_sisBike;
use bd_sisBike;
#drop database bd_sisBike;

create table Cliente(
	id_cli int not null primary key auto_increment,
    nome_cli varchar(100) not null,
    data_nasc_cli varchar(100) not null,
    email_cli varchar(100),
    cpf_cli varchar(14) not null,
    rg_cli varchar(30) not null,
    endereco_cli varchar(100) not null,
    sexo_cli varchar(10) not null
);

create table Usuario(
	id_user int not null primary key auto_increment,
    nome_user varchar(100) not null,
    senha_user varchar(100) not null,
    email_user varchar(100),
    cpf_user varchar(14) not null,
    tipo_user varchar(100) not null
);

create table Funcionario(
	id_fun int not null primary key auto_increment,
    nome_fun varchar(100) not null,
    email_fun varchar(100),
    cpf_fun varchar(14) not null,
    rg_fun varchar(30) not null,
    endereco_fun varchar(100) not null,
    cargo_fun varchar(100) not null,
    telefone_fun varchar(16) not null,
    descricao_fun varchar(200)
);

create table Fornecedor(
	id_forn int not null primary key auto_increment,
    nomeFantasia_forn varchar(100) not null,
    razaoSocial_forn varchar(100),
    cnpj_forn varchar(100) not null,
    cep_forn varchar(100) not null,
    pais_forn varchar(100) not null,
    estado_forn varchar(100) not null,
    cidade_forn varchar(100) not null,
    telefone_forn varchar(16) not null,
    endereco_forn varchar(100) not null,
    descricao_forn varchar(100)
);

create table Servico(
	id_serv int not null primary key auto_increment,
    nome_serv varchar(100) not null,
    tipo_serv varchar(100) not null,
    tempo_serv varchar(50) not null,
    valorMaoObra_serv float not null,
    valorTotal_serv float not null,
    descricao_serv varchar(100)
);

create table Funcionario_Servico (
	id_fun_serv int not null primary key auto_increment,
	fk_id_fun int not null,
	fk_id_serv int not null,

	foreign key (fk_id_fun) references Funcionario (id_fun),
	foreign key (fk_id_serv) references Servico (id_serv)
);

create table Produto(
	id_prod int not null primary key auto_increment,
    nome_prod varchar(100) not null,
    categoria_prod varchar(100) not null,
    marca_prod varchar(100) not null,
    fk_id_forn int,
    descricao_prod varchar(100) not null,
    QntdEstoque_prod int not null,
    precoVenda float not null,
    
    foreign key (fk_id_forn) references Fornecedor (id_forn)
);

create table Caixa(
	id_caixa int not null auto_increment primary key,
    data_caixa varchar(100) not null,
	saldoInicial_caixa float not null,
	totalRec_caixa float not null,
	totalPag_caixa float not null,
	saldoFinal_caixa float not null
);

create table Agenda(
	id_agen int not null primary key auto_increment,
    data_agen varchar(100) not null,
    horario_agen varchar(100) not null,
    fk_id_cli int not null,
    fk_id_serv int not null,
    
    foreign key (fk_id_cli) references Cliente (id_cli),
    foreign key (fk_id_serv) references Servico (id_serv)
);

create table Compra(
	id_comp int not null primary key auto_increment,
    data_comp varchar(100) not null,    
    formaPag_comp varchar(100) not null,
    precoVenda float not null
  );

create table Produto_Compra(
	id_prod_comp int not null primary key auto_increment,
    fk_id_comp int,
	fk_id_prod int not null,
	quant_compProd int,
	valor_compProd float not null,
	
    foreign key (fk_id_comp) references Compra (id_comp),
	foreign key (fk_id_prod) references Produto (id_prod)
);

create table Venda(
	id_vend int not null primary key auto_increment,
    hora_vend varchar(100) not null,
    data_vend varchar(100) not null,
    valor_vend float not null,
    formaPag_vend varchar(100) not null,
    fk_id_cli int not null,
	
    foreign key (fk_id_cli) references Cliente (id_cli)
);

create table Produto_Venda(
	id_prod_vend int not null primary key auto_increment,
    fk_id_vend int,
	fk_id_prod int not null,
	quant_vendProd int not null,
	valor_vendProd float not null,
	
    foreign key (fk_id_vend) references Venda (id_vend),
	foreign key (fk_id_prod) references Produto (id_prod)
);

create table Venda_Servico(
	id_vend_serv int primary key auto_increment not null,
	quant_vend_serv int,
	fk_id_serv int not null,
	fk_id_vend int,
    valor_vendServ float not null,
    
    foreign key (fk_id_vend) references Venda (id_vend),
	foreign key (fk_id_serv) references Servico (id_serv)
);

create table Despesa(
	id_desp int not null primary key auto_increment,
    valor_desp float not null,
    data_desp varchar(100) not null,
    descricao_desp varchar(100) not null,
    formaPag_desp varchar(100) not null
);

create table Recebimento(
	id_rec int not null primary key auto_increment,
    valor_rec double not null,
    parcela_rec int,
    formaPag_rec varchar(100),
    data_rec varchar(100) not null,
    fk_id_caixa int,
    fk_id_vend int,
    fk_id_cli int,
    
    foreign key (fk_id_caixa) references Caixa (id_caixa),
    foreign key (fk_id_vend) references Venda (id_vend),
    foreign key (fk_id_cli) references Cliente (id_cli)
);

create table Pagamento(
	id_pag int not null primary key auto_increment,
    valor_pag float not null,
    data_pag varchar(100) not null,
    parcela_pag int not null,
    formaPag_desp varchar(100) not null,
	
    fk_id_comp int not null,
	fk_id_caixa int not null,
	fk_id_desp int not null,
	foreign key (fk_id_comp) references Compra (id_comp),
	foreign key (fk_id_caixa) references Caixa (id_caixa),
	foreign key (fk_id_desp) references Despesa (id_desp)
);

create table Estoque(
	id_est int not null primary key auto_increment,
    qnt_est int not null,
    valorUni_est float not null,
    fk_id_prod int not null,
    
    foreign key (fk_id_prod) references Produto (id_prod)
);

DELIMITER $$
	CREATE TRIGGER addProdutoEstoque AFTER INSERT ON produto FOR EACH ROW
    BEGIN     
		INSERT INTO estoque VALUES (null, new.QntdEstoque_prod, new.precoVenda, new.id_prod);
    END;
$$ DELIMITER ;

DELIMITER $$
	CREATE TRIGGER attProdutoEstoque AFTER UPDATE ON produto FOR EACH ROW
    BEGIN     
		UPDATE estoque SET qnt_est = new.QntdEstoque_prod, valorUni_est = new.precoVenda WHERE new.id_prod = fk_id_prod;
    END;
$$ DELIMITER ;

DELIMITER $$
	CREATE TRIGGER aumentarEstoque AFTER INSERT ON Produto_Compra FOR EACH ROW
    BEGIN     
		UPDATE produto SET QntdEstoque_prod =  new.quant_compProd + QntdEstoque_prod  WHERE id_prod = new.fk_id_prod;	
    END;
$$ DELIMITER ;

DELIMITER $$
	CREATE TRIGGER diminuirEstoque AFTER INSERT ON produto_venda FOR EACH ROW
    BEGIN     
		UPDATE produto SET QntdEstoque_prod =  QntdEstoque_prod - new.quant_vendProd  WHERE id_prod = new.fk_id_prod;        
    END;
$$ DELIMITER ;

DELIMITER $$
	CREATE TRIGGER atualizarProdutoEstoque AFTER INSERT ON produto_compra FOR EACH ROW
    BEGIN     
		UPDATE estoque SET qnt_est =  new.quant_compProd + qnt_est  WHERE fk_id_prod = new.fk_id_prod;
    END;
$$ DELIMITER ;

DELIMITER $$
	CREATE TRIGGER diminuirProdutoEstoque AFTER INSERT ON produto_venda FOR EACH ROW
    BEGIN     
		UPDATE estoque SET qnt_est =  qnt_est - new.quant_vendProd  WHERE fk_id_prod = new.fk_id_prod;        
    END;
$$ DELIMITER 

#INSERTS serviço
insert into servico values (null,'Ajustar corrente', 'Manutenção', '00:30', 15, 25, 'Realização de Ajuste na Corrente');
insert into servico values (null,'Alinhamento de Roda', 'Manutenção', '01:15', 65, 100, 'Realização de Ajuste na Corrente');
insert into servico values (null,'Centragem', 'Manutenção', '00:45', 30, 50, 'Realização da Centragem da Roda');
insert into servico values (null,'Engraxar', 'Manutenção', '00:15', 10, 20, 'Engraxamento da Corrente');
insert into servico values (null,'Meia revisão', 'Revisão', '01:00', 80, 120, 'Realização da Meia Revisão');
insert into servico values (null,'Regulagem de Câmbio', 'Manutenção','00:40', 45, 70, 'Regulagem do Câmbio');
insert into servico values (null,'Revisão de Suspensão', 'Revisão', '00:30', 20, 45, 'Revisão da Suspensão');
insert into servico values (null,'Revisão completa', 'Revisão', '01:20', 80, 150, 'Revisão Completa');
insert into servico values (null,'Remendos', 'Manutenção' , '00:40', 45, 70, 'Remendo');
insert into servico values (null,'Regulagem de Freio', 'Manutenção', '00:40', 45, 70, 'Regulagem de Freio');


#INSERTS cliente
INSERT INTO cliente VALUES (null,'Oliver Matheus Iago Figueiredo','07/11/1981','oliver_jipa@gmail.com','307.829.397-16','149100','Avenida Brasil T-01','Masculino');
INSERT INTO cliente VALUES (null,'Sophie Olivia Raimunda','24/12/1941','sophie_jipa@gmail.com','967.735.922-32','149150','Avenida Brasil T-02','Feminino');
INSERT INTO cliente VALUES (null,'Luan Pietro Figueiredo','21/09/1972','luan_jipa@gmail.com','011.142.402-06','149200','Avenida Brasil T-03','Masculino');
INSERT INTO cliente VALUES (null,'Laura Heloise Teixeira','26/05/1962','laura_jipa@gmail.com','156.924.104-00','149250','Avenida Brasil T-04','Feminino');
INSERT INTO cliente VALUES (null,'Clara Alessandra Aline','10/08/1944','clara_jipa@gmail.com','387.330.623-90','149300','Avenida Brasil T-05','Feminino');
INSERT INTO cliente VALUES (null,'Gabriel Anthony Teixeira','25/02/1978','gabriel_jipa@gmail.com','778.916.611-54','149350','Avenida Brasil T-06','Masculino');
INSERT INTO cliente VALUES (null,'Mariane Vera Pereira','17/08/1976','mariane_jipa@gmail.com','996.723.781-30','149400','Avenida Brasil T-07','Feminino');
INSERT INTO cliente VALUES (null,'Paulo Kevin Manoel Pereira','11/06/1989','paulo_jipa@gmail.com','502.571.086-37','149450','Avenida Brasil T-08','Masculino');
INSERT INTO cliente VALUES (null,'Fernanda Luciana Amanda','19/07/1969','fernanda_jipa@gmail.com','992.595.348-01','149500','Avenida Brasil T-09','Feminino');
INSERT INTO cliente VALUES (null,'Louise Ester Vieira','09/11/1960','louise_jipa@gmail.com','095.179.447-72','149550','Avenida Brasil T-10','Feminino');


#INSERTS fornecedor
INSERT INTO fornecedor VALUES (null,'JR Comércio de Peças para Bicicletas', 'JR Comércio Ltda','31.946.795/0001-59','76908-150','Brasil','Rondônia','Ji-Paraná','(69) 93424-1111','Avenida Brasil, T-02','Fornecedor de Peças para Bikes');
INSERT INTO fornecedor VALUES (null,'Pimont - Indústria de Peças', 'Pimont M.E.I','06.571.282/0001-63','76908-200','Brasil','Rondônia','Ji-Paraná','(69) 93424-2222','Avenida Brasil, T-03','Fornecedor de Catracas para Bikes');
INSERT INTO fornecedor VALUES (null,'Alfa Meq Indústria', 'Alfa Ltda','94.938.974/0001-64','76908-250','Brasil','Rondônia','Ji-Paraná','(69) 93424-3333','Avenida Brasil, T-04','Fornecedor de Pedais para Bikes');
INSERT INTO fornecedor VALUES (null,'DNZ Metalúrgica', 'DNZ Met. M.E.I','79.546.211/0001-84','76908-300','Brasil','Rondônia','Ji-Paraná','(69) 93424-4444','Avenida Brasil, T-05','Fornecedor de Parafusos para Bikes');
INSERT INTO fornecedor VALUES (null,'Lojas Becker', 'Becker M.E.I','74.911.173/0001-06','76908-350','Brasil','Rondônia','Ji-Paraná','(69) 93424-5555','Avenida Brasil, T-06','Fornecedor de Cadeados para Bikes');
INSERT INTO fornecedor VALUES (null,'Huston - Indústria de Bicicletas', 'Indústria Huston Ltda','24.978.351/0001-30','76908-400','Brasil','Rondônia','Ji-Paraná','(69) 93424-6666','Avenida Brasil, T-07','Fornecedor de Assentos para Bikes');
INSERT INTO fornecedor VALUES (null,'Monark Bicicletas', 'Monark M.E.I','80.537.846/0001-02','76908-450','Brasil','Rondônia','Ji-Paraná','(69) 93424-7777','Avenida Brasil, T-08','Fornecedor de Câmaras de Ar para Bikes');
INSERT INTO fornecedor VALUES (null,'Athor Bicicletas','Athor Ltda','16.369.712/0001-12','76908-500','Brasil','Rondônia','Ji-Paraná','(69) 93424-8888','Avenida Brasil, T-09','Fornecedor de Aros para Bikes');
INSERT INTO fornecedor VALUES (null,'Gazul - Peças e Acessórios', 'Gazul M.E.I','88.631.440/0001-98','76908-550','Brasil','Rondônia','Ji-Paraná','(69) 93424-9999','Avenida Brasil, T-10','Fornecedor de Acessórios Personalizados para Bikes');
INSERT INTO fornecedor VALUES (null,'Yozda Cests Equipment', 'Yozda Ltda','25.640.145/0001-88','76908-600','Brasil','Rondônia','Ji-Paraná','(69) 93424-1010','Avenida Brasil, T-11','Fornecedor de Cestas para Bikes');


#INSERTS agenda
INSERT INTO agenda VALUES (null, '01/12/2020', '13:50', 1, 1);
INSERT INTO agenda VALUES (null, '02/12/2020', '07:10', 2, 2);
INSERT INTO agenda VALUES (null, '03/12/2020', '15:15', 3, 3);
INSERT INTO agenda VALUES (null, '04/12/2020', '06:50', 4, 4);
INSERT INTO agenda VALUES (null, '05/12/2020', '17:50', 5, 5);
INSERT INTO agenda VALUES (null, '06/12/2020', '08:20', 6, 6);
INSERT INTO agenda VALUES (null, '07/12/2020', '14:00', 7, 7);
INSERT INTO agenda VALUES (null, '08/12/2020', '09:10', 8, 8);
INSERT INTO agenda VALUES (null, '09/12/2020', '10:20', 9, 9);
INSERT INTO agenda VALUES (null, '10/12/2020', '16:45', 10, 10);


#INSERTS produto
INSERT INTO produto VALUES (null, 'Capacete Cyber One', 'Acessórios', 'CyberPunk', 1, 'Capacete Cyber One', 0, 136.45);
INSERT INTO produto VALUES (null, 'Capacete Cyber Two', 'Acessórios', 'CyberPunk', 1, 'Capacete Cyber Two', 0, 100.99);
INSERT INTO produto VALUES (null, 'Bicicleta Cairu Rog-Strix', 'Bicicletas', 'Cairu Bikes', 2, 'Bicicleta Cairu Rog-Strix', 0, 1249.50);
INSERT INTO produto VALUES (null, 'Bicicleta Cairu Tuf- Gaming', 'Bicicletas', 'Cairu Bikes', 2, 'Bicicleta Cairu Tuf- Gaming', 0, 1050.95);
INSERT INTO produto VALUES (null, 'Câmara 16', 'Câmaras diversas', 'Kenda', 3, 'Câmara tamanho 16', 0, 35.50);
INSERT INTO produto VALUES (null, 'Câmara 14', 'Câmaras diversas', 'Kenda', 3, 'Câmara tamanho 14', 0, 30);
INSERT INTO produto VALUES (null, 'Catraca tamanho 22', 'Catracas e correntes', 'KingSpec', 4, 'Catraca tamanho 22', 0, 60.49);
INSERT INTO produto VALUES (null, 'Corrente Bike Rog-Strix', 'Catracas e correntes', 'KingSpec', 4, 'Corrente p/ bike Rog-Strix', 0, 130.30);
INSERT INTO produto VALUES (null, 'Pneu aro 8', 'Pneus diversos', 'KingSton', 5, 'Pneu aro 8', 0, 25.49);
INSERT INTO produto VALUES (null, 'Pneu aro 6', 'Pneus diversos', 'KingSton', 5, 'Pneu aro 6', 0, 20.99);