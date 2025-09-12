package oops.classes;

public class Browser {

    public void navigate(String address) {
        //String ip = findIpAddress(address, true);
        String ip = findIpAddress(address);
        String htmlResponse = sendHttpRequest(ip);
        render(htmlResponse);
    }

    /*
    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
    */

    /*
    public String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
    */

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private void render(String htmlResponse) {
        System.out.println(htmlResponse);
    }

}