public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);

            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary solution = new AddBinary();

        System.out.println("Ввод: a = \"11\", b = \"1\" -> Вывод: " + solution.addBinary("11", "1")); // "100"
        System.out.println("Ввод: a = \"1010\", b = \"1011\" -> Вывод: " + solution.addBinary("1010", "1011")); // "10101"
    }
}
