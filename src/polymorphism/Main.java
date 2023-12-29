package polymorphism;

public class Main {

    public static void main(String[] args) {

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    // Polymorphism is object can take of many different forms
    static void drawUIControl(UIControl control) {
        control.draw();
    }
}
