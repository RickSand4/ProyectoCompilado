$(document).ready(function () {
    $('#tablaAspirantes').DataTable({
        ajax: {
            url: '/api/aspirantes',
            dataSrc: ''
        },
        columns: [
            { data: 'id' },
            { data: 'nombre' },
            { data: 'correo' },
            { data: 'carrera' },
            {
                data: null,
                render: function (data, type, row) {
                    return `
            <button class="btn btn-info btn-sm me-1" onclick="verDatos(${row.id})">Ver</button>
            <button class="btn btn-primary btn-sm me-1" onclick="enviarCorreo(${row.id})">Correo</button>
            <button class="btn btn-success btn-sm" onclick="generarPDF(${row.id})">PDF</button>
          `;
                }
            }
        ]
    });
});

function verDatos(id) {
    alert("Ver datos del aspirante ID: " + id);
}
function enviarCorreo(id) {
    alert("Enviar correo a aspirante ID: " + id);
}
function generarPDF(id) {
    alert("Generar PDF para aspirante ID: " + id);
}