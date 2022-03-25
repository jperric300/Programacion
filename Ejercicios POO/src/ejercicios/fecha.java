package ejercicios;

public class fecha {

	private int dia;
	private int mes;
	private int año;

	public fecha() {
		super();
	}

	public fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// METODO FECHACORRECTA

	private boolean fechaCorrecta() {
		boolean diaCorrecto = false;
		boolean mesCorrecto = false;
		boolean añoCorrecto = false;

		if (mes >= 1 && mes <= 12) {
			mesCorrecto = true;
		}

		if (año > 0) {
			añoCorrecto = true;
		}

		if (mes == 2) {

			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}

			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10
					|| mes == 12 && dia > 0 && dia < 32) {
				diaCorrecto = dia >= 1 && dia <= 31;
				;
			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia < 31) {
				diaCorrecto = dia >= 1 && dia <= 30;
				;
			}

		}

		if (mesCorrecto && añoCorrecto && diaCorrecto) {
			return true;
		} else {
			return false;
		}
	}

	// METODO ESBISIESTO
	private boolean esBisiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	// METODO DIASIGUIENTE

	public void diaSiguiente() {

		dia++;

		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
			dia = 1;
			mes++;

		}

		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 32) {

			dia = 1;
			mes++;
		}

		if ((mes == 12) && dia == 32) {
			dia = 1;
			mes = 1;
			año++;
		}

		if (esBisiesto() && dia == 30) {
			dia = 1;
			mes++;
		}

		if (!esBisiesto() && dia == 29) {
			dia = 1;
			mes++;
		}

	}

	@Override
	public String toString() {
		
	if(dia<10 ||mes<10) {
		return "fecha: 0" + dia + " - 0" + mes + " - " + año;
		
	}else

	{
		return "fecha: " + dia + " - " + mes + " - " + año;
	}

}}
