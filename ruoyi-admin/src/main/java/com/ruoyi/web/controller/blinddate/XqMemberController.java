package com.ruoyi.web.controller.blinddate;

import java.util.List;

import com.ruoyi.common.core.domain.entity.XqMember;
import com.ruoyi.system.service.IXqMemberService;
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
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员Controller
 * 
 * @author shirq
 * @date 2022-06-02
 */
@Controller
@RequestMapping("/blinddate/xq_member")
public class XqMemberController extends BaseController
{
    private String prefix = "blinddate/xq_member";

    @Autowired
    private IXqMemberService xqMemberService;

    @RequiresPermissions("blinddate:xq_member:view")
    @GetMapping()
    public String xq_member()
    {
        return prefix + "/xq_member";
    }

    /**
     * 查询会员列表
     */
    @RequiresPermissions("blinddate:xq_member:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(XqMember xqMember)
    {
        startPage();
        List<XqMember> list = xqMemberService.selectXqMemberList(xqMember);
        return getDataTable(list);
    }

    /**
     * 导出会员列表
     */
    @RequiresPermissions("blinddate:xq_member:export")
    @Log(title = "会员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(XqMember xqMember)
    {
        List<XqMember> list = xqMemberService.selectXqMemberList(xqMember);
        ExcelUtil<XqMember> util = new ExcelUtil<XqMember>(XqMember.class);
        return util.exportExcel(list, "会员数据");
    }

    /**
     * 新增会员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会员
     */
    @RequiresPermissions("blinddate:xq_member:add")
    @Log(title = "会员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(XqMember xqMember)
    {
        return toAjax(xqMemberService.insertXqMember(xqMember));
    }

    /**
     * 修改会员
     */
    @RequiresPermissions("blinddate:xq_member:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        XqMember xqMember = xqMemberService.selectXqMemberById(id);
        mmap.put("xqMember", xqMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员
     */
    @RequiresPermissions("blinddate:xq_member:edit")
    @Log(title = "会员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(XqMember xqMember)
    {
        return toAjax(xqMemberService.updateXqMember(xqMember));
    }

    /**
     * 删除会员
     */
    @RequiresPermissions("blinddate:xq_member:remove")
    @Log(title = "会员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xqMemberService.deleteXqMemberByIds(ids));
    }
}
