package model;

public class Notification {
    private int Id;
    private int user_Id;
    private String user_name;
    private String title;

    NotificationStatus notificationStatus = new NotificationStatus();
    NotificationType notificationType=new NotificationType();

    public Notification(int Id, int user_Id, String user_name, String title,String type) {
        this.Id=Id;
        this.user_Id=user_Id;
        this.user_name=user_name;
        this.title=title;
        notificationStatus.setStatus(notificationStatus.getStatus());
        notificationType.setType(type);
        
    }

    public int getId() {
        return Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getTitle() {
        return title;
    }


}
