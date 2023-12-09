package org.example;

public class DefaultMethods implements PersonaA {

   @Override
   public void caminar() {
      System.out.println("Hola Coders");
   }

   public static void main(String[] args) {
      DefaultMethods app = new DefaultMethods();
      app.caminar();
      app.hablar();
   }

}
