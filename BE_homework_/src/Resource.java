import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Resource {
    private Map<String, Integer> items=new HashMap<>();

    void addResource(String itemName, String amount){ //자원 추가
        System.out.println("자원 관리 시스템 - 자원 추가 후 상태:");
        int amountValue = Integer.parseInt(amount);

        if(items.containsKey(itemName)){
            items.put(itemName, items.get(itemName)+amountValue);
        } else {
            items.put(itemName, amountValue);
        }
        getResource();
    }


    void useResource(String itemName, int amountValue){ //자원 사용
        System.out.println("자원 관리 시스템 - 자원 사용 후 상태:");

        if(!items.containsKey(itemName)){ //아이템에 자원 키가 없을 때 예외발생
            throw new NoSuchElementException("자원을 찾을 수 없습니다.");
        }

        if(items.get(itemName)-amountValue<0){ //자원이 부족할 때 예외발생
            throw new IllegalArgumentException("자원이 부족합니다.");
        }

        items.put(itemName, items.get(itemName)-amountValue);

        getResource();
    }

    void showResource(){
        System.out.println("자원 관리 시스템 - 자원 조회:");
        getResource();
    }

    void getResource(){
        for(String key : items.keySet()){
            System.out.println("\t - " + key + ": " + items.get(key));
        }
        System.out.println();
    }
}
