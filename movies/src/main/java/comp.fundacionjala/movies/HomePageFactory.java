package comp.fundacionjala.movies;


public  class HomePageFactory extends AbstractPageFactory{
    public IPage createPage(){
        return new HomePage();
    }
}
