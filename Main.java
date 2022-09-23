public class Main{

    public static void main(String[] args){
        Persona persona1 = new Persona();

        persona1.setNombre("Marcos");
        String nombre = persona1.getNombre();
        System.out.println("El nombre de esta persona es " + nombre);

        persona1.setEdad(22);
        int edad = persona1.getEdad();
        System.out.println("La edad de "+ nombre + "es " + edad);

        persona1.setTelefono(1178993376);
        int telefono = persona1.getTelefono();
        System.out.println("El numero de telefono de " + nombre  +" es " + telefono);
    }
}
class Persona{
    private int edad, telefono;
    private String  nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
