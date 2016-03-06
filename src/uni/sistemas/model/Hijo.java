package uni.sistemas.model;

public class Hijo extends Padre {

    //constructor
    public Hijo() {
        super();
        System.out.println("Java es el lenguaje mas usado");
    }

    //metodo
    @Override
    public void Mensaje() {
        
        fecha = "06/03/2016";
        System.out.println("El Ide de Netbeans es Completo");
    }
}
