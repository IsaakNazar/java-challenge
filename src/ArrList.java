import java.util.ArrayList;

public class ArrList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item "+ position+" has been modified");
        printGroceryList();
    }

    public void removeItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item " + position + " has been removed");
        printGroceryList();
    }

    public String findItem(String item) {
        int position = groceryList.indexOf(item);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
