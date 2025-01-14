package metodos.aula1;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        //Estado inicial do objeto smartTv:
        System.out.println("Estado: "+smartTv.estado);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        //testando mudar de estado
        smartTv.mudarEstado();//true
        System.out.println("Estado atual: "+smartTv.estado);

        //testando mudar de canal
        smartTv.mudarCanal(45);//canal 45
        smartTv.aumentarCanal();//canal 46
        smartTv.aumentarCanal();//canal 47
        smartTv.aumentarCanal();//canal 48
        smartTv.diminuirCanal();//canal 47
        System.out.println("Canal atual: "+smartTv.canal);
        
        //testando mudar de volume
        smartTv.aumentarVolume();//volume 26
        smartTv.aumentarVolume();//volume 27
        smartTv.aumentarVolume();//volume 28
        smartTv.aumentarVolume();//volume 29
        smartTv.diminuirVolume();//volume 28
        smartTv.diminuirVolume();//volume 27
        System.out.println("Volume atual: "+smartTv.volume);

    }
}
