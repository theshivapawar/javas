package fundamentals.types;

public class Strings {
    public static void main(String[] args) {

        //System.out.println("Hello, World!!");

        //String message = new String("Hello, World!!");
        String message = "Hello, World!!";

        System.out.println(message);
        System.out.println(message.length());

        System.out.println(message.startsWith("h"));
        System.out.println(message.endsWith("!"));
        System.out.println(message.contains("World"));
        System.out.println(message.indexOf('e'));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.lastIndexOf('o'));
        System.out.println(message.lastIndexOf("Wo"));
        System.out.println(message.charAt(7));

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.replace('!', '*'));
        System.out.println(message.replace("World", "Shivam"));

        System.out.println(message.substring(7));
        System.out.println(message.substring(0, 5));

        System.out.println(message.concat(" How are you!!"));
        message = "Hello, World!!" + " How are you!!";
        System.out.println(message);

        String userName = " \u2005theshivapawar \u2005";
        System.out.println(userName.trim());
        System.out.println(userName.strip());

        String name = "";
        System.out.println(name.isEmpty());

        name = " ";
        System.out.println(name.isBlank());

    }
}