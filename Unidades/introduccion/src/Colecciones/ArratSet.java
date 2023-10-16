package Colecciones;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;



public class ArratSet <T> implements SetADT <T>  {
    private static Random rand=new Random();
    private final int Default_CAPACITY=50;
    private final int NOT_FOUND=-1; //no se ha encontrado el elemento determinado

    private int count;
    private T[] contents;

    public ArratSet(){
        count=0;
        contents=(T[])(new Object[Default_CAPACITY]);
    }

    public ArratSet(int inicialCapacity){
        count=0;
        contents=(T[])(new Object[inicialCapacity]);
    }

    public void add (T element){
        if(!(containst(element))) {
            if(size()==contents.length){
                expandCapacity();
            }
            contents[count]=element;
            count++;
        }
    }

    private void expandCapacity(){
        T[] larger = (T[] Object[contents.length]*2]);
        for (int index=0;index<contents.length;index++){
            larger[index]=contents[index];
        }
        contents=larger;
    }
    public void addAll(SetADT<T> set){
        iterator<T> scan=set.iterator();
        while (scan.hasNext()){
            add(scan.next());
        }
    }

    public T removeRamdom(){
        int search = NOT_FOUND;
        if(isEmpty()){
            throw new =EmptyStackException();
        }
        for(int index=0; index<count && search==NOT_FOUND; index++){
            if(contents[index].equals(element)){
                search=index;
            }
        }
        if(search==NOT_FOUND){
            throw new NoSuchElementException();
        }
        T result= contents[search];
        contents[search]= contents[count-1];
        contents[count-1]= null;
        count--;
        return result;
    }
    /*public T remove (T element);
    public SetADT <T> union (SetADT <T> set);
    public boolean containst(T target);
    public boolean equals (SetADT <T> set);
    public boolean isEmpty();
    public int size();
    public Iterator <T> iterator();
    public String toString();*/
}
