import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        int index = findContact(contact);
        if(index>=0){
            return false;
        }
        else{
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact oldOne, Contact newOne){
        int index = myContacts.indexOf(oldOne);
        if(index <0){
            return false;
        }
        else{
            myContacts.set(index, newOne);
            return true;
        }
    }
    public boolean removeContact(Contact contact){
        int index = myContacts.indexOf(contact);
        if(index <0){
            return false;
        }
        else{
            myContacts.remove(index);
            return true;
        }
    }
    private int findContact(Contact contact){
        return findContact(contact.getName());
    }
    private int findContact(String contactName){
        int index = -1;
        for(int i =0; i < myContacts.size(); i++){
            if( myContacts.get(i).getName() == contactName ){
                index = i;
            }
        }
        return index;
    }
    public Contact queryContact(String name){
        for(int i =0; i < myContacts.size(); i++){
            if( myContacts.get(i).getName() == name ){
                return myContacts.get(i);
            }
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0; i < myContacts.size(); i++){
            System.out.println((i+1)+". " + myContacts.get(i).getName() +" -> " + myContacts.get(i).getPhoneNumber() );
        }
        
    }
    
    
}
