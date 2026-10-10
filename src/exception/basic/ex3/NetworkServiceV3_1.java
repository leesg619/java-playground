package exception.basic.ex3;

import exception.basic.ex3.exception.ConnectionExceptionV3;
import exception.basic.ex3.exception.NetworkClientExceptionV3;
import exception.basic.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data)   {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectionExceptionV3 e) {
                System.out.println("[연결 오류] 주소 : " + e.getAddress() + " , 메시지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 데이터 : " + e.getSendData() + " , 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
//