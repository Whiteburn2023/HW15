import java.util.Scanner;

public class Main {
    private static char[] alphabet = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я','А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};


    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.

        while(true) {
            System.out.println("Введите ФИО одной строкой:");
            String input = new Scanner(System.in).nextLine();
            familia(input);
        }
    }


    static void familia(String input) {
        boolean flag = false;
        int indexFamilia = 0;
        String familia = "";
        int indexFirstSpaceAfterFamilia = 0;
        int indexFirstSpaceAfterName = 0;
        String name = "";
        String otchestvo = "";
        for (int i = 0; i < input.length(); i ++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (input.charAt(i) == alphabet[j]) {
                    flag = true;
                    indexFamilia = i;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {

            familia = input.substring(indexFamilia, input.indexOf(' '));
            indexFirstSpaceAfterFamilia = input.indexOf(' ');

            name = input.substring(indexFirstSpaceAfterFamilia, input.lastIndexOf(' ')).trim();
            indexFirstSpaceAfterName = input.lastIndexOf(' ');

            otchestvo = input.substring(indexFirstSpaceAfterName);

            System.out.println("Фамилия: " + familia);
            System.out.println("Имя: " + name);
            System.out.println("Отчество: " + otchestvo);

            //System.out.println("indexFamilia: " + indexFamilia);
            //System.out.println("indexFirstSpaceAfterFamilia: " + indexFirstSpaceAfterFamilia);
            //System.out.println("indexFirstSpaceAfterName: " + indexFirstSpaceAfterName);
        } else {
            System.out.println("Строка не соответствует формату, либо введенная строка не является ФИО");

        }
    }


}