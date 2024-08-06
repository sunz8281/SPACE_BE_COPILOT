//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Creature creature = new Creature();
        resource.addResource("식량", "100");
        resource.addResource("물", "1000");
        resource.useResource("식량", 100);
        resource.showResource();

        creature.addData("Zeta", "온순한 외계 생명체");
        creature.addData("Zeta", "주로 물 근처에 서식");
        creature.addData("Alpha", "공격적인 외계 생명체");
        creature.showCreature();
        creature.showCreature("Zeta");
    }
}