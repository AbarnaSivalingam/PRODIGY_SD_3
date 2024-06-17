import java.util.ArrayList;
import java.util.Scanner;
class Contact {
 private String name;
private String phoneNumber;
private String email;
public Contact(String name,String phoneNumber,String email){
 this.name=name;
 this.phoneNumber=phoneNumber;
 this.email=email;
}
public String getName() {
 return name;
}
public void setName(String name) {
 this.name=name;
}
public String getphoneNumber() {
 return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
 this.phoneNumber=phoneNumber;
}
public String getEmail() {
 return email;
}
public void setEmail(String email) {
 this.email=email;
}
public String toString() {
 return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email + "\n";
}
}
public class ContactManagementSystem {
 private static ArrayList<Contact> contacts=new ArrayList<>();
 private static Scanner scanner=new Scanner(System.in);
public static void main(String[] args) {
 while(true) {
 System.out.println("\nContact Management System");
System.out.println("1. Add a new Contact");
System.out.println("2. View contactlist");
System.out.println("3. Edit a contact");
System.out.println("4. Delete a contact");
System.out.println("5. Exit");
System.out.println("Enter your choice:");
int choice=scanner.nextInt();
scanner.nextLine();
switch(choice) {
 case 1:
 addContact();
 break;
case 2:
 viewContactList();
 break;
case 3:
 editContact();
 break;
case 4:
 deleteContact();
 break;
case 5:
 System.out.println("Exiting the program");
 scanner.close();
 System.exit(0);
default:
 System.out.println("Invalid choice.Please try again");
}
}
}
private static void addContact() {
 System.out.println("Enter name: ");
String name=scanner.nextLine();
System.out.println("Enter phone number");
String phoneNumber=scanner.nextLine();
System.out.println("Enter email address:");
String email=scanner.nextLine();
Contact contact=new Contact(name, phoneNumber, email);
contacts.add(contact);
System.out.println("Contact added successfully");
}
private static void viewContactList() {
 if (contacts.isEmpty()) {
 System.out.println("Contact list is empty.");
} else {
 System.out.println("\nContact List:");
 for (int i=0;i<contacts.size();i++) {
 System.out.println((i + 1)+ "." + contacts.get(i)); 
}
}
}
private static void editContact() {
 viewContactList();
if (contacts.isEmpty()) {
 return;
}
System.out.println("Enter the index of contact you want to edit: ");
int index=scanner.nextInt();
scanner.nextLine();
if (index < 1|| index > contacts.size()) {
 System.out.println("Invalid index.please try again");
} else {
 System.out.println("Editing contact at index" + index + ":");
Contact contact=contacts.get(index - 1);
System.out.println("Enter new name");
contact.setName(scanner.nextLine());
System.out.println("Enter new phone number:");
contact.setPhoneNumber(scanner.nextLine());
System.out.println("Enter new email address:");
contact.setEmail(scanner.nextLine());
System.out.println("Contact edited successfully.");
}
}
private static void deleteContact() {
 viewContactList();
if (contacts.isEmpty()) {
return;
}
System.out.println("Enter the index of contact you want to delete:");
int index=scanner.nextInt();
scanner.nextLine();
if(index < 1||index > contacts.size()) {
System.out.println("Invalid index.please try again.");
} else {
Contact contact=contacts.remove(index - 1);
System.out.println("Contact deleted successfully");
}
}
}

