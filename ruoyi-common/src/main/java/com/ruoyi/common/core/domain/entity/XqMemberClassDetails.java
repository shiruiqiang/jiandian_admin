package com.ruoyi.common.core.domain.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员等级详情对象 xq_member_class_details
 * 
 * @author shirq
 * @date 2022-05-30
 */
public class XqMemberClassDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 会员等级id */
    @Excel(name = "会员等级id")
    private Long memberId;

    /** 套餐类型，1=线下活动、2=线上名额、3=牵线名额、4=一对一服务 */
    @Excel(name = "套餐类型，1=线下活动、2=线上名额、3=牵线名额、4=一对一服务")
    private String type;

    /** 是否有时间限制，0=没有时间限制，1=有时间限制 */
    @Excel(name = "是否有时间限制，0=没有时间限制，1=有时间限制")
    private String isTimeBar;

    /** 月 */
    @Excel(name = "月")
    private String month;

    /** 是否有次数限制，0=没有次数限制、1=有次数限制 */
    @Excel(name = "是否有次数限制，0=没有次数限制、1=有次数限制")
    private String isTriesLimit;

    /** 次数 */
    @Excel(name = "次数")
    private Long frequency;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lastdate;

    /** 是否删除，0=否、1=是 */
    private String isDelete;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMemberId(Long memberId) 
    {
        this.memberId = memberId;
    }

    public Long getMemberId() 
    {
        return memberId;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setIsTimeBar(String isTimeBar) 
    {
        this.isTimeBar = isTimeBar;
    }

    public String getIsTimeBar() 
    {
        return isTimeBar;
    }
    public void setMonth(String month) 
    {
        this.month = month;
    }

    public String getMonth() 
    {
        return month;
    }
    public void setIsTriesLimit(String isTriesLimit) 
    {
        this.isTriesLimit = isTriesLimit;
    }

    public String getIsTriesLimit() 
    {
        return isTriesLimit;
    }
    public void setFrequency(Long frequency) 
    {
        this.frequency = frequency;
    }

    public Long getFrequency() 
    {
        return frequency;
    }
    public void setCreatedate(Date createdate) 
    {
        this.createdate = createdate;
    }

    public Date getCreatedate() 
    {
        return createdate;
    }
    public void setLastdate(Date lastdate) 
    {
        this.lastdate = lastdate;
    }

    public Date getLastdate() 
    {
        return lastdate;
    }
    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
    {
        return isDelete;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memberId", getMemberId())
            .append("type", getType())
            .append("isTimeBar", getIsTimeBar())
            .append("month", getMonth())
            .append("isTriesLimit", getIsTriesLimit())
            .append("frequency", getFrequency())
            .append("createdate", getCreatedate())
            .append("lastdate", getLastdate())
            .append("isDelete", getIsDelete())
            .toString();
    }
}
