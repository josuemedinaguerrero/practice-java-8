package org.example;

public class Scopes {
   private static double atributo1;
   private double atributo2;

   public double probarLocalVariable() {
      final double n3 = 3;

      Operacion operacion = new Operacion() {
         @Override
         public double calcularPromedio(double n1, double n2) {
            atributo1 = 500;
            atributo2 += 1;
            return n1 + n2 + n3;
         }
      };

      System.out.println(atributo1);
      System.out.println(atributo2);

      return operacion.calcularPromedio(1, 2);
   }

   public static void main(String[] args) {
      Scopes scopes = new Scopes();
      System.out.println(scopes.probarLocalVariable());
      // System.out.println(Scopes.atributo1);
      System.out.println(scopes.probarLocalVariable());

      System.out.println("SEPARANDO ANDO");

      Scopes scopes1 = new Scopes();
      System.out.println(scopes1.probarLocalVariable());
      System.out.println(Scopes.atributo1);
      System.out.println(scopes1.probarLocalVariable());
   }
}
