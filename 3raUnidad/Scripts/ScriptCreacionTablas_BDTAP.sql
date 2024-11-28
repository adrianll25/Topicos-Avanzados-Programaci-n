
create table Alumnos (
Matricula VARCHAR ( 10 ) primary key,
Nombre    VARCHAR ( 30 ) not null,
Apellidos VARCHAR ( 50 ) not null,
Edad      Integer,
Promedio  Real 
);

create table Materia (
IDMateria VARCHAR ( 10 ) primary key,
Materua   VARCHAR ( 50 ) not null,
creditos  INTEGER
);

create table Kardex(
IDCalif      INTEGER primary key,
Matricula    VARCHAR  ( 10 ),
ID_Materia    VARCHAR ( 10 ),
Periodo      VARCHAR  ( 5  ),
Calificacion Integer
);

alter table Kardex add constraint fk_matricula
foreign key ( Matricula ) references Alumnos ( Matricula );

alter table Kardex add constraint fk_idmateria
foreign key ( ID_Materia ) references Materia ( IDMateria );