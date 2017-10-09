import java.util.Scanner;

/* Class HashTableChainingSinglyLinkedListTest */
public class SLHTtest{
    
	/*------------MAIN--------------*/
	public static void main(String[] args){
        Scanner myscan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");
        
        /* Make object of HashTableChainingSinglyLinkedList */
        SLhashtable htcsll = new SLhashtable(myscan.nextInt() );
        char ch;
        
        /*  Perform HashTableChainingSinglyLinkedList operations  */
        do{
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. clear");
            System.out.println("4. size"); 
            System.out.println("5. check empty");
 
            int choice = myscan.nextInt();       
            
            switch (choice){
            case 1 : 
                System.out.println("Enter integer element to insert");
                htcsll.insert(myscan.nextInt() ); 
                break;                          
            case 2 :                 
                System.out.println("Enter integer element to delete");
                htcsll.remove(myscan.nextInt() ); 
                break;                        
            case 3 : 
                htcsll.makeEmpty();
                System.out.println("Hash Table Cleared\n");
                break;
            case 4 : 
                System.out.println("Size = "+ htcsll.getSize() );
                break; 
            case 5 : 
                System.out.println("Empty status = "+ htcsll.isEmpty() );
                break;        
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /* Display hash table */ 
            htcsll.printHashTable();  
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = myscan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
    }
}
