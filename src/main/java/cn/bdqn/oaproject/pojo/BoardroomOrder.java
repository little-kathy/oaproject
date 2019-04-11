package cn.bdqn.oaproject.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 会议室预订表
 */
@Entity
@Table(name = "BOARDROOM_ORDER")
public class BoardroomOrder {

    /**
     * 预订编号
     */
    @Id
    @Column(name="RESERVATION_NO")
    private Integer reservationNo;

    /**
     * 会议室编号
     */
    @Column(name="MEETINGROOM_NO")
    private Integer meetingroomNo;

    /**
     * 会议类型编号
     */
    @Column(name="TYPE_ID")
    private Integer typeId;

    /**
     * 预订起始时间（预订时间段必须为同一天）
     */
    @Column(name="START_TIME")
    private Date startTime;

    /**
     * 预订截至时间
     */
    @Column(name="END_TIME")
    private Date endTime;

    /**
     * 创建者
     */
    @Column(name="CREATOR")
    private Integer creator;

    /**
     * 创建日期
     */
    @Column(name="CREATION_DATE")
    private Date creationDate;

    /**
     * 修改者
     */
    @Column(name="MENDER")
    private Integer mender;

    /**
     * 修改日期
     */
    @Column(name="MODIFY_DATE")
    private Date modifyDate;

    /**
     * 是否删除
     */
    @Column(name="ISDELETE")
    private Integer isdelete;


    public Integer getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo(Integer reservationNo) {
        this.reservationNo = reservationNo;
    }

    public Integer getMeetingroomNo() {
        return meetingroomNo;
    }

    public void setMeetingroomNo(Integer meetingroomNo) {
        this.meetingroomNo = meetingroomNo;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getMender() {
        return mender;
    }

    public void setMender(Integer mender) {
        this.mender = mender;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}
