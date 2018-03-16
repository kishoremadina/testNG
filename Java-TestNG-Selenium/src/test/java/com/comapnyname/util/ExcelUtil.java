package com.comapnyname.util;


import com.comapnyname.provider.dataobject.ExcelDo;

import java.io.File;

public class ExcelUtil {

    static ExcelDo doExcel  = new ExcelDo();

    public static ExcelDo readExcel(File file){

        populateDO();

        return doExcel;

    }


    private static  void populateDO(){

    }



}
