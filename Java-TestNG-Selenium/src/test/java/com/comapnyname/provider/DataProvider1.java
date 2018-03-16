package com.comapnyname.provider;

import com.comapnyname.provider.dataobject.InternalData;

/**
 *
 * All the data providers would go here
 *
 */
public class DataProvider1  implements BaseProvider{




    @Override
    public void initData() {

        // Get the initial config data
        // Populate the Cache being used..
        // All the data need to get the test suite running which is
        // common for all the test suites/cases

        setData("suresh","katti");



    }

    @Override
    public void setData(String name, String value){
        InternalData data =  new InternalData();
        data.setName(name);
        data.setValue(value);
    }

    @Override
    public InternalData getData(){
        return data;
    }


}
