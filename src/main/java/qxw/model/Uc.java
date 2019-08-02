package qxw.model;

import java.io.Serializable;

/**
 * uc
 * @author 
 */
public class Uc implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}