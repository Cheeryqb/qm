package com.alienlab.niit.qm.entity;

/**
 * Created by Master QB on 2017/3/14.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "tb_role_user", schema = "qualitymonitor", catalog = "")
@javax.persistence.IdClass(TbRoleUserEntityPK.class)
public class TbRoleUserEntity {
    private long roleId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    private long userId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TbRoleUserEntity that = (TbRoleUserEntity) object;

        if (roleId != that.roleId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
}
