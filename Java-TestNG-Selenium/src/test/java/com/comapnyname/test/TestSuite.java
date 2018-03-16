package com.comapnyname.test;


import com.comapnyname.provider.BaseProvider;
import com.comapnyname.provider.DataProvider1;
import com.comapnyname.provider.dataobject.ExcelDo;
import com.comapnyname.util.ExcelUtil;

import java.io.File;

public class TestSuite {

    BaseProvider provider;

    File excelFile ;
    ExcelDo excelDo;
    public void init(){



        provider = new DataProvider1();

        excelFile = new File("D//sures/abc.exl");
        excelDo =  ExcelUtil.readExcel(excelFile);

    }


    public void testMethod1(){

        provider.initData();

        System.out.println(provider.getData().getName());


        // Reading from Excel;




    }



}
