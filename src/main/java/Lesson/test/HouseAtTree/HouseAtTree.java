package Lesson.test.HouseAtTree;

public class HouseAtTree<T extends Animal & Flyable> {
    private T master;

    public HouseAtTree(T master) {
        this.master = master;
    }

    public T getMaster() {
        return master;
    }

    public void setMaster(T master) {
        this.master = master;
    }

    public static void main(String[] args) {
        //HouseAtTree<Cat> house = new HouseAtTree();
        //HouseAtTree<Plane> house2 = new HouseAtTree<>();

        HouseAtTree<Bird> house = new HouseAtTree<>(new Bird());

    }
}
