package com.alienlab.niit.qm.entity;

/**
 * Created by Master QB on 2017/3/14.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "base_term", schema = "qualitymonitor", catalog = "")
public class BaseTermEntity {
    private String termNo;

    @javax.persistence.Id
    @javax.persistence.Column(name = "term_no")
    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    private String termName;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_name")
    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    private String termPrintName;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_print_name")
    public String getTermPrintName() {
        return termPrintName;
    }

    public void setTermPrintName(String termPrintName) {
        this.termPrintName = termPrintName;
    }

    private String termStartdate;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_startdate")
    public String getTermStartdate() {
        return termStartdate;
    }

    public void setTermStartdate(String termStartdate) {
        this.termStartdate = termStartdate;
    }

    private String termEnddate;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_enddate")
    public String getTermEnddate() {
        return termEnddate;
    }

    public void setTermEnddate(String termEnddate) {
        this.termEnddate = termEnddate;
    }

    private String termStatus;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_status")
    public String getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(String termStatus) {
        this.termStatus = termStatus;
    }

    private String termStudent;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_student")
    public String getTermStudent() {
        return termStudent;
    }

    public void setTermStudent(String termStudent) {
        this.termStudent = termStudent;
    }

    private String termClass;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_class")
    public String getTermClass() {
        return termClass;
    }

    public void setTermClass(String termClass) {
        this.termClass = termClass;
    }

    private String termCourse;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_course")
    public String getTermCourse() {
        return termCourse;
    }

    public void setTermCourse(String termCourse) {
        this.termCourse = termCourse;
    }

    private String termPj;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_pj")
    public String getTermPj() {
        return termPj;
    }

    public void setTermPj(String termPj) {
        this.termPj = termPj;
    }

    private String termKh;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_kh")
    public String getTermKh() {
        return termKh;
    }

    public void setTermKh(String termKh) {
        this.termKh = termKh;
    }

    private String termTk;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_tk")
    public String getTermTk() {
        return termTk;
    }

    public void setTermTk(String termTk) {
        this.termTk = termTk;
    }

    private String termKq;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_kq")
    public String getTermKq() {
        return termKq;
    }

    public void setTermKq(String termKq) {
        this.termKq = termKq;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        BaseTermEntity that = (BaseTermEntity) object;

        if (termNo != null ? !termNo.equals(that.termNo) : that.termNo != null) return false;
        if (termName != null ? !termName.equals(that.termName) : that.termName != null) return false;
        if (termPrintName != null ? !termPrintName.equals(that.termPrintName) : that.termPrintName != null)
            return false;
        if (termStartdate != null ? !termStartdate.equals(that.termStartdate) : that.termStartdate != null)
            return false;
        if (termEnddate != null ? !termEnddate.equals(that.termEnddate) : that.termEnddate != null) return false;
        if (termStatus != null ? !termStatus.equals(that.termStatus) : that.termStatus != null) return false;
        if (termStudent != null ? !termStudent.equals(that.termStudent) : that.termStudent != null) return false;
        if (termClass != null ? !termClass.equals(that.termClass) : that.termClass != null) return false;
        if (termCourse != null ? !termCourse.equals(that.termCourse) : that.termCourse != null) return false;
        if (termPj != null ? !termPj.equals(that.termPj) : that.termPj != null) return false;
        if (termKh != null ? !termKh.equals(that.termKh) : that.termKh != null) return false;
        if (termTk != null ? !termTk.equals(that.termTk) : that.termTk != null) return false;
        if (termKq != null ? !termKq.equals(that.termKq) : that.termKq != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (termNo != null ? termNo.hashCode() : 0);
        result = 31 * result + (termName != null ? termName.hashCode() : 0);
        result = 31 * result + (termPrintName != null ? termPrintName.hashCode() : 0);
        result = 31 * result + (termStartdate != null ? termStartdate.hashCode() : 0);
        result = 31 * result + (termEnddate != null ? termEnddate.hashCode() : 0);
        result = 31 * result + (termStatus != null ? termStatus.hashCode() : 0);
        result = 31 * result + (termStudent != null ? termStudent.hashCode() : 0);
        result = 31 * result + (termClass != null ? termClass.hashCode() : 0);
        result = 31 * result + (termCourse != null ? termCourse.hashCode() : 0);
        result = 31 * result + (termPj != null ? termPj.hashCode() : 0);
        result = 31 * result + (termKh != null ? termKh.hashCode() : 0);
        result = 31 * result + (termTk != null ? termTk.hashCode() : 0);
        result = 31 * result + (termKq != null ? termKq.hashCode() : 0);
        return result;
    }
}
