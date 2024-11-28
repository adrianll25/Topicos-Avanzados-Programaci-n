delete from Kardex;
delete from Alumnos;
delete from Materia;

insert into Alumnos values ( '18157823', 'Olivia', 'Olivares', 19, 78.25 );
insert into Alumnos values ( '18157483', 'Jesus',  'Lopez',    22, 88.22 );
insert into Alumnos values ( '18157413', 'Dante',  'Luevanos', 18, 72.10 );

insert into Materia values ( 'ED01',  'Estructura de Datos',               5 );
insert into Materia values ( 'TAP10', 'Topicos Avanzados de programación', 5 );
insert into Materia values ( 'TBD5',  'Taller de Base de datos',           5 );
insert into Materia values ( 'IDO2',  'Investgacion Operaciones',          4 );

insert into Kardex  values ( 1, '18157823', 'ED01',  '2020A', 91);
insert into Kardex  values ( 2, '18157823', 'TAP10', '2020A', 75);
insert into Kardex  values ( 3, '18157823', 'TBD5',  '2020A', 81);
insert into Kardex  values ( 4, '18157823', 'IDO2',  '2020A', 78);

insert into Kardex  values ( 5, '18157483', 'ED01',  '2020A', 78);
insert into Kardex  values ( 6, '18157483', 'TAP10', '2020A', 81);
insert into Kardex  values ( 7, '18157483', 'TBD5',  '2020A', 75);
insert into Kardex  values ( 8, '18157483', 'IDO2',  '2020A', 91);

insert into Kardex  values ( 9,  '18157413', 'ED01',   '2020A', 88);
insert into Kardex  values ( 10, '18157413', 'TAP10', '2020A',  86);
insert into Kardex  values ( 11, '18157413', 'TBD5',  '2020A',  94);
insert into Kardex  values ( 12, '18157413', 'IDO2',   '2020A', 73);
