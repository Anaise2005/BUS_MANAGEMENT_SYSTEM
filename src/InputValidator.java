public class InputValidator {
    public static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}");
    }

    public static int getValidInt(java.util.Scanner sc, String prompt) {
        int val;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                val = sc.nextInt();
                if (val > 0) break;
            }
            System.out.println("Error: Please enter a positive number.");
            sc.nextLine(); // Clear buffer
        }
        return val;
    }
}
