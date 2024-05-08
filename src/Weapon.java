public abstract class Weapon implements Playable{
    // Abstract methods to shoot or reaload the weapon
    abstract void shoot();
    abstract void reload();

    // Perform action method
    @Override
    public void performAction() {
        System.out.println();
    }
}
