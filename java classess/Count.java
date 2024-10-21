public class Count
{
    public static void main(String[] args) {
        String statement = " today is java mock";
        int num =0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (Character.isLetter(ch)) {
                num++;
            }
        }

        System.out.println("count =" + num);
    }
}
