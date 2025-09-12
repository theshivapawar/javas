package oops.classes;

public class BrowserTest {
    public static void main(String[] args) {

        var browser = new Browser();
        browser.navigate("www.google.com");

        //String ip = browser.findIpAddress("www.facebook.com");
        //System.out.println(ip);
    }
}
