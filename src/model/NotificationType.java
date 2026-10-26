package model;

import java.util.HashMap;

public class NotificationType {
    
    private static HashMap<String ,Integer> types=new HashMap<>();
    private String type;

    public void addCount(){
        types.put(this.type, types.getOrDefault(this.type, 0)+1);
    }
    
    public String getType() {
        return this.type;
    }

    
     public void setType(String type) {
        this.type = type;
        addCount();
    }

     public static void getTypes() {
        System.out.println("All Types");
        for (String type: types.keySet()) {
            System.out.println(type+"    "+types.get(type));
        }
    }

    public static void main(String[] args) {
        NotificationType notificationType=new NotificationType();
        NotificationType notificationType1=new NotificationType();
        NotificationType notificationType2=new NotificationType();
        notificationType.setType("order");
        notificationType1.setType("order");
        notificationType2.setType("order shipped");
        System.out.println(NotificationType.types);
        NotificationType.getTypes();
    }
    
}
