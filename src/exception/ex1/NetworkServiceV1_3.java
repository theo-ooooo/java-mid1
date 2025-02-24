package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        NetworkClientV1 networkClientV1 = new NetworkClientV1("http://example.com");
        networkClientV1.initError(data);

        String connectResult = networkClientV1.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = networkClientV1.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        networkClientV1.disconnect();

    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
