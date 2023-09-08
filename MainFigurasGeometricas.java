import com.sun.source.doctree.ValueTree;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MainFigurasGeometricas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese tipo de figura geometrica a calcular (1/2/3/4): ");
        System.out.println("1. Circulo\n2. Rectangulo\n3. Cuadrado\n4. TrianguloRectangulo");
        int figura=entrada.nextInt();
        if(figura==1){
            System.out.println("Ingrese radio del circulo: ");
            int Radio=entrada.nextInt();
            Circulo figura1=new Circulo(Radio);
            System.out.println("El área del circulo es = " + figura1.calcularArea());
            System.out.println("El perímetro del circulo es = " + figura1.calcularPerimetro());
        }
        if(figura==2){
            System.out.println("Ingrese la base del Rectangulo: ");
            int Base=entrada.nextInt();
            System.out.println("Ingrese la altura del Rectangulo: ");
            int Altura=entrada.nextInt();
            Rectangulo figura2=new Rectangulo(Base, Altura);
            System.out.println("El área del rectangulo es = " + figura2.calcularArea());
            System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());

        }
        //System.out.println("");
        //Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);

        System.out.println();

        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
