package ar.edu.unju.edm;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
    	System.out.println("1- Año bisiesto ");
       	System.out.println("2- Meses ");
       	System.out.println("3- Numeros Primos ");
       	System.out.println("4- Pares e Impares ");
       	System.out.println("5- Empleados ");
    	 System.out.print("Ingrese num de ejercicios: ");
    	 Scanner sc = new Scanner(System.in);
    	 int numero = Integer.parseInt(sc.nextLine());
         String mes;
         switch(numero) {
             case 1: Punto1(); break;
             case 2: Punto2(); break;
             case 3: Punto3(); break;
             case 4: Punto4(); break;
             case 5: Punto5(); break;

             default: mes = "No existe ese ejercicio"; break;
         }
    }
  public static void Punto1() { Scanner scanner = new Scanner(System.in);
  System.out.print("Ingrese un año: ");
  if (scanner.hasNextInt()) {
      int year = scanner.nextInt();
      if (esBisiesto(year)) {
          System.out.println(year + " es un año bisiesto.");
      } else {
          System.out.println(year + " no es un año bisiesto.");
      }
  } else {
      System.out.println("El valor ingresado no es un número entero válido.");
  }}
  public static boolean esBisiesto(int year) {
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
          if (year % 100 == 0 && year % 400 != 0) {
              return false;
          } else {
              return true;
          }
      } else {
          return false;
      }
  }
  public static void Punto2() { Scanner scanner = new Scanner(System.in);
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingrese un número correspondiente a un mes del año: ");
  try {
      int numero = Integer.parseInt(sc.nextLine());
      String mes;
      switch(numero) {
          case 1: mes = "Enero"; break;
          case 2: mes = "Febrero"; break;
          case 3: mes = "Marzo"; break;
          case 4: mes = "Abril"; break;
          case 5: mes = "Mayo"; break;
          case 6: mes = "Junio"; break;
          case 7: mes = "Julio"; break;
          case 8: mes = "Agosto"; break;
          case 9: mes = "Septiembre"; break;
          case 10: mes = "Octubre"; break;
          case 11: mes = "Noviembre"; break;
          case 12: mes = "Diciembre"; break;
          default: mes = "No existe ese mes"; break;
      }
      System.out.println("El número " + numero + " corresponde al mes de " + mes);
  } catch (NumberFormatException e) {
      System.out.println("Error: El valor ingresado no es un número válido.");
  }
  
  }
  public static void Punto3() { Scanner scanner = new Scanner(System.in);
  int n=30;
  
  for(int i=n-1; i>1; i--){
      if (esPrimo(i)){
          System.out.println(i);
      }
      else
      System.out.print("");
  }}
  public static boolean esPrimo(int i)
	{
		// Verificamos si es multiplo de 2
      if(i==2) return true;

		else if(i % 2 == 0) return false;

		// Recorremos todos los numeros impares
		for(int j = 3; j*j <= i; j+=2){
			if(i % j == 0) return false;
		}

		return true;
	}
  public static void Punto4() { Scanner scanner = new Scanner(System.in);
  
  }
  public static void Punto5() { Scanner scanner = new Scanner(System.in);
  System.out.println();
	Empleado emp1 = new Empleado("",1,1);
  emp1.setNombre("Paredes");
  emp1.setFechaIngreso("9/12/2018");
  emp1.setLegajo(12345);
  emp1.setEmail("LeanWalls@gmail.com");
  emp1.setHorasTrabajadas(180);
  emp1.setSueldo(emp1.calcSueldo());
  emp1.mostrarDatos();
  
  System.out.println();
  Empleado emp2 = new Empleado("Roberto Galati", 67890, 100);
  emp2.setFechaIngreso("18/12/2022");
  emp2.setEmail("RoberG@gmail.com");
  emp2.setSueldo(emp2.calcSueldo());
  emp2.mostrarDatos();
  }
  public class Empleado {
		String nombre, email, fechaIngreso;
		int legajo, sueldo, horasTrabajadas;
		
		 public Empleado(String nombre, int legajo, int horasTrabajadas) {
		        this.nombre = nombre;
		        this.legajo = legajo;
		        this.horasTrabajadas = horasTrabajadas;
		 }
		 public void setNombre(String nombre) {
			 this.nombre = nombre;
		 }

		 public void setFechaIngreso(String fechaIngreso) {
			 this.fechaIngreso = fechaIngreso;
		 }

		 public void setLegajo(int legajo) {
			 this.legajo = legajo;
		 }

		 public void setEmail(String email) {
			 this.email = email;
		 }

		 public void setSueldo(int sueldo) {
			 this.sueldo = sueldo;
		 }

		 public void setHorasTrabajadas(int horasTrabajadas) {
			 this.horasTrabajadas = horasTrabajadas;
		 }
		
		 public int calcSueldo() {
			 int sueldoPorHora;
		     if (horasTrabajadas <= 160) {
		    	 sueldoPorHora = 4000;
		     } else {
		    	 sueldoPorHora = 5500;
		     }
		     return sueldoPorHora;
		 }
		
		 public void mostrarDatos() {
			 System.out.println("Nombre: "+nombre);
			 System.out.println("Fecha de Ingreso: "+fechaIngreso);
			 System.out.println("Legajo: "+legajo);
			 System.out.println("Email: "+email);
			 System.out.println("Sueldo: "+sueldo);
			 System.out.println("Horas: "+horasTrabajadas);
		 }
	}
}