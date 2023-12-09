package org.example;

public class FuncInterApp {
   public double operar(double x, double y) {
      Operacion operacion = (double n1, double n2) -> n1 + n2;
      return operacion.calcularPromedio(x, y);
   }

   public static void main(String[] args) {
      FuncInterApp app = new FuncInterApp();
      System.out.println(app.operar(2, 5));
   }
}
