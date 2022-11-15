public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(35);
        Integer edad = persona.getEdad();

        persona.setNombre("Raul");
        String nombre = persona.getNombre();

        persona.setTelefono(115567896);
        Integer telefono = persona.getTelefono();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);
    }
}

class Persona {
    private Integer edad;
    public void setEdad(Integer edad){
        this.edad = edad;
    }public Integer getEdad() {
        return this.edad;
    }

    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }public String getNombre() {
        return nombre;
    }
    private Integer telefono;
    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }
    public Integer getTelefono() {
        return this.telefono;
    }
}