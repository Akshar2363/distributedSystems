
//package RMI_ClientServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RMI_ServerFact extends UnicastRemoteObject implements RMI_InterfaceFact{
    public RMI_ServerFact() throws RemoteException{
        super();
    }

    @Override
    public double computeFactorial(double input) throws RemoteException {
        if (input < 0) {
            throw new RemoteException("Factorial is defined only for non-negative numbers.");
        }
        return fact;
    }
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.createRegistry(7777);
            registry.bind("fact", new RMI_ServerFact());
            System.out.println("The RMI Factorial App is running and ready...");
        } catch (Exception e) {
            System.out.println("Error: The RMI Factorial App is not running...");
        }
    }
}
