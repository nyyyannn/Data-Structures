import java.util.*;
public class StackQ1 {
    private Stack <String> stack;
    private String currentPage;

    public StackQ1()
    {
        stack = new Stack<>();
        currentPage = "Home";
    }

    public void pushPage(String newPage)
    {
        stack.push(currentPage);
        currentPage = newPage;
        System.out.println("Visiting: "+newPage);
    }

    public void popPage()
    {
        if(!stack.isEmpty())
        {
            System.out.println("Back to: "+stack.pop());
        }
        else
        {
            System.out.println("No page to go back to");
        }
    }
    public static void main(String[] args) {
        StackQ1 test = new StackQ1();
        test.pushPage("Google");
        test.pushPage("YouTube");
        test.pushPage("Pinterest");
        test.pushPage("Reddit");

        test.popPage();
        test.popPage();
        test.popPage();
        test.popPage();
        test.popPage();
    }
}
