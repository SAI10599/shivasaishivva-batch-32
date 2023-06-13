package Assignment_8;

public class Main {
    public static void main(String[] args) {
        try {

            throw new CustomException("Custom exception occurred");
        }

        catch (CustomException e) {
            System.out.println("Custom exception caught:");
            System.out.println("Message: " + e.getMessage());

        }
    }
}