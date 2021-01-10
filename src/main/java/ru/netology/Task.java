package ru.netology;

public class Task {
    private int numberOfMessages;
    private String threadName;
    private Long threadID;

    public Task(int numberOfMessages, String threadName, Long threadID) {
        this.numberOfMessages = numberOfMessages;
        this.threadName = threadName;
        this.threadID = threadID;
    }

    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    public void setNumberOfMessages(int numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Long getThreadID() {
        return threadID;
    }

    public void setThreadID(Long threadID) {
        this.threadID = threadID;
    }
}
