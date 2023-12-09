package org.example;

import java.util.Arrays;

public class MyRefApp {

   public static void referenciarMetodoStatic() {
      System.out.println("Método Referido Static");
   }

   public void referenciarMetodoInstanciaObjectoArbitrario() {
      String[] nombres = {"Vanessa", "Josué", "Pepito"};

      // Arrays.sort(nombres, new Comparator<String>() {
      //    @Override
      //   public int compare(String o1, String o2) {
      //      return o1.compareToIgnoreCase(o2);
      //   }
      //});

      Arrays.sort(nombres, (String n1, String n2) -> n1.compareToIgnoreCase(n2));

      // Arrays.sort(nombres, String::compareToIgnoreCase);

      System.out.println(Arrays.toString(nombres));
   }

   public void referenciarMetodoInstanciaObjectoParticular() {
      System.out.println("Método referido instancia de clase");
   }

   public void referenciarConstructor() {
      /* IPersona iPersona = new IPersona() {
         @Override
         public Persona crear(int id, String nombre) {
            return new Persona(id, nombre);
         }
      }; */

      IPersona iPersona = (int id, String nombre) -> new Persona(id, nombre);
      Persona persona = iPersona.crear(50, "Vanessa");
      System.out.println(persona.getId() + " " + persona.getNombre());
   }

   public void operar() {
      // Saludar saludar = () -> MyRefApp.referenciarMetodoStatic();
      Saludar saludar = MyRefApp::referenciarMetodoStatic;
      saludar.saludar();
   }

   public static void main(String[] args) {
      MyRefApp app = new MyRefApp();
      app.operar();
      app.referenciarMetodoInstanciaObjectoArbitrario();

      Saludar op = app::referenciarMetodoInstanciaObjectoParticular;
      op.saludar();

      app.referenciarConstructor();
   }

}
