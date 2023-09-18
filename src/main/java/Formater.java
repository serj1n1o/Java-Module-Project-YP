public class Formater {
    public static String format(double number) {
        double roundNumber = Math.floor(number);
        String end = "";
        if ((int) roundNumber % 100 >= 11 && (int) roundNumber % 100 <= 19) {
            end = "лей";
        } else {
            switch ((int) roundNumber % 10) {
                case 1:
                    end = "ль";
                    break;
                case 2:
                case 3:
                case 4:
                    end = "ля";
                    break;
                default:
                    end = "лей";
                    break;
            }
        }

        return String.format("Каждый гость должен заплатить %.2f руб%s", number, end);
    }
}
