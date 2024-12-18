package com.cyh.projectmanagementsystemapplication.controller;

import com.cyh.projectmanagementsystemapplication.data.entity.Prj;
import com.cyh.projectmanagementsystemapplication.service.impl.PrjServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author cyh
 * @since 2024/12/18
 */
@RestController
@RequestMapping("/test")
public class PrjController {
    //    @Accessors
    @Autowired
    private PrjServiceImpl prjServiceImpl;

    @GetMapping("/selectAll")
    public List<Prj> selectAll() {
        return prjServiceImpl.selectAllPrj();
    }

    @GetMapping("/one/{id}")
    public Prj selectById(@PathVariable("id") Integer id) {
        return prjServiceImpl.selectPrjById(id);
    }
}
