package qxw.model;

import java.io.Serializable;

/**
 * class
 * @author 
 */
public class Class implements Serializable {
    private Integer id;

    private String className;

    private String monitot;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMonitot() {
        return monitot;
    }

    public void setMonitot(String monitot) {
        this.monitot = monitot;
    }
}