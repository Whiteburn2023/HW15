import java.util.Scanner;

public class Main {
    //private static final char[] alphabet = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};
    private static final String alpha = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.

        while(true) {
            System.out.println("Введите ФИО одной строкой:");
            String input = new Scanner(System.in).nextLine().trim();
            familia(input);
        }
    }

// нужно сделать валидацию
    static void familia(String input) {
        boolean isValid = true;
        int space = 0;


        for (int i = 0; i < input.length(); i++) {
            if (alpha.contains(String.valueOf(input.charAt(i)))) {
                if (input.charAt(i) == ' ') {
                    space++;
                }
                continue;
            } else {
                System.out.println("Введенная строка не является ФИО");
                isValid = false;
                break;
            }
        }
        if (isValid && space == 2) {
            System.out.println("Фамилия " + input.substring(0, input.indexOf(' ')).trim());
            System.out.println("Имя " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());
            System.out.println("Отчество " + input.substring(input.lastIndexOf(' ')).trim());
        }

    }
}