public class Main {
    public static void main(String[] args) {
        MyArrayList MyNewBros = new MyArrayList();
        MyNewBros.add("Vovan");
        MyNewBros.add("Sasha");
        MyNewBros.add("Jonh Torchovski");
        MyNewBros.add("Victor Korneplod");
        MyNewBros.add("The Death");
        MyNewBros.add("Natasha");
        MyNewBros.add("Masha");
        MyNewBros.add("Pasha");
        MyNewBros.add("Sergey");
        MyNewBros.add("Vovan's clone");
        MyNewBros.add("Nitrostas");
        MyNewBros.add("Dumb the Bob one");
        MyNewBros.add("Dumpling Eater");
        for (int i = 0; i < MyNewBros.getSize(); i++) {
            System.out.println(MyNewBros.get(i));
        }
    }
}

