//package RMI_ClientServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMI_ServerSumN extends UnicastRemoteObject implements RMI_InterfaceSumN {

    public RMI_ServerSumN() throws RemoteException {
        // Constructor
    }

    @Override
    public double sumUptoN(double n) throws RemoteException {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            RMI_ServerSumN server = new RMI_ServerSumN();
            System.out.println("RMI_ServerSumN is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
