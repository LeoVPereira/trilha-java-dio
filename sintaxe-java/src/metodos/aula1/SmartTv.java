package metodos.aula1;

public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 25;

    public void mudarEstado(){
        if(estado){
            estado = !estado;            
        }
        if(!estado){
            estado = !estado;
        }
     
    }

    public void aumentarCanal(){    
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
