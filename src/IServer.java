
public interface IServer {
    public ServerRead read();
    public Error write(int connectionID, byte[] payload);
    public Error closeConnection(int connectionID);
    public Error close();
}
