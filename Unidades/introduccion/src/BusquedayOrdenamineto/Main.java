package BusquedayOrdenamineto;

public class Main {
    public static void main(String[] args) {
        //1. busqueda lineal 1,5,8,6,4,3,0,9;
        Integer[] numeros={2,5,8,6,4,3,0,9};
        SoutingandSearch<Integer> s= new SoutingandSearch<>();

        System.out.println(s.linealSearch(numeros, 0, 7, 0));

         String[] nombres ={"hugo", "paco", "leo", "maria", "luis"};
        SoutingandSearch<String> sn= new SoutingandSearch<>();

        System.out.println(sn.linealSearch(nombres, 0, 4, "mateo"));

        Integer[] numeros2={2,3,8,16,24,31,40,49,65,78,122};
        SoutingandSearch<Integer> s2 = new SoutingandSearch<>();
        System.out.println("busqueda binaria");
        System.out.println(s2.binarySearch(numeros2, 0, numeros2.length-1, 49));
    }
    
}
