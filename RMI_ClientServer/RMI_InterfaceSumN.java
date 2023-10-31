//package RMI_ClientServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_InterfaceSumN extends Remote{
    public double sumUptoN(double input) throws RemoteException;
}
