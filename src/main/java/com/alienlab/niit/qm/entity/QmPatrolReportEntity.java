package com.alienlab.niit.qm.entity;

import java.sql.Timestamp;

/**
 * Created by Master QB on 2017/3/14.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "qm_patrol_report", schema = "qualitymonitor", catalog = "")
public class QmPatrolReportEntity {
    private long reportNo;

    @javax.persistence.Id
    @javax.persistence.Column(name = "report_no")
    public long getReportNo() {
        return reportNo;
    }

    public void setReportNo(long reportNo) {
        this.reportNo = reportNo;
    }

    private String termNo;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "term_no")
    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    private String teacherNo;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "teacher_no")
    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    private String reportWeek;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_week")
    public String getReportWeek() {
        return reportWeek;
    }

    public void setReportWeek(String reportWeek) {
        this.reportWeek = reportWeek;
    }

    private String reportDate;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_date")
    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    private String reportDep;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_dep")
    public String getReportDep() {
        return reportDep;
    }

    public void setReportDep(String reportDep) {
        this.reportDep = reportDep;
    }

    private String reportStuattendance;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_stuattendance")
    public String getReportStuattendance() {
        return reportStuattendance;
    }

    public void setReportStuattendance(String reportStuattendance) {
        this.reportStuattendance = reportStuattendance;
    }

    private String reportStustudy;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_stustudy")
    public String getReportStustudy() {
        return reportStustudy;
    }

    public void setReportStustudy(String reportStustudy) {
        this.reportStustudy = reportStustudy;
    }

    private String reportTeateach;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_teateach")
    public String getReportTeateach() {
        return reportTeateach;
    }

    public void setReportTeateach(String reportTeateach) {
        this.reportTeateach = reportTeateach;
    }

    private String reportTeachmanage;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_teachmanage")
    public String getReportTeachmanage() {
        return reportTeachmanage;
    }

    public void setReportTeachmanage(String reportTeachmanage) {
        this.reportTeachmanage = reportTeachmanage;
    }

    private String reportTeachsecurity;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_teachsecurity")
    public String getReportTeachsecurity() {
        return reportTeachsecurity;
    }

    public void setReportTeachsecurity(String reportTeachsecurity) {
        this.reportTeachsecurity = reportTeachsecurity;
    }

    private String reportOther;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_other")
    public String getReportOther() {
        return reportOther;
    }

    public void setReportOther(String reportOther) {
        this.reportOther = reportOther;
    }

    private Integer reportPublish;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_publish")
    public Integer getReportPublish() {
        return reportPublish;
    }

    public void setReportPublish(Integer reportPublish) {
        this.reportPublish = reportPublish;
    }

    private Timestamp reportTime;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "report_time")
    public java.sql.Timestamp getReportTime() {
        return reportTime;
    }

    public void setReportTime(java.sql.Timestamp reportTime) {
        this.reportTime = reportTime;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        QmPatrolReportEntity that = (QmPatrolReportEntity) object;

        if (reportNo != that.reportNo) return false;
        if (termNo != null ? !termNo.equals(that.termNo) : that.termNo != null) return false;
        if (teacherNo != null ? !teacherNo.equals(that.teacherNo) : that.teacherNo != null) return false;
        if (reportWeek != null ? !reportWeek.equals(that.reportWeek) : that.reportWeek != null) return false;
        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;
        if (reportDep != null ? !reportDep.equals(that.reportDep) : that.reportDep != null) return false;
        if (reportStuattendance != null ? !reportStuattendance.equals(that.reportStuattendance) : that.reportStuattendance != null)
            return false;
        if (reportStustudy != null ? !reportStustudy.equals(that.reportStustudy) : that.reportStustudy != null)
            return false;
        if (reportTeateach != null ? !reportTeateach.equals(that.reportTeateach) : that.reportTeateach != null)
            return false;
        if (reportTeachmanage != null ? !reportTeachmanage.equals(that.reportTeachmanage) : that.reportTeachmanage != null)
            return false;
        if (reportTeachsecurity != null ? !reportTeachsecurity.equals(that.reportTeachsecurity) : that.reportTeachsecurity != null)
            return false;
        if (reportOther != null ? !reportOther.equals(that.reportOther) : that.reportOther != null) return false;
        if (reportPublish != null ? !reportPublish.equals(that.reportPublish) : that.reportPublish != null)
            return false;
        if (reportTime != null ? !reportTime.equals(that.reportTime) : that.reportTime != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (reportNo ^ (reportNo >>> 32));
        result = 31 * result + (termNo != null ? termNo.hashCode() : 0);
        result = 31 * result + (teacherNo != null ? teacherNo.hashCode() : 0);
        result = 31 * result + (reportWeek != null ? reportWeek.hashCode() : 0);
        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
        result = 31 * result + (reportDep != null ? reportDep.hashCode() : 0);
        result = 31 * result + (reportStuattendance != null ? reportStuattendance.hashCode() : 0);
        result = 31 * result + (reportStustudy != null ? reportStustudy.hashCode() : 0);
        result = 31 * result + (reportTeateach != null ? reportTeateach.hashCode() : 0);
        result = 31 * result + (reportTeachmanage != null ? reportTeachmanage.hashCode() : 0);
        result = 31 * result + (reportTeachsecurity != null ? reportTeachsecurity.hashCode() : 0);
        result = 31 * result + (reportOther != null ? reportOther.hashCode() : 0);
        result = 31 * result + (reportPublish != null ? reportPublish.hashCode() : 0);
        result = 31 * result + (reportTime != null ? reportTime.hashCode() : 0);
        return result;
    }
}
