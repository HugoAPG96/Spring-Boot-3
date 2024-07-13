package med.volt.api.domain.medico;

import med.volt.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(
        Long id, String nombre, String email, String telefono, String documento,
        DatosDireccion direccion
) {
}
