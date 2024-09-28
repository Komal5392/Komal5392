public class Interface{
public static void main(String args[]){
    Bear b=new Bear();
    b.eat();
    }
    interface Herbrivore{
        void eat();
    }
    interface Carnivore{
        void eat();
    }
    class Bear implements Herbrivore, Carnivore{
        public void eat(){
            System.out.println("Bear eats grass or no");
        }
    }
}