public class condition_switch {
    public static void main(String[] args) {
        String girl ="Malini";

        switch (girl) {
            case "Binthu":
                System.out.println("Gift Teddy");
                break;

            case "Malini":
                System.out.println("Gift Flower");
                break;

            case "Shyni":
                System.out.println("Gift Choclate");
                break;

                case "Anyone":
                System.out.println("Gift Choclate");
                break;

            default:
            System.out.println("No Gift");
                break;
        }
    }
}
