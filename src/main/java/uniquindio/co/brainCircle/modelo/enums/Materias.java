package uniquindio.co.brainCircle.modelo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter

public enum Materias {
    MATEMATICAS("Matemáicas"), ESTRUCTURA("Estructura de Datosoooooo");
    private final String nombre;;

    Materias(String nombre, String descripcion) {
        this.nombre = nombre;
    }

}
