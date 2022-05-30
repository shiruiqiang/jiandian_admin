package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.XqMemberClass;
import com.ruoyi.common.core.domain.entity.XqMemberClassDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.system.mapper.XqMemberClassMapper;
import com.ruoyi.system.service.IXqMemberClassService;
import com.ruoyi.common.core.text.Convert;

/**
 * 会员等级 （套餐）Service业务层处理
 * 
 * @author shirq
 * @date 2022-05-27
 */
@Service
public class XqMemberClassServiceImpl implements IXqMemberClassService 
{
    @Autowired
    private XqMemberClassMapper xqMemberClassMapper;

    /**
     * 查询会员等级 （套餐）
     * 
     * @param id 会员等级 （套餐）主键
     * @return 会员等级 （套餐）
     */
    @Override
    public XqMemberClass selectXqMemberClassById(Long id)
    {
        return xqMemberClassMapper.selectXqMemberClassById(id);
    }

    /**
     * 查询会员等级 （套餐）列表
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 会员等级 （套餐）
     */
    @Override
    public List<XqMemberClass> selectXqMemberClassList(XqMemberClass xqMemberClass)
    {
        return xqMemberClassMapper.selectXqMemberClassList(xqMemberClass);
    }

    /**
     * 新增会员等级 （套餐）
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 结果
     */
    @Transactional
    @Override
    public int insertXqMemberClass(XqMemberClass xqMemberClass)
    {
        int rows = xqMemberClassMapper.insertXqMemberClass(xqMemberClass);
        insertXqMemberClassDetails(xqMemberClass);
        return rows;
    }

    /**
     * 修改会员等级 （套餐）
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 结果
     */
    @Transactional
    @Override
    public int updateXqMemberClass(XqMemberClass xqMemberClass)
    {
        if(StringUtils.isNotEmpty(xqMemberClass.getIds_())){
            String[] list  = xqMemberClass.getIds_().split("_");
            if(list != null && list.length > 0){
                xqMemberClassMapper.deleteXqMemberClassDetailsByIds(list);
            }
        }

        List<XqMemberClassDetails> updateDetails = xqMemberClass.getXqMemberClassDetailsList().stream().filter(x -> x.getId() != null).collect(Collectors.toList());
        List<XqMemberClassDetails> insertDetails = xqMemberClass.getXqMemberClassDetailsList().stream().filter(x -> x.getId() == null).collect(Collectors.toList());

        if(updateDetails != null && updateDetails.size() > 0){
            for (XqMemberClassDetails xqMemberClassDetails:updateDetails) {
                xqMemberClassDetails.setMemberId(xqMemberClass.getId());
                xqMemberClassMapper.updateXqMemberClassDetails(xqMemberClassDetails);
            }
        }
        if(insertDetails != null && insertDetails.size() > 0){
            for (XqMemberClassDetails xqMemberClassDetails:insertDetails) {
                xqMemberClassDetails.setMemberId(xqMemberClass.getId());
            }
            xqMemberClassMapper.batchXqMemberClassDetails(insertDetails);
        }

        return xqMemberClassMapper.updateXqMemberClass(xqMemberClass);
    }

    /**
     * 批量删除会员等级 （套餐）
     * 
     * @param ids 需要删除的会员等级 （套餐）主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteXqMemberClassByIds(String ids)
    {
//        xqMemberClassMapper.deleteXqMemberClassDetailsByMemberIds(Convert.toStrArray(ids));
        return xqMemberClassMapper.deleteXqMemberClassByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员等级 （套餐）信息
     * 
     * @param id 会员等级 （套餐）主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteXqMemberClassById(Long id)
    {
        xqMemberClassMapper.deleteXqMemberClassDetailsByMemberId(id);
        return xqMemberClassMapper.deleteXqMemberClassById(id);
    }

    /**
     * 新增会员等级详情信息
     * 
     * @param xqMemberClass 会员等级 （套餐）对象
     */
    public void insertXqMemberClassDetails(XqMemberClass xqMemberClass)
    {
        List<XqMemberClassDetails> xqMemberClassDetailsList = xqMemberClass.getXqMemberClassDetailsList();
        Long id = xqMemberClass.getId();
        if (StringUtils.isNotNull(xqMemberClassDetailsList))
        {
            List<XqMemberClassDetails> list = new ArrayList<XqMemberClassDetails>();
            for (XqMemberClassDetails xqMemberClassDetails : xqMemberClassDetailsList)
            {
                xqMemberClassDetails.setMemberId(id);
                list.add(xqMemberClassDetails);
            }
            if (list.size() > 0)
            {
                xqMemberClassMapper.batchXqMemberClassDetails(list);
            }
        }
    }
}
