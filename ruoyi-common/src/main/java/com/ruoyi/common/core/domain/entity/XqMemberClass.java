package com.ruoyi.common.core.domain.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员等级 （套餐）对象 xq_member_class
 * 
 * @author shirq
 * @date 2022-05-27
 */
public class XqMemberClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 等级名称 */
    @Excel(name = "等级名称")
    private String name;

    /** 套餐条款json */
    @Excel(name = "套餐条款json")
    private String termsJson;

    /** 套餐原价 */
    @Excel(name = "套餐原价")
    private BigDecimal originalPrice;

    /** 套餐销售价格 */
    @Excel(name = "套餐销售价格")
    private BigDecimal salePrice;

    /** 是否删除，0=否、1=是 */
    @Excel(name = "是否删除，0=否、1=是")
    private String isDelete;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lastdate;

    /** 会员等级详情信息 */
    private List<XqMemberClassDetails> xqMemberClassDetailsList;

    //会员详情等级 删除的id集合
    private String ids_;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTermsJson(String termsJson) 
    {
        this.termsJson = termsJson;
    }

    public String getTermsJson() 
    {
        return termsJson;
    }
    public void setOriginalPrice(BigDecimal originalPrice) 
    {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getOriginalPrice() 
    {
        return originalPrice;
    }
    public void setSalePrice(BigDecimal salePrice) 
    {
        this.salePrice = salePrice;
    }

    public BigDecimal getSalePrice() 
    {
        return salePrice;
    }
    public void setIsDelete(String isDelete) 
    {
        this.isDelete = isDelete;
    }

    public String getIsDelete() 
    {
        return isDelete;
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

    public String getIds_() {
        return ids_;
    }

    public void setIds_(String ids_) {
        this.ids_ = ids_;
    }

    public List<XqMemberClassDetails> getXqMemberClassDetailsList()
    {
        return xqMemberClassDetailsList;
    }

    public void setXqMemberClassDetailsList(List<XqMemberClassDetails> xqMemberClassDetailsList)
    {
        this.xqMemberClassDetailsList = xqMemberClassDetailsList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("termsJson", getTermsJson())
            .append("remark", getRemark())
            .append("originalPrice", getOriginalPrice())
            .append("salePrice", getSalePrice())
            .append("isDelete", getIsDelete())
            .append("createdate", getCreatedate())
            .append("lastdate", getLastdate())
            .append("xqMemberClassDetailsList", getXqMemberClassDetailsList())
            .toString();
    }
}
