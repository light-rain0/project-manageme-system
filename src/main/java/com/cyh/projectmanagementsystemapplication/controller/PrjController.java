package com.cyh.projectmanagementsystemapplication.controller;

import com.cyh.projectmanagementsystemapplication.data.entity.MyResult;
import com.cyh.projectmanagementsystemapplication.data.entity.Prj;
import com.cyh.projectmanagementsystemapplication.service.impl.PrjServiceImpl;
import lombok.experimental.Accessors;
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
    @Accessors
    private PrjServiceImpl prjServiceImpl;

    @GetMapping("/selectAll")
    public List<Prj> selectAll() {
        return prjServiceImpl.selectAllPrj();
    }

    @GetMapping("/one")
    public Prj selectById(Integer id) {
        return prjServiceImpl.selectPrjById(id);
    }
}
