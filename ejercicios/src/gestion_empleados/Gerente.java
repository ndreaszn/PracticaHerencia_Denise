package gestion_empleados;

public class Gerente extends Empleados {
    private double bonus;
    private int empleadosACargo;

    public Gerente(String nombre, String apellidos, double salarioBase, String departamento, double bonus, int empleadosACargo) {
        super(nombre, apellidos, salarioBase, departamento);
        this.bonus = bonus;
        this.empleadosACargo = empleadosACargo;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public int getEmpleadosACargo() { return empleadosACargo; }
    public void setEmpleadosACargo(int empleadosACargo) { this.empleadosACargo = empleadosACargo; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puesto: Gerente");
        System.out.println("Empleados a cargo: " + empleadosACargo);
        System.out.println("Bonus: " + bonus + "€");
        System.out.println("Salario Final: " + calcularSalario() + "€");
        System.out.println("-------------------------");
    }
}
