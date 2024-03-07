package unit11.creational.factory;

public class FactoryShare {

    Share share;

    public Share getShare(String name){

        switch (name){
            case("квадрат"): share = new Square();
                break;
            case("коло"): share = new Circle();
                break;
            case("точка"): share = new Point();
                break;
            default: share = new Point();
        }

        return share;
    }

}
