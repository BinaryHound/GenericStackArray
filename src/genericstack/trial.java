package genericstack;

/**
 *
 * @author lennardneuwirth
 */
public class trial {
    public static void main(String[] args){
        GenericStack<Integer> arrayNum = new GenericStack<>();
        arrayNum.Push(13);
        arrayNum.Push(14);
        arrayNum.Push(18);
        arrayNum.Push(20);
        arrayNum.Push(30);
        System.out.println(arrayNum.getSize());
        System.out.println(arrayNum.isEmpty());
        System.out.println(arrayNum.pop());
        System.out.println(arrayNum.peek());
    }

}
