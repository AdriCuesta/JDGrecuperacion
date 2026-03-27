package recuperacion;

public class EmpleadoPorHoras extends EmpleadoTiempoCompleto {

	public EmpleadoPorHoras(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoPorHoras(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalarioNeto(double pagaExtra, int prorrateoPaga) {

		double salarioNeto;
		
		if (!autonomo) {
			
			salarioNeto = super.calcularSalarioNeto(pagaExtra, prorrateoPaga);
			
		} else {
			
			double salarioBruto = super.calcularSalarioBruto(pagaExtra, prorrateoPaga);
			double retencion = salarioBruto * (7 / 100);

			salarioNeto = salarioBruto - retencion;
		}

		return salarioNeto;
	}

}
