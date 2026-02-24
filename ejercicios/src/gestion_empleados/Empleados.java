package gestion_empleados;

public class Empleados {
    private String nombre;
    private String apellidos;
    private double salarioBase;
    private String departamento;

    public Empleados(String nombre, String apellidos, double salarioBase, String departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public double getSalarioBase() { return salarioBase; }
    public String getDepartamento() { return departamento; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    // empleado normal simplemente cobra su salario base
    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario Base: " + salarioBase + "€");
    }
}
