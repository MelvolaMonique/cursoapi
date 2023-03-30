--Fazendo as chaves estrangeiras

alter table aluno add constraint FK_aluno_curso Foreign Key(idcurso) references curso(id);
alter table aluno add constraint FK_aluno_cidade Foreign Key(idcidade) references cidade(id);

--Colocando os valores de cada tabela

insert into curso(nomecurso) values ('Desenvolvimento de Sistemas');
insert into curso(nomecurso) values ('enfermagem');
insert into curso(nomecurso) values ('inglês');

insert into cidade(nomecidade, uf) values('Marília', 'SP');
insert into cidade(nomecidade, uf) values('Lencois Paulista', 'SP');
insert into cidade(nomecidade, uf) values('Macatuba', 'SP');
insert into cidade(nomecidade, uf) values('Itapuá', 'SP');
insert into cidade(nomecidade, uf) values('Bauru', 'SP');

insert into aluno(nomealuno, idcurso, idcidade) values ('João', 1,1);
insert into aluno(nomealuno, idcurso, idcidade) values ('Maria', 2,2);
insert into aluno(nomealuno, idcurso, idcidade) values ('Pedro', 1,3);
insert into aluno(nomealuno, idcurso, idcidade) values ('Matheus', 3,1);
insert into aluno(nomealuno, idcurso, idcidade) values ('Julia', 3,2);
