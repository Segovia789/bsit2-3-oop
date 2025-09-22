public class Main {
    public static void main(String[] args) {
        Trainable buddy = new Dog("Buddy", 3);
        Trainable tweety = new Bird("Tweety", 1);

        System.out.println("Training Session Started!");
        System.out.println("===========================");
        buddy.performTrick();
        tweety.performTrick();
    }
}
