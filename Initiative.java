import java.io.*;
/**
 *
 * @author alsuw
 */
public class Initiative implements Serializable{
    private int points;
    private String name;
    private String date;
    private String time;
    private String status;
    private String description;
    private int id;

    public Initiative(int points, String name, String date, String time, String status, String description, int id) {
        this.points = points;
        this.name = name;
        this.date = date;
        this.time = time;
        this.status = status;
        this.description = description;
        this.id = id;
    }
    
    public boolean equals(Initiative initiative){
        return this.name.equals(initiative.name) && this.id == initiative.id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
