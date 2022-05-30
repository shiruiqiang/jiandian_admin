package com.ruoyi.web.controller.blinddate;

import java.util.List;

import com.ruoyi.common.core.domain.entity.XqMemberClass;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.service.IXqMemberClassService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员等级 （套餐）Controller
 * 
 * @author shirq
 * @date 2022-05-27
 */
@Controller
@RequestMapping("/blinddate/xq_member_class")
public class XqMemberClassController extends BaseController
{
    private String prefix = "blinddate/xq_member_class";

    @Autowired
    private IXqMemberClassService xqMemberClassService;

    @RequiresPermissions("blinddate:xq_member_class:view")
    @GetMapping()
    public String xq_member_class()
    {
        return prefix + "/xq_member_class";
    }

    /**
     * 查询会员等级 （套餐）列表
     */
    @RequiresPermissions("blinddate:xq_member_class:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(XqMemberClass xqMemberClass)
    {
        startPage();
        List<XqMemberClass> list = xqMemberClassService.selectXqMemberClassList(xqMemberClass);
        return getDataTable(list);
    }

    /**
     * 导出会员等级 （套餐）列表
     */
    @RequiresPermissions("blinddate:xq_member_class:export")
    @Log(title = "会员等级 （套餐）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(XqMemberClass xqMemberClass)
    {
        List<XqMemberClass> list = xqMemberClassService.selectXqMemberClassList(xqMemberClass);
        ExcelUtil<XqMemberClass> util = new ExcelUtil<XqMemberClass>(XqMemberClass.class);
        return util.exportExcel(list, "会员等级 （套餐）数据");
    }

    /**
     * 新增会员等级 （套餐）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会员等级 （套餐）
     */
    @RequiresPermissions("blinddate:xq_member_class:add")
    @Log(title = "会员等级 （套餐）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(XqMemberClass xqMemberClass)
    {
        return toAjax(xqMemberClassService.insertXqMemberClass(xqMemberClass));
    }

    /**
     * 修改会员等级 （套餐）
     */
    @RequiresPermissions("blinddate:xq_member_class:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        XqMemberClass xqMemberClass = xqMemberClassService.selectXqMemberClassById(id);
        mmap.put("xqMemberClass", xqMemberClass);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员等级 （套餐）
     */
    @RequiresPermissions("blinddate:xq_member_class:edit")
    @Log(title = "会员等级 （套餐）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(XqMemberClass xqMemberClass)
    {
        return toAjax(xqMemberClassService.updateXqMemberClass(xqMemberClass));
    }

    /**
     * 删除会员等级 （套餐）
     */
    @RequiresPermissions("blinddate:xq_member_class:remove")
    @Log(title = "会员等级 （套餐）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xqMemberClassService.deleteXqMemberClassByIds(ids));
    }
}
