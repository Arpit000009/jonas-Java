package module3.class_23_10_2025;

import java.util.ArrayList;
import java.util.Scanner;

public class bookInventoryMenu {
    public static void main(String[] args) {
        ArrayList <book> inventory = new ArrayList<book>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n=== Book Store Inventory management===");
            System.out.println("1.add book");
            System.out.println("2.remove book by id");
            System.out.println("3.seaech book by title");
            System.out.println("4.display all books");
            System.out.println("5.exit");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("enter book id:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter title");
                String title = sc.nextLine();
                System.out.println("enter author");
                String author = sc.nextLine();
                System.out.println("enter price");
                    book newBook = new book(id, title, author, choice);

                inventory.add(newBook);
                System.out.println("book added sucessfully");
                break;
                case 2:
                System.out.println("enter book id to remove:");
                int removeId = sc.nextInt();
                boolean removed = false;
                for(book b:inventory){
                    if(b.getId() == removeId){
                        inventory.remove(b);
                        removed = true;
                        System.out.println("book removed");
                        break;
                    }
                }
                if(!removed){
                    System.out.println("book with Id" + removeId + "not found");
                }
                break;
                case 3:
                System.out.println("enter title to search");
                String searchTitle = sc.nextLine();
                boolean found = false;
                for(book b: inventory){
                    if(b.getTitle().equalsIgnoreCase(searchTitle)){
                        System.out.println("book found:\n"+b);
                    }
                }
                if(!found){
                    System.out.println("no break found with title"+ searchTitle);
                }
                break;
                case 4:
                System.out.println("/n All books in inventory: ");
                if(inventory.isEmpty()){
                    System.out.println("no books accessible");
                }
                else{
                    for(book b : inventory){
                        System.out.println(b);
                    }
                }
                break;
                default:
                System.out.println();
            }
        } while(choice!=5);
        sc.close();
    }
}
