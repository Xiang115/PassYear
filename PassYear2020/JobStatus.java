/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
public class JobStatus {

    private String que = null;
    private String started = null;
    private String exited = null;

    public void setque(String queue) {
        this.que = queue;
    }

    public void setStatus(String start) {
        this.started = start;
    }

    public void setExited(String exited) {
        this.exited = exited;
    }

    public String getQue() {
        return que;
    }

    public String getStatus() {
        return this.started;
    }

    public String getExit() {
        return this.exited;
    }
}
