
public class BuggyUtilClient {
    public static void main(String[] args) {
        // First test case in Main
        System.out.println("Example 1: Make My Username");
        System.out.println("In: first = " + "\"Sean\"" +
                ", last = " + "\"Flannery\""); //prints first and last name
        System.out.println("Out: " +
                StringUtils.makePurdueUsername("Sean", "Flannery")); //prints a string with first letter of first name as well as last name.
    }
}



