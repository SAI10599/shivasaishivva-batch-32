package Assignment_8;

    public class StringToInteger {
        public static int convertToInteger(String string) throws NumberFormatException {
            try {
                int result = Integer.parseInt(string);
                return result;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("cannot convert string to integer.");
            }
        }

        public static void main(String[] args) {
            String[] inputs = {"123", "456.78", "hello", "789"};

            for (String i : inputs) {
                try {
                    int convertedInteger = convertToInteger(i);
                    System.out.println(i + ", Converted : " + convertedInteger);
                } catch (NumberFormatException e) {
                    System.out.println(i + ", Exception: " + e.getMessage());
                }
            }
        }
    }

