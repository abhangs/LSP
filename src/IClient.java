
public interface IClient {
    public int getConnectionID();
    public ClientRead read();
    public Error write(byte[] payload);
    public Error close();

}
