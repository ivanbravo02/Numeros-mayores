public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Coin coin=new Coin();
        System.out.println(coin);

        //Variables primitivas
        int num1=5;
        int num2=12;
        
        num2=num1;
        num1=10;
        System.out.println(num1);
        System.out.println(num2);

        //variables primitivas
        int nu1=5;
        int nu2=12;

         nu2=nu1;
         nu1=10;
        System.out.println(nu1);
        System.out.println(nu2);
        
        nu2=nu1;
        nu1=10;
        System.out.println("Variables Primitivas");
        System.out.println("nu1"+nu1);
        System.out.println("nu2"+nu2);


        //variables de objeto
        numero n1=new numero();
        n1.numero=5;

        numero n2=new numero();
        n2.numero=12;
        
        System.out.println("Variables de objeto");
        System.out.println("n1="+ n1.numero);
        System.out.println("n2="+ n2.numero);

        n2=n1;
        n1.numero=10;

        //estatticas
        estaticas e2=new estaticas();
        e2.incrementarCount(5);
        e2.incrementarCount(10);
        System.out.println(estaticas.count2);

    }
}
