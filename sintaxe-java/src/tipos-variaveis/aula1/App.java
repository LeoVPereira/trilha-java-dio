public class App {
    public static void main(String[] args) throws Exception {       
        // Abaixo um ex de uma conversão impossível de dado,
        // pois o tipo int exige mais meméria do que o tipo short 
        
        //short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;

        //Solução pare esse problema:

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.print(numeroCurto2);
    }
}
