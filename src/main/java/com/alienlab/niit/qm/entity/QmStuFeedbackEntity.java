package com.alienlab.niit.qm.entity;

/**
 * Created by Master QB on 2017/3/14.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "qm_stu_feedback", schema = "qualitymonitor", catalog = "")
public class QmStuFeedbackEntity {
    private long feedbackNo;

    @javax.persistence.Id
    @javax.persistence.Column(name = "feedback_no")
    public long getFeedbackNo() {
        return feedbackNo;
    }

    public void setFeedbackNo(long feedbackNo) {
        this.feedbackNo = feedbackNo;
    }

    private String stuNo;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "stu_no")
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    private String feedbackType;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "feedback_type")
    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    private String feedbackTitle;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "feedback_title")
    public String getFeedbackTitle() {
        return feedbackTitle;
    }

    public void setFeedbackTitle(String feedbackTitle) {
        this.feedbackTitle = feedbackTitle;
    }

    private String feedbackContent;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "feedback_content")
    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    private Long taskId;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "task_id")
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    private String feedbackTime;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "feedback_time")
    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    private String respContent;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "resp_content")
    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    private String respTime;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "resp_time")
    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime;
    }

    private String accountNo;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "account_no")
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        QmStuFeedbackEntity that = (QmStuFeedbackEntity) object;

        if (feedbackNo != that.feedbackNo) return false;
        if (stuNo != null ? !stuNo.equals(that.stuNo) : that.stuNo != null) return false;
        if (feedbackType != null ? !feedbackType.equals(that.feedbackType) : that.feedbackType != null) return false;
        if (feedbackTitle != null ? !feedbackTitle.equals(that.feedbackTitle) : that.feedbackTitle != null)
            return false;
        if (feedbackContent != null ? !feedbackContent.equals(that.feedbackContent) : that.feedbackContent != null)
            return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (feedbackTime != null ? !feedbackTime.equals(that.feedbackTime) : that.feedbackTime != null) return false;
        if (respContent != null ? !respContent.equals(that.respContent) : that.respContent != null) return false;
        if (respTime != null ? !respTime.equals(that.respTime) : that.respTime != null) return false;
        if (accountNo != null ? !accountNo.equals(that.accountNo) : that.accountNo != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (feedbackNo ^ (feedbackNo >>> 32));
        result = 31 * result + (stuNo != null ? stuNo.hashCode() : 0);
        result = 31 * result + (feedbackType != null ? feedbackType.hashCode() : 0);
        result = 31 * result + (feedbackTitle != null ? feedbackTitle.hashCode() : 0);
        result = 31 * result + (feedbackContent != null ? feedbackContent.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (feedbackTime != null ? feedbackTime.hashCode() : 0);
        result = 31 * result + (respContent != null ? respContent.hashCode() : 0);
        result = 31 * result + (respTime != null ? respTime.hashCode() : 0);
        result = 31 * result + (accountNo != null ? accountNo.hashCode() : 0);
        return result;
    }
}
