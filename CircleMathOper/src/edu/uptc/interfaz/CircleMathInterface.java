package edu.uptc.interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CircleMathInterface extends Remote	{

	public double getAreaCircle(double radius) throws RemoteException;
	
	public double getLongCircle(double radius) throws RemoteException;
	
	public double getRadiusCircle(double diameter) throws RemoteException;
	
	public double getAreaSphere(double radius) throws RemoteException;
	
	public double getVolumeSphere(double radius) throws RemoteException;
}
