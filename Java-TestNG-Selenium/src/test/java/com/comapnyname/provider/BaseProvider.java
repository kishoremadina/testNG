package com.comapnyname.provider;

import com.comapnyname.provider.dataobject.InternalData;

/**
 *
 */
public interface BaseProvider {

    InternalData data = null;

    public void setData(String name, String value);


    public InternalData getData();


    public void initData();
}
