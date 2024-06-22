package uptc.edu.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import edu.uptc.interfaz.CircleMathInterface;

public class CircleMathImp extends UnicastRemoteObject implements CircleMathInterface{

	private static final long serialVersionUID = 1L;
	
	public CircleMathImp() throws RemoteException {
		super();
	}

	@Override
	public double getAreaCircle(double radius) throws RemoteException {
		double a;
		a = Math.PI*(radius*radius);
		return a;
	}

	@Override
	public double getLongCircle(double radius) throws RemoteException {
		double l;
		l = 2*Math.PI*radius;
		return l;
	}

	public double getRadiusCircle(double diameter) throws RemoteException{
		double r;
		r = diameter/2;
		return r;
	}
	
	public double getAreaSphere(double radius) throws RemoteException{
		double as;
		as = 4*Math.PI*(radius*radius);
		return as;
	}
	
	public double getVolumeSphere(double radius) throws RemoteException{
		double vs;
		vs = 1.33333333333*Math.PI*(radius*radius*radius);
		return vs;
	}
}
