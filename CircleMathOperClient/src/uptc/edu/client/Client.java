package uptc.edu.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.uptc.interfaz.CircleMathInterface;

public class Client {

	public static void main(String[] args) {
		double r, res;
		boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario
		String ip;
		int port;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite la ip del servidor");
		ip = in.nextLine();
		System.out.println("Digite el puerto RM(1099)");
		port = in.nextInt();
		while (!salir) {
            System.out.println("1. area de circulo por radio");
            System.out.println("2. longitud de circulo por radio");
            System.out.println("3. radio de circulo por perimetro");
            System.out.println("4. area de esfera por radio");
            System.out.println("5. volumne de esfera por radio");
            System.out.println("6. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = in.nextInt();
                switch (opcion) {
                    case 1:
                    	try {
                    		Registry reg;
                			reg = LocateRegistry.getRegistry(ip, port);
                			CircleMathInterface inter = (CircleMathInterface) reg.lookup("CircleMathOper");
	                        System.out.println("Has seleccionado la opcion 1");
	                        System.out.println("Digite el radio del circulo");
	                        r = in.nextDouble();
	            			res = inter.getAreaCircle(r);
	            			System.out.println("El area del circulo con radio " + r + ", es: " + res);
	            			System.out.println("------------------------------");
	            			System.out.println(" ");
                    	} catch (RemoteException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		} catch (NotBoundException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		}
                        break;
                    case 2:
                    	try {
                    		Registry reg;
                			reg = LocateRegistry.getRegistry(ip, port);
                			CircleMathInterface inter = (CircleMathInterface) reg.lookup("CircleMathOper");
	                        System.out.println("Has seleccionado la opcion 2");
	                        System.out.println("Digite el radio del circulo");
	                        r = in.nextDouble();
	                        res = inter.getLongCircle(r);
	            			System.out.println("La longitud de un circulo de radio "+ r +" es: " + res);
	            			System.out.println("------------------------------");
	            			System.out.println(" ");
                    	} catch (RemoteException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		} catch (NotBoundException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		}
                        break;
                    case 3:
                    	try {
                    		Registry reg;
                			reg = LocateRegistry.getRegistry(ip, port);
                			CircleMathInterface inter = (CircleMathInterface) reg.lookup("CircleMathOper");
	                        System.out.println("Has seleccionado la opcion 3");
	                        System.out.println("Digite el diametro del circulo");
	                        r = in.nextDouble();
	                        res = inter.getRadiusCircle(r);
	                        System.out.println("El radio de un circulo de diametro "+ r +" es: " + res);
	                        System.out.println("------------------------------");
	            			System.out.println(" ");
                    	} catch (RemoteException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		} catch (NotBoundException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		}
                        break;
                    case 4:
                    	try {
                    		Registry reg;
                			reg = LocateRegistry.getRegistry(ip, port);
                			CircleMathInterface inter = (CircleMathInterface) reg.lookup("CircleMathOper");
	                        System.out.println("Has seleccionado la opcion 4");
	                        System.out.println("Digite el radio de la esfera");
	                        r = in.nextDouble();
	                        res = inter.getAreaSphere(r);
	                        System.out.println("El area de una esfera de radio "+ r +" es: " + res);
	                        System.out.println("------------------------------");
	            			System.out.println(" ");
                    	} catch (RemoteException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		} catch (NotBoundException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		}
                        break;
                    case 5:
                    	try {
                    		Registry reg;
                			reg = LocateRegistry.getRegistry(ip, port);
                			CircleMathInterface inter = (CircleMathInterface) reg.lookup("CircleMathOper");
	                        System.out.println("Has seleccionado la opcion 5");
	                        System.out.println("Digite el radio de la esfera");
	                        r = in.nextDouble();
	                        res = inter.getVolumeSphere(r);
	                        System.out.println("El volumen de una esfera de radio "+ r +" es: " + res);
	                        System.out.println("------------------------------");
	            			System.out.println(" ");
                    	} catch (RemoteException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		} catch (NotBoundException e1) {
                			// TODO Auto-generated catch block
                			e1.printStackTrace();
                		}
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                	}
            	} catch (InputMismatchException e) {
            		System.out.println("Debes insertar un número");
            		in.next();
            	}
			}
	}
}
