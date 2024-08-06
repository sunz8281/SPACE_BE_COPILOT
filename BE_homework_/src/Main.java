//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.addResource("식량", "100");
        resource.addResource("물", "1000");
        resource.useResource("식량", 100);
        resource.showResource();
    }
}