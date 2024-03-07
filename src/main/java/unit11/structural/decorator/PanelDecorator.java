package unit11.structural.decorator;

public class PanelDecorator extends Decorator{
    public PanelDecorator(Component component) {
        super(component);
    }
    @Override
    public void afterDraw() {
        System.out.println("panel decorator");
    }
}
