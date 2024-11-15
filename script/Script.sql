INSERT into Estudiantes (idEstudiante, identificacion, nombres, apellidos, edad, email, activo) values(150 ,1025652339, "johan elias", "lozano ibarguen", 10, "piojo@gmail.com", "S");
insert into Materias (idMateria, nombre, descripcion, activo) values(777, "teologia", "baphomet", "S");
insert into MateriasEstudiantes  (idEstudiante, idMateria, nota) values (4, 777, 2.9);


UPDATE Estudiantes set apellidos = "Lozano" WHERE idEstudiante = 6;
delete from Estudiantes where idEstudiante =3;
delete from Materias where idMateria = 15;
SELECT * from Estudiantes where apellidos =NULL;
SELECT * from Estudiantes where identificacion = 1025652333;
SELECT * from Estudiantes order by nombres ;
SELECT * from Materias order by nombre ;
select * FROM Estudiantes where activo = "S";

select * FROM Estudiantes  where nombres = "juan";

UPDATE Estudiantes set email = "kipus@hotmail.com" where nombres like "jo_%n" ;

delete from Materias where activo = "S";









