package Data.Models;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private int id;
    private boolean isLocked;
    private String username;
    private String password;

    private final List<Entry> entries = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "id=" + id +
                ", isLocked=" + isLocked +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", entries=" + entries +
                '}';
    }
}
