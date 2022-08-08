import java.rmi.*;
public interface Adder extends Remote {
    public int add(int x, int y) throws RemoteException;
}
//AdderRemore.java 
import java.rmi.*;
import java.rmi.server.*;
public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote() throws RemoteException {
        super();
    }
    public int add(int x, int y) {
        return x + y;
    }
}