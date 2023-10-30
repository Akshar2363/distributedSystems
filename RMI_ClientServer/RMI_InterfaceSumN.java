//package RMI_ClientServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI_InterfaceSumN extends Remote {

    double sumUptoN(double n) throws RemoteException;

}
