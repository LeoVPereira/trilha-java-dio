package metodos.aula1;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.estado);
        smartTv.mudarEstado();
        System.out.println(smartTv.estado);
    }
}
