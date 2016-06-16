package comp.fundacionjala.movies;


public class SignInPageFactory extends AbstractPageFactory{
    @Override
    public IPage createPage() {
        return new SignInPage();

    }
}
