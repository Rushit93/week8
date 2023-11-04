//Same as above program-8 using switch statement.

public class Q12 {

    public static void main(String[] args)
    {
        int City = 3;
        String CityString;

        switch (City) {

            // Case
            case 1:
                CityString = "Anand";
                break;

            // Case
            case 2:
                CityString = "Berlin";
                break;

            // Case
            case 3:
                CityString = "Charlotte";
                break;

            // Case
            case 4:
                CityString = "Denver";
                break;

            // Case
            case 5:
                CityString = "Edinburgh";
                break;

            // Case
            case 6:
                CityString = "Frankfurt";
                break;

            // Default case
            default:
                CityString = "Invalid City";
        }
        System.out.println(CityString);
    }
}

