import java.util.Stack;

public class StackDS
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("GTA");
        stack.push("Fifa");

        System.out.println(stack.empty()); //checks if empty, returns boolean value

        System.out.println(stack);
        stack.pop();//returns obj and removes it from the stack
        System.out.println(stack);

        System.out.println(stack.peek()); //prints topmost element in stack

        System.out.println(stack.search("Minecraft")); //1st element position:1, 2nd: 2 and so on.... if not found, returns -1
    
        
        //uses of stack?
        //1.undo/redo features in text editors
        //2.moving back and forward in browser history
        //3.Backtracking algo
        //4.calling function(call stack)
    }
}