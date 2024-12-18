package com.cyh.projectmanagementsystemapplication.controller;

import com.cyh.projectmanagementsystemapplication.data.entity.Prj;
import com.cyh.projectmanagementsystemapplication.service.impl.PrjServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author cyh
 * @since 2024/12/18
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class PrjController {
    @Autowired
    private PrjServiceImpl prjServiceImpl;

    //    查询所有数据
    @ResponseBody
    @GetMapping("/selectAll")
    public List<Prj> selectAll() {
        return prjServiceImpl.selectAllPrj();
    }

    //    查询单个数据
    @GetMapping("/one/{id}")
    public Prj selectById(@PathVariable("id") Integer id) {
        return prjServiceImpl.selectPrjById(id);
    }

    //    @DeleteMapping("/del/{id}")
    @GetMapping("/del/{id}")
    public void delete(@PathVariable("id") Integer id) {
        prjServiceImpl.deletePrjById(id);
    }
}
