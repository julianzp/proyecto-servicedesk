function validar() {
	var docCli, tipoDocCli, nombreCli, apellidoCli, ciudadCli, expresion;

	nombreCli = document.getElementById("nombreCli").value;
	apellidoCli = document.getElementById("apellidoCli").value;
	docCli = document.getElementById("docCli").value;
	tipoDocCli = document.getElementById("tipoDocCli").value;
	ciudadCli = document.getElementById("ciudadCli").value;

	expresion = /^[a-zA-Z ]*$/;

	if (nombreCli === "" || apellidoCli === "" || docCli === ""
			|| tipoDocCli === "0" || ciudadCli === "0") {
		alert("Todos los campos son obligatorios.");
		return false;

	} else if (nombreCli.length > 30) {
		alert("El nombre es muy largo.");
		return false;

	} else if (nombreCli.length < 4) {
		alert("El nombre es muy corto.");
		return false;

	} else if (!expresion.test(nombreCli)) {
		alert("El nombre no contiene números.");
		return false;

	} else if (apellidoCli.length > 30) {
		alert("Los apellidos son muy largos.");
		return false;
	
	} else if (apellidoCli.length < 2) {
		alert("El(los) apellido(dos) es(son) muy corto(s).");
		return false;

	} else if (!expresion.test(apellidoCli)) {
		alert("El(los) apellido(s) no contiene(n) números.");
		return false;

	}  else if (docCli.length > 12 || docCli.length < 4) {
		alert("Digite su documento real.");
		return false;

	} else if (isNaN(docCli)) {
		alert("El documento son solo números.");
		return false;

	}

}
