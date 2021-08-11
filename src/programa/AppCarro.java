package programa;

import classes.Carro;
import classes.Motorista;

public class AppCarro {
    public static void main(String[] args) {
        Carro car = new Carro("ABC1234", 123456);
        Motorista mot = new Motorista(car);
        mot.setNome("Cole Trickle");

        System.out.printf("Carro do motorista %s tem placa %s.\n", mot.getNome(), car.getPlaca());
        System.out.println("MOTORISTA, ACELERA O CARRO ATÉ 100 Km/h, POR FAVOR???");

        mot.pisaFundo(100);

        System.out.printf("Velocidade atual do carro é: %d\n", car.getVelocidadeAtual());
    }
}