public class Main {
    public static void main(String[] args) {
        // without lambda expression
        /*Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing new image");
            }
        };
        d.draw();*/


        // with lambda expression
        Drawable d = () -> {
            System.out.println("Drawing new image");
        };
        d.draw();
    }
}


