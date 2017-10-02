package genericstack;
import java.util.Arrays;

/*
    An implementation of the GenericStack with composition instead of inheritance.
    Also uses an Array instead of a List. 
*/


public class GenericStack<E>{
    
    private static int capacity = 4;
    E[] list = (E[])new Object[capacity];
    
    public int getSize(){
        //Have to check the array for how many positions are occupied.
        int numItems = 0;
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] != null){
                numItems++;
            }
        }
        return numItems;
    }
    public void Push(E o){
        if(list.length - 1 == getSize()){
            capacity *= 2;
            E[] list2 = (E[])new Object[capacity];
            System.arraycopy(list, 0, list2, 0, list.length);
            list = list2;
        }
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] == null){
               list[i] = o; 
               break;
            }
        }
    }
    public E peek(){
        for(int i = 1; i < list.length - 1; i++){
            if(list[i] == null){
                return list[i - 1];
            }
        }
        return null;
    }
    public E pop(){
        //Gotta see if the list contains a value at the position.
        E o = list[getSize() - 1];
        list[getSize() - 1] = null;
        return o;
    }
    public boolean isEmpty(){
        if(list[0] == null){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return "stack: " + Arrays.toString(list);
    }
    
}