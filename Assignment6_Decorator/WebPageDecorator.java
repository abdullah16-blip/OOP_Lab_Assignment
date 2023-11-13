// Decorator Interface
public abstract class WebPageDecorator implements WebPage {
    private WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        webPage.display();
    }
}
