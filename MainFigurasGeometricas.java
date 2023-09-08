//Main-PruebaFiguras
import java.util.Scanner;
public class MainFigurasGeometricas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese tipo de figura geometrica a calcular (1/2/3/4): ");
        System.out.println("1. Circulo\n2. Rectangulo\n3. Cuadrado\n4. TrianguloRectangulo");
        int figura;
        while(true){ //ciclo para ingreso correcto de figura
            figura=entrada.nextInt();
            if(figura==1 || figura==2 || figura==3 || figura==4){
                break;
            }
            else{
                System.out.println("Numero incorrecto, intentelo de nuevo.");
                System.out.println("Ingrese tipo de figura geometrica a calcular (1/2/3/4): ");
                System.out.println("1. Circulo\n2. Rectangulo\n3. Cuadrado\n4. TrianguloRectangulo");
            }
        }
        if(figura==1){
            System.out.println("Ingrese radio del circulo: ");
            int Radio=entrada.nextInt();
            Circulo figura1=new Circulo(Radio);
            System.out.println("El area del circulo es = " + figura1.calcularArea());
            System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        }
        else if(figura==2){
            System.out.println("Ingrese la base del Rectangulo: ");
            int Base=entrada.nextInt();
            System.out.println("Ingrese la altura del Rectangulo: ");
            int Altura=entrada.nextInt();
            Rectangulo figura2=new Rectangulo(Base, Altura);
            System.out.println("El area del rectangulo es = " + figura2.calcularArea());
            System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());

        }
        else if(figura==3){
            System.out.println("Ingrese el lado del cuadraddo: ");
            int Lado=entrada.nextInt();
            Cuadrado figura3=new Cuadrado(Lado);
            System.out.println("El area del cuadrado es = " + figura3.calcularArea());
            System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        }
        else{
            System.out.println("Ingrese la Base del Triangulo Rectangulo: ");
            int Base=entrada.nextInt();
            System.out.println("Ingrese la Altura del Triangulo Rectangulo: ");
            int Altura=entrada.nextInt();
            TrianguloRectangulo figura4=new TrianguloRectangulo(Base, Altura);
            System.out.println("El qrea del triangulo es = " + figura4.calcularArea());
            System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
            figura4.determinarTipoTriangulo();
        }
    }
}
