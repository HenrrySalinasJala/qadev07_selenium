package comp.fundacionjala.movies;

public class PageBuilder {

    public IPage buildPage(AbstractPageFactory pageFactory) {
        return pageFactory.createPage();
    }
}
