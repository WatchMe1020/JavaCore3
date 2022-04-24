package JavaCore2;

public class Main {
    public static void main(String[] args){
        fillingBox();
    }
    public static void fillingBox(){
        Box<Apple> appleBox = new Box(1.0f);
        Box<Orange> orangeBox = new Box(1.5f);
        Box box1 = new Box(1.0f);
        Box box3 = new Box(1.0f);



        for(int i = 0; i < 30; i++){
            appleBox.addFruit(new Apple());
            box3.addFruit(new Apple());

        }
        for(int i = 0; i < 20;i++){
            orangeBox.addFruit(new Orange());
        }
        box1.transfer(box3);
        System.out.println("----------------------------------------------------------");
        System.out.println("Вес ящика с яблоками: " + appleBox.getBoxWeight());
        System.out.println("----------------------------------------------------------");
        System.out.println("Вес ящика с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("----------------------------------------------------------");
        System.out.println("Сравнение ящиков: " + orangeBox.compare(appleBox));
        System.out.println("----------------------------------------------------------");
        System.out.println("Пересыпания ящиков: " + box3.getBoxWeight());
        System.out.println("----------------------------------------------------------");

    }
}
