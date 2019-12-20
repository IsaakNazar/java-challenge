public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    private static ArrList groceryList = new ArrList();

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.addContact(new Contact("1313-133-43", "Leo"));
        mobilePhone.addContact(new Contact("5432-133-43", "Mona"));
        mobilePhone.addContact(new Contact("2311-435-43", "Lisa"));
        mobilePhone.addContact(new Contact("4321-004-43", "Barn"));
        mobilePhone.addContact(new Contact("1102-990-43", "Phil"));
        mobilePhone.printContacts();
        mobilePhone.addContact(new Contact("3421-435-43", "Lisa"));

//         mobilePhone.removeContact(1);
        mobilePhone.printContacts();
        mobilePhone.updateContact(new Contact("1313-133-43", "Leon"), 0);

    }
}
