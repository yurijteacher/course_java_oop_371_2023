package unit11.structural.decorator;

public class ComponentText implements Component{
    @Override
    public void draw() {
        System.out.println("Text");
    }
}
