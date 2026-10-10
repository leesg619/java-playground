package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        // 연결 성공
        System.out.println("Connected to " + address);
        return "success";
    }

    public String send(String date) {
        System.out.println(address + " : " + date);
        return "success";
    }

    public void disconnect() {
        System.out.println("Disconnected from " + address);
    }
}
