package BancoCLiente;

public class ClienteExisteExcepcion extends Exception {
      ClienteBanco c;

    public ClienteExisteExcepcion(ClienteBanco c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "El cliente " + c + " ya esta repetido";
    }

}
