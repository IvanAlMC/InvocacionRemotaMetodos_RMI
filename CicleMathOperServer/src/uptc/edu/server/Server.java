package uptc.edu.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import uptc.edu.impl.CircleMathImp;

public class Server {

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			CircleMathImp impl = new CircleMathImp();
			reg.rebind("CircleMathOper", impl);
			System.out.println("El servidor RMI esta activo bajo el puerto 1099");
		} catch (RemoteException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}

	}

}
