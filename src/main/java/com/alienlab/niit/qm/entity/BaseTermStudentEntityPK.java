package com.alienlab.niit.qm.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Master QB on 2017/3/14.
 */
public class BaseTermStudentEntityPK implements Serializable {
    private String termNo;
    private String stuNo;
    private String classNo;

    @Column(name = "term_no")
    @Id
    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    @Column(name = "stu_no")
    @Id
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Column(name = "class_no")
    @Id
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseTermStudentEntityPK that = (BaseTermStudentEntityPK) o;

        if (termNo != null ? !termNo.equals(that.termNo) : that.termNo != null) return false;
        if (stuNo != null ? !stuNo.equals(that.stuNo) : that.stuNo != null) return false;
        if (classNo != null ? !classNo.equals(that.classNo) : that.classNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = termNo != null ? termNo.hashCode() : 0;
        result = 31 * result + (stuNo != null ? stuNo.hashCode() : 0);
        result = 31 * result + (classNo != null ? classNo.hashCode() : 0);
        return result;
    }
}
