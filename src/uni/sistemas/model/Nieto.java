package uni.sistemas.model;

public class Nieto extends Hijo {

    // Constructor
    public Nieto() {
        System.out.println("Android es un SO para moviles");
    }

    // metodo
    @Override
    public void Mensaje() {
        fecha = "01/03/2016";
        System.out.println("Android studio es un IDE para desarrolar aplicaciones para movil");
    }

}
