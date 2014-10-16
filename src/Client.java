import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client implements IClient {

    static String _serverAddress;
    static int _serverPort;
    static Parameters _clientParameters;
    private int clientID;

    public Client(String serverAddress, int serverPort)
    {
        _serverAddress = serverAddress;
        _serverPort = serverPort;
        _clientParameters = Parameters.GetParameters();

    }

    @Override
    public int getConnectionID() {


        return 0;
    }

    @Override
    public ClientRead read() {
        return null;
    }

    @Override
    public Error write(byte[] payload) {
        return null;
    }

    @Override
    public Error close() {
        return null;
    }

    public static boolean sendDataGram(byte[] data, int dataLength)
    {
        try
        {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName(_serverAddress);
            int serverPort = _serverPort;
            DatagramPacket packet = new DatagramPacket(data,dataLength,serverAddress,serverPort);
            socket.send(packet);
            return true;
        }
        catch (IOException ex)
        {
            return false;
        }
    }

    public static byte[] readDataGram()
    {
       throw new NotImplementedException();
    }



}
