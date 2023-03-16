Create Table Aluno(
    id int not null auto_increment primary key,
    nomealuno varchar(100)
);

alter table Aluno add constraint FK_Aluno_Curso Foreign Key(idcurso)REFERENCES Curso(id);
alter table Aluno add constraint FK_Aluno_Cidade Foreign Key(idcidade)REFERENCES Cidade(id);
