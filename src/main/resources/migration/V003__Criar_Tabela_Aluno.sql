Create Table aluno(
    id bigint not null primary key auto_increment,
    nomealuno varchar(100),
    idcurso int not null,
    idcidade int not null
);



alter table Aluno add constraint FK_Aluno_Curso Foreign Key(idcurso) references Curso(id);
alter table Aluno add constraint FK_Aluno_Cidade Foreign Key(idcidade) references Cidade(id);
