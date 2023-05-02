package Task002;

public class Task002 {
    /**
     * Дана строка строки, содержащая только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.
     * Входная строка допустима, если:
     * Открытые скобки должны быть закрыты скобками того же типа.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
     * Input: s = "()"
     * Output: true
     * Input: s = "()[]{}"
     * Output: true
     * Input: s = "(]"
     * Output: false
     */
    public static void main(String[] args) {
        String str = ("()");
        String[] valArr = str.split("");
        System.out.println("isValid(valArr) = " + isValid(valArr));
    }

    public static boolean isValid(String[] s) {
        Boolean a = false;
        if (s.length % 2 != 0) return false;
        for (int i = 0; i < s.length - 1; i += 2) {
            if (s[i].contains("}") || s[i].contains("]") || s[i].contains(")")) {
                return false;
            }
            if (s[i].contains("(")) {
                if (s[i + 1].contains(")")) {
                } else return false;
            }
            if (s[i].contains("{")) {
                if (s[i + 1].contains("}")) {
                } else return false;
            }
            if (s[i].contains("[")) {
                if (s[i + 1].contains("]")) {
                } else return false;
            }
        }
        return true;
    }

}
