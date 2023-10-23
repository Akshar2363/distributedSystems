
//package RMI_ClientServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RMI_ServerFact extends UnicastRemoteObject implements RMI_InterfaceFact {
    public RMI_ServerFact() throws RemoteException {
        // Constructor
    }

    @Override
    public double computeFactorial(double input) throws RemoteException {
        if (input < 0) {
            throw new RemoteException("Factorial is defined only for non-negative numbers.");
        }

        BigDecimal result = BigDecimal.ONE;
        BigDecimal decimalInput = new BigDecimal(input);

        for (BigDecimal i = new BigDecimal("1"); i.compareTo(decimalInput) <= 0; i = i.add(BigDecimal.ONE)) {
            result = result.multiply(i);
        }

        return result.doubleValue();
    }

    public static void main(String[] args) {
        try {
            RMI_ServerFact server = new RMI_ServerFact();
            System.out.println("RMI_ServerFact is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
