// Client Code
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a basic web page
        WebPage basicWebPage = new BasicWebPage();

        // Decorate the basic web page with authorization
        WebPage authorizedWebPage = new AuthorizedWebPageDecorator(basicWebPage);

        // Decorate the authorized web page with pagination
        WebPage authorizedAndPaginatedWebPage = new PaginatedWebPageDecorator(authorizedWebPage);

        // Display the final web page
        authorizedAndPaginatedWebPage.display();
    }
}
