import java.util.*;
public class HashTable {

    //Data structure that stores unique keys to values ex:<Integer, String>
    //Each key/value pair is known as an Entry
    //Fast Insertion, look up, deletion of key/value pairs
    //Not ideal for small data sets, great with large data sets;

    //Hashing: Takes a key and computes an integer. In hastable, we use the hash%capacity to calculate the index number
    //         key.hashCode()%capacity = index

    //Bucket: An indexed storage location for one or more entires. Can store multiple entires in case of a collision

    //Collision: hash function generates the same index for more than one key
    //           less collision = more efficiency

    //Time Complexity: Best case: O(1)
    //                 Worst case: O(n)
    public static void main(String[] args) {
        Hashtable <String,String> table = new Hashtable<>(10,0.5f); //load factor increases the capacity of the hastable once 50% is filled

        table.put("1","Nayan");
        table.put("2","Sevanthi");
        table.put("3","Jayanthi");
        table.put("4","Guna");

        // table.remove(1);

        for(String key: table.keySet())
        {
            System.out.println(key.hashCode()+"\t"+key+"\t"+table.get(key)); 
        }
    }
}
