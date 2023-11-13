// Concrete Decorator - Authorization of Users
public class AuthorizedWebPageDecorator extends WebPageDecorator {
    public AuthorizedWebPageDecorator(WebPage webPage) {
        super(webPage);
    }

    private void authorizeUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        authorizeUser();
        super.display();
    }
}
