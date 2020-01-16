package com.zr.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zr.entity.TUser;
import com.zr.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("user")
public class TUserController {

    /**
     * 注入数据查询接口
     */
    @Autowired
    private TUserMapper mapper;

    /**
     * 测试插入数据
     */

    @PostMapping("/add")
    public void testInsert(@RequestBody TUser use) {

        // 插入数据
        mapper.insert(use);
    }

    /**
     * 测试删除数据
     */

    @DeleteMapping("/{id}")
    public void testDelete(@PathVariable(value = "id") Integer id) {

        // 删除数据
        mapper.deleteByPrimaryKey(id);
    }

    /**
     * 测试修改数据
     */

    @PutMapping("/{id}")
    public void testUpdate(@PathVariable(value = "id") Integer id, @RequestBody TUser user) {

        System.out.println(id);
        System.out.println(user);

        // 修改数据
        mapper.updateByPrimaryKey(user);


    }

    /**
     * 测试查询集合
     */

    @GetMapping("/list")
    public List<TUser> testSelect() {
        List<TUser> list = mapper.selectAll();
       return list;
    }

    /**
     * 测试分页查询
     */

    @PostMapping("/page")
    public PageInfo testPage(@RequestParam(name = "pageNum") Integer pageNum,
                         @RequestParam(name = "pageSize" ) Integer pageSize) {
        // PageHelper 使用非常简单，只需要设置页码和每页显示笔数即可
        PageHelper.startPage(pageNum, pageSize);

        PageInfo<TUser> pageInfo = new PageInfo<>(mapper.selectAll());

        return pageInfo;
    }
}
