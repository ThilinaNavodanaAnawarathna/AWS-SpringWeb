package ijse.aws.testAWS.data;

import java.util.Date;

public class Message {
    private String sender;
    private String message;
    private Date sentTime;

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", sentTime=" + sentTime +
                '}';
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSentTime() {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    public Message(String sender, String message, Date sentTime) {
        this.sender = sender;
        this.message = message;
        this.sentTime = sentTime;
    }
}
