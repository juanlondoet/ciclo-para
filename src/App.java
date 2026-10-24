import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidad_xiaomi=0;
        int cantidad_iphone=0;
        int cantidad_samsung=0;
        
        Scanner sc = new Scanner(System.in);
        for (int index = 1; index <= 20; index++) {
            System.out.println("selecciona el producto que deseas comprar: 1) Xiaomi 18 Fold. 2) iPhone Duo. 3) Samsung Fold 8");
            System.out.println("ingresa la opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("gracias por comprar xiaomi");
                cantidad_xiaomi++;
            } else if (opcion == 2) {
                System.out.println("gracias por comprar iPhone");
                cantidad_iphone++;
            } else if (opcion == 3) {
                System.out.println("gracias por comprar Samsung");
                cantidad_samsung++;
            } else {
                System.out.println("no contamos con esa referencia");
            }
        }
        System.out.println("ventas de xiaomi 18 fold: " + cantidad_xiaomi);
        System.out.println("ventas de iPhone duo: " + cantidad_iphone);  
        System.out.println("ventas de Samsung fold 8: " + cantidad_samsung);

        sc.close();
    }
}
