SELECT * 
FROM Estudiantes
LEFT JOIN (
    SELECT activo AS materia_activa, nombre  AS nombre_materia
    FROM Materias
    GROUP BY activo
) AS Materias ON Estudiantes.activo = Materias.materia_activa;

