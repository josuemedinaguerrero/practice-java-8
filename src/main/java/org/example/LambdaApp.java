package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
   public void calcular() {
      // Operacion operacion = new Operacion() {
      //   @Override
      //   public double calcularPromedio(double n1, double n2) {
      //      return (n1 + n2) / 2;
      //   }
      //};

      Operacion operacion = (double x, double y) -> (x + y) / 2;
      System.out.println(operacion.calcularPromedio(2, 3));
   }

   public static void main(String[] args) {
      LambdaApp app = new LambdaApp();

      List<String> lista = new ArrayList<>();
      lista.add("Vanessa");
      lista.add("Josué");
      lista.add("Zambrano");
      lista.add("Medina");

      // Collections.sort(lista, String::compareTo);
      // Collections.sort(lista, (o1, o2) -> o1.compareTo(o2));
      Collections.sort(lista, new Comparator<String>() {
         @Override
         public int compare(String o1, String o2) {
            return o1.compareTo(o2);
         }
      });

      for (String elemento: lista) {
         System.out.println(elemento);
      }

      app.calcular();
   }
}
