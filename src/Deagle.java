public class Deagle extends Equipment {
    public Deagle() {
        super(new BShoot(), new BNoAttack());
    }

    @Override
    void display(){
        System.out.println("It is desert eagle");
    }
}