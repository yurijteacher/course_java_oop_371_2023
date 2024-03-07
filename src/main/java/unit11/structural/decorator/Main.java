package unit11.structural.decorator;

public class Main
{

    public static void main(String[] args) {
        Component component = new PanelDecorator(new ColorDecorator(new PanelDecorator(new ColorDecorator(new ComponentText()))));
        component.draw();
    }
}
