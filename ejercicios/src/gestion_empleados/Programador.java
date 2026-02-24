package gestion_empleados;

public class Programador extends Empleados {
    private String lenguajePrincipal;
    private int horasExtra;

    public Programador(String nombre, String apellidos, double salarioBase, String departamento, String lenguajePrincipal, int horasExtra) {
        // super() llama al constructor de Empleado para rellenar los datos básicos
        super(nombre, apellidos, salarioBase, departamento);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtra = horasExtra;
    }

    public String getLenguajePrincipal() { return lenguajePrincipal; }
    public void setLenguajePrincipal(String lenguajePrincipal) { this.lenguajePrincipal = lenguajePrincipal; }
    public int getHorasExtra() { return horasExtra; }
    public void setHorasExtra(int horasExtra) { this.horasExtra = horasExtra; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtra * 20.0);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puesto: Programador");
        System.out.println("Lenguaje: " + lenguajePrincipal);
        System.out.println("Horas Extra: " + horasExtra);
        System.out.println("Salario Final: " + calcularSalario() + "€");
        System.out.println("-------------------------");
    }
}