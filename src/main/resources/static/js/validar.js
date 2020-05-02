function validando() {
	var docTecnico, tipodocTecnico, nombreTecnico, apellidoTecnico, ciudadCli, expresion;

	nombreTecnico = document.getElementById("nombreTecnico").value;
	apellidoTecnico = document.getElementById("apellidoTecnico").value;
	docTecnico = document.getElementById("docTecnico").value;
	

	expresion = /^[a-zA-Z ]*$/;

	if (nombreTecnico === "" || apellidoTecnico === "" || docTecnico === ""
			|| tipodocTecnico === "0" || ciudadCli === "0") {
		alert("Todos los campos son obligatorios.");
		return false;

	} else if (nombreTecnico.length > 30) {
		alert("El nombre es muy largo.");
		return false;

	} else if (nombreTecnico.length < 4) {
		alert("El nombre es muy corto.");
		return false;

	} else if (!expresion.test(nombreTecnico)) {
		alert("El nombre no contiene números.");
		return false;

	} else if (apellidoTecnico.length > 30) {
		alert("Los apellidos son muy largos.");
		return false;
	
	} else if (apellidoTecnico.length < 2) {
		alert("El(los) apellido(dos) es(son) muy corto(s).");
		return false;

	} else if (!expresion.test(apellidoTecnico)) {
		alert("El(los) apellido(s) no contiene(n) números.");
		return false;

	}  else if (docTecnico.length > 12 || docTecnico.length < 4) {
		alert("Digite su documento real.");
		return false;

	} else if (isNaN(docTecnico)) {
		alert("El documento son solo números.");
		return false;

	}

}
