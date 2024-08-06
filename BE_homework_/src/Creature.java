import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Creature {
    private Map<String, String> creature = new HashMap<>();

    void addData(String name, String data){ //데이터 추가
        System.out.println("생물 관리 시스템 - 데이터 추가 후 상태:");

        if(creature.containsKey(name)){
            creature.put(name, creature.get(name)+", "+data);
        } else {
            creature.put(name, data);
        }
        getCreature();
    }
    void showCreature(){
        System.out.println("생물 관리 시스템 - 데이터 조회:");
        getCreature();
    }
    void showCreature(String name){
        System.out.println("생물 관리 시스템 - "+name+" 조회:");
        System.out.println("\t\t - " + name + ": " + getCreature(name));
    }

    void getCreature(){
        for(String key : creature.keySet()){
            System.out.println("\t\t - " + key + ": " + creature.get(key));
        }
        System.out.println();
    }
    String getCreature(String name){
        if(!creature.containsKey(name)){
            throw new NoSuchElementException("해당 생명체를 찾을 수 없습니다.");
        }
        return creature.get(name);
    }
}
