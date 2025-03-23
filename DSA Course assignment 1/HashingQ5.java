import java.util.*;
public class HashingQ5 {
    private LinkedList<Long>[] table;
    private int table_size=10;

    public HashingQ5()
    {
        table = new LinkedList[table_size];
        for(int i=0;i<table.length;i++)
        {
            table[i] = new LinkedList<>();
        }
    }

    public int hashFunction(long Isbn)
    {
        return (int)(Isbn%table_size);
    }

    public void insert(long Isbn)
    {
        int index = hashFunction(Isbn);
        if(!table[index].contains(Isbn))
        {
            table[index].add(Isbn);
        }
    }
    
    public boolean search(long Isbn)
    {
        int index = hashFunction(Isbn);
        return table[index].contains(Isbn);
    }

    public void display()
    {
        for(int i=0;i<table_size;i++)
        {
            System.out.println("Index "+i+" -> "+table[i]);
        }
    }

    public static void main(String[] args)
    {
        HashingQ5 library = new HashingQ5();
        library.insert(983274932874L);
        library.insert(983274932875L);
        library.insert(983274932876L);
        library.insert(983274932877L);
        library.insert(983274932878L);
        library.insert(928379382744L);

        library.display();

        System.out.println("Checking for ISBN 983274932877: "+ library.search(983274932877L));
        System.out.println("Checking for ISBN 928423842334: "+library.search(928423842334L));
    }

}
