package recuperacion;

public class EmpleadoTiempoCompleto extends Empleado {

	public EmpleadoTiempoCompleto(String nombre, double salarioBase, Boolean autonomo, float irpf) {
		super(nombre, salarioBase, autonomo, irpf);
	}

	public EmpleadoTiempoCompleto(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularSalarioNeto(double pagaExtra, int prorrateoPaga) {
		
		double salarioBruto = super.calcularSalarioBruto(pagaExtra, prorrateoPaga);
		double retencionIRPF = salarioBruto * (super.irpf / 100);
		
		return (salarioBruto - retencionIRPF);
	}

}
