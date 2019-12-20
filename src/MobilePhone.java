import java.util.ArrayList;

public class MobilePhone {

    private static ArrayList<Contact> list = new ArrayList<>();

    public void printContacts() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". "+ list.get(i).getName());
        }
        System.out.println();
    }

    public void addContact(Contact contact) {
        if (contactExist(contact.getName())) {
            System.out.println("You tried to add a user with name '" + contact.getName() + "' that already exists");
        } else {
            list.add(contact);
        }

    }

    public void removeContact(int position) {
        System.out.println(list.get(position).getName() + " has been removed");
        list.remove(position);

    }

    public void updateContact(Contact contact, int position) {
//        if (contactExist(contact.getName())) {
//            System.out.println("You trying to update a user name '" + contact.getName() + "' that already exists");
//        } else {
//            for (int i = 0; i < list.size(); i++) {
//                if (contact.getName().equals(list.get(i).getName())) {
//                    list.set(i, contact);
//                }
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if (contactExist(contact.getName()) && position != contact.getName().indexOf(position)) {
                System.out.println("You trying to update a user name '" + contact.getName() + "' that already exists");
            } else {
                list.set(position, contact);
            }
        }
    }

    public boolean contactExist(String name) {
      for (Contact contact : list) {
          if (contact.getName().equals(name)) {
              return true;
          }
      }
      return false;
    }

}
