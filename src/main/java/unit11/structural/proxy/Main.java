package unit11.structural.proxy;

public class Main {

    public static void main(String[] args) {
        MyImage myImage = new MyImage("\\file.jpg");
        myImage.display();

        Proxy proxy = new Proxy("\\file.jpg");
        proxy.display();

    }

}
