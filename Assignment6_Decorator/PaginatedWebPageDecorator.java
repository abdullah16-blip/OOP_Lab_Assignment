// Concrete Decorator - Pagination(Splitting search results across multiple web pages)
public class PaginatedWebPageDecorator extends WebPageDecorator {
    public PaginatedWebPageDecorator(WebPage webPage) {
        super(webPage);
    }

    private void paginateResults() {
        System.out.println("Paginating search results");
    }

    @Override
    public void display() {
        super.display();
        paginateResults();
    }
}
