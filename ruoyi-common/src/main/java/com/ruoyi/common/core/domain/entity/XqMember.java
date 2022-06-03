package com.ruoyi.common.core.domain.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员对象 xq_member
 * 
 * @author shirq
 * @date 2022-06-02
 */
public class XqMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** 微信id */
    @Excel(name = "微信id")
    private String wechatId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 昵称 */
    @Excel(name = "昵称")
    private String alias;

    /** 性别字符 */
    private String sexStr;

    /** 性别,0=男、1=女 */
    @Excel(name = "性别,0=男、1=女")
    private String sex;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String birthDate;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 体重 */
    @Excel(name = "体重")
    private String weight;

    /** 身高 */
    @Excel(name = "身高")
    private String height;

    /** 月收入字符 */
    private String incomeStr;

    /** 月收入 */
    @Excel(name = "月收入")
    private String income;

    /** 学历字符 */
    private String educationStr;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 故乡字符 */
    @Excel(name = "故乡字符")
    private String hometownStr;

    /** 故乡 */
    private String hometown;

    /** 工作地字符 */
    @Excel(name = "工作地字符")
    private String workplaceStr;

    /** 工作地 */
    private String workplace;

    /** 婚姻状况字符 */
    private String marriageStr;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String marriage;

    /** 是否有小孩，0=否、1=是 */
    @Excel(name = "是否有小孩，0=否、1=是")
    private String isKid;

    /** 职业 */
    @Excel(name = "职业")
    private String occupation;

    /** 是否要小孩，0=否、1=是 */
    @Excel(name = "是否要小孩，0=否、1=是")
    private String isDemandKid;

    /** 买车情况字符 */
    private String carStr;

    /** 买车情况 */
    @Excel(name = "买车情况")
    private String car;

    /** 买房情况字符 */
    private String houseStr;

    /** 买房情况 */
    @Excel(name = "买房情况")
    private String house;

    /** 微信号 */
    @Excel(name = "微信号")
    private String weChat;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 宗教信仰字符 */
    private String religionStr;

    /** 宗教信仰 */
    @Excel(name = "宗教信仰")
    private String religion;

    /** 是否抽烟，0=否、1=是 */
    @Excel(name = "是否抽烟，0=否、1=是")
    private String isSmoking;

    /** 是否喝酒，0=否、1=是 */
    @Excel(name = "是否喝酒，0=否、1=是")
    private String isDrink;

    /** 头像url */
    private String headPortraitUrl;

    /** 相册json */
    @Excel(name = "相册json")
    private String pictureJson;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 是否实名认证，0=否、1=是 */
    @Excel(name = "是否实名认证，0=否、1=是")
    private String isAutonym;

    /** 是否学历认证，0=否、1=是 */
    @Excel(name = "是否学历认证，0=否、1=是")
    private String isEducation;

    /** 是否婚况认证，0=否、1=是 */
    @Excel(name = "是否婚况认证，0=否、1=是")
    private String isMarriage;

    /** 是否车辆认证，0=否、1=是 */
    @Excel(name = "是否车辆认证，0=否、1=是")
    private String isCar;

    /** 是否房产认证，0=否、1=是 */
    @Excel(name = "是否房产认证，0=否、1=是")
    private String isHouse;

    /** 是否工作认证，0=否、1=是 */
    @Excel(name = "是否工作认证，0=否、1=是")
    private String isWork;

    /** 是否收入认证，0=否、1=是 */
    @Excel(name = "是否收入认证，0=否、1=是")
    private String isIncome;

    /** 自我描述 */
    private String selfDescription;

    /** 兴趣爱好 */
    private String interest;

    /** 择偶标准描述 */
    private String mateCriterionDescription;

    /** 家庭背景 */
    private String familyBackground;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastdate;

    /** 是否删除，0=否、1=是 */
    @Excel(name = "是否删除，0=否、1=是")
    private String isDelete;

    /** 状态，1=未找到对象、2=已经找到对象、3=已经结婚 */
    @Excel(name = "状态，1=未找到对象、2=已经找到对象、3=已经结婚")
    private String state;

    /** 是否隐身，0=否、1=是 */
    @Excel(name = "是否隐身，0=否、1=是")
    private String isConceal;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWechatId(String wechatId) 
    {
        this.wechatId = wechatId;
    }

    public String getWechatId() 
    {
        return wechatId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAlias(String alias) 
    {
        this.alias = alias;
    }

    public String getAlias() 
    {
        return alias;
    }
    public void setSexStr(String sexStr) 
    {
        this.sexStr = sexStr;
    }

    public String getSexStr() 
    {
        return sexStr;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirthDate(String birthDate) 
    {
        this.birthDate = birthDate;
    }

    public String getBirthDate() 
    {
        return birthDate;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getAge() 
    {
        return age;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setHeight(String height) 
    {
        this.height = height;
    }

    public String getHeight() 
    {
        return height;
    }
    public void setIncomeStr(String incomeStr) 
    {
        this.incomeStr = incomeStr;
    }

    public String getIncomeStr() 
    {
        return incomeStr;
    }
    public void setIncome(String income) 
    {
        this.income = income;
    }

    public String getIncome() 
    {
        return income;
    }
    public void setEducationStr(String educationStr) 
    {
        this.educationStr = educationStr;
    }

    public String getEducationStr() 
    {
        return educationStr;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setHometownStr(String hometownStr) 
    {
        this.hometownStr = hometownStr;
    }

    public String getHometownStr() 
    {
        return hometownStr;
    }
    public void setHometown(String hometown) 
    {
        this.hometown = hometown;
    }

    public String getHometown() 
    {
        return hometown;
    }
    public void setWorkplaceStr(String workplaceStr) 
    {
        this.workplaceStr = workplaceStr;
    }

    public String getWorkplaceStr() 
    {
        return workplaceStr;
    }
    public void setWorkplace(String workplace) 
    {
        this.workplace = workplace;
    }

    public String getWorkplace() 
    {
        return workplace;
    }
    public void setMarriageStr(String marriageStr) 
    {
        this.marriageStr = marriageStr;
    }

    public String getMarriageStr() 
    {
        return marriageStr;
    }
    public void setMarriage(String marriage) 
    {
        this.marriage = marriage;
    }

    public String getMarriage() 
    {
        return marriage;
    }
    public void setIsKid(String isKid) 
    {
        this.isKid = isKid;
    }

    public String getIsKid() 
    {
        return isKid;
    }
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }
    public void setIsDemandKid(String isDemandKid) 
    {
        this.isDemandKid = isDemandKid;
    }

    public String getIsDemandKid() 
    {
        return isDemandKid;
    }
    public void setCarStr(String carStr) 
    {
        this.carStr = carStr;
    }

    public String getCarStr() 
    {
        return carStr;
    }
    public void setCar(String car) 
    {
        this.car = car;
    }

    public String getCar() 
    {
        return car;
    }
    public void setHouseStr(String houseStr) 
    {
        this.houseStr = houseStr;
    }

    public String getHouseStr() 
    {
        return houseStr;
    }
    public void setHouse(String house) 
    {
        this.house = house;
    }

    public String getHouse() 
    {
        return house;
    }
    public void setWeChat(String weChat) 
    {
        this.weChat = weChat;
    }

    public String getWeChat() 
    {
        return weChat;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setReligionStr(String religionStr) 
    {
        this.religionStr = religionStr;
    }

    public String getReligionStr() 
    {
        return religionStr;
    }
    public void setReligion(String religion) 
    {
        this.religion = religion;
    }

    public String getReligion() 
    {
        return religion;
    }
    public void setIsSmoking(String isSmoking) 
    {
        this.isSmoking = isSmoking;
    }

    public String getIsSmoking() 
    {
        return isSmoking;
    }
    public void setIsDrink(String isDrink) 
    {
        this.isDrink = isDrink;
    }

    public String getIsDrink() 
    {
        return isDrink;
    }
    public void setHeadPortraitUrl(String headPortraitUrl) 
    {
        this.headPortraitUrl = headPortraitUrl;
    }

    public String getHeadPortraitUrl() 
    {
        return headPortraitUrl;
    }
    public void setPictureJson(String pictureJson) 
    {
        this.pictureJson = pictureJson;
    }

    public String getPictureJson() 
    {
        return pictureJson;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setIsAutonym(String isAutonym) 
    {
        this.isAutonym = isAutonym;
    }

    public String getIsAutonym() 
    {
        return isAutonym;
    }
    public void setIsEducation(String isEducation) 
    {
        this.isEducation = isEducation;
    }

    public String getIsEducation() 
    {
        return isEducation;
    }
    public void setIsMarriage(String isMarriage) 
    {
        this.isMarriage = isMarriage;
    }

    public String getIsMarriage() 
    {
        return isMarriage;
    }
    public void setIsCar(String isCar) 
    {
        this.isCar = isCar;
    }

    public String getIsCar() 
    {
        return isCar;
    }
    public void setIsHouse(String isHouse) 
    {
        this.isHouse = isHouse;
    }

    public String getIsHouse() 
    {
        return isHouse;
    }
    public void setIsWork(String isWork) 
    {
        this.isWork = isWork;
    }

    public String getIsWork() 
    {
        return isWork;
    }
    public void setIsIncome(String isIncome) 
    {
        this.isIncome = isIncome;
    }

    public String getIsIncome() 
    {
        return isIncome;
    }
    public void setSelfDescription(String selfDescription) 
    {
        this.selfDescription = selfDescription;
    }

    public String getSelfDescription() 
    {
        return selfDescription;
    }
    public void setInterest(String interest) 
    {
        this.interest = interest;
    }

    public String getInterest() 
    {
        return interest;
    }
    public void setMateCriterionDescription(String mateCriterionDescription) 
    {
        this.mateCriterionDescription = mateCriterionDescription;
    }

    public String getMateCriterionDescription() 
    {
        return mateCriterionDescription;
    }
    public void setFamilyBackground(String familyBackground) 
    {
        this.familyBackground = familyBackground;
    }

    public String getFamilyBackground() 
    {
        return familyBackground;
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
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setIsConceal(String isConceal) 
    {
        this.isConceal = isConceal;
    }

    public String getIsConceal() 
    {
        return isConceal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wechatId", getWechatId())
            .append("name", getName())
            .append("alias", getAlias())
            .append("sexStr", getSexStr())
            .append("sex", getSex())
            .append("birthDate", getBirthDate())
            .append("age", getAge())
            .append("weight", getWeight())
            .append("height", getHeight())
            .append("incomeStr", getIncomeStr())
            .append("income", getIncome())
            .append("educationStr", getEducationStr())
            .append("education", getEducation())
            .append("hometownStr", getHometownStr())
            .append("hometown", getHometown())
            .append("workplaceStr", getWorkplaceStr())
            .append("workplace", getWorkplace())
            .append("marriageStr", getMarriageStr())
            .append("marriage", getMarriage())
            .append("isKid", getIsKid())
            .append("occupation", getOccupation())
            .append("isDemandKid", getIsDemandKid())
            .append("carStr", getCarStr())
            .append("car", getCar())
            .append("houseStr", getHouseStr())
            .append("house", getHouse())
            .append("weChat", getWeChat())
            .append("phone", getPhone())
            .append("religionStr", getReligionStr())
            .append("religion", getReligion())
            .append("isSmoking", getIsSmoking())
            .append("isDrink", getIsDrink())
            .append("headPortraitUrl", getHeadPortraitUrl())
            .append("pictureJson", getPictureJson())
            .append("idCard", getIdCard())
            .append("isAutonym", getIsAutonym())
            .append("isEducation", getIsEducation())
            .append("isMarriage", getIsMarriage())
            .append("isCar", getIsCar())
            .append("isHouse", getIsHouse())
            .append("isWork", getIsWork())
            .append("isIncome", getIsIncome())
            .append("selfDescription", getSelfDescription())
            .append("interest", getInterest())
            .append("mateCriterionDescription", getMateCriterionDescription())
            .append("familyBackground", getFamilyBackground())
            .append("createdate", getCreatedate())
            .append("lastdate", getLastdate())
            .append("isDelete", getIsDelete())
            .append("state", getState())
            .append("remark", getRemark())
            .append("isConceal", getIsConceal())
            .toString();
    }
}
