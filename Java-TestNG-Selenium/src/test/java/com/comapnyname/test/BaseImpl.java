package com.comapnyname.test;


import com.comapnyname.provider.BaseProvider;
import com.comapnyname.provider.DataProvider1;

public class BaseImpl implements IBase {


    @Override
    public BaseProvider getProvider(){
        return new DataProvider1();
    }

}
