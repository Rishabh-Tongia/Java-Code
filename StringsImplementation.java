class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }
    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subChars = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerChars[i] = (char) (chars[i] + 32);
            } else {
                lowerChars[i] = chars[i];
            }
        }
        return new MyString1(lowerChars);
    }
    public boolean equals(MyString1 s) {
        if (this.chars.length != s.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != s.chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        boolean isNegative = i < 0;
        if (isNegative) {
            i = -i;
        }

        StringBuilder sb = new StringBuilder();
        do {
            sb.append((char) ('0' + (i % 10)));
            i /= 10;
        } while (i > 0);

        if (isNegative) {
            sb.append('-');
        }

        sb.reverse();
        char[] result = new char[sb.length()];
        for (int j = 0; j < sb.length(); j++) {
            result[j] = sb.charAt(j);
        }

        return new MyString1(result);
    }
    @Override
    public String toString() {
        return new String(chars);
    }
}
public class StringsImplementation {
    public static void main(String[] args) {
        MyString1 str = new MyString1(new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println("Original: " + str);
        System.out.println("CharAt(1): " + str.charAt(1));
        System.out.println("Length: " + str.length());
        System.out.println("Substring(1, 4): " + str.substring(1, 4));
        System.out.println("To Lowercase: " + str.toLowerCase());

        MyString1 another = new MyString1(new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println("Equals: " + str.equals(another));

        MyString1 intStr = MyString1.valueOf(-1234);
        System.out.println("ValueOf(-1234): " + intStr);
    }
}
