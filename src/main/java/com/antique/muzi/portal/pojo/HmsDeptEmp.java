package com.antique.muzi.portal.pojo;

import com.antique.muzi.mbg.model.HmsDept;
import com.antique.muzi.mbg.model.HmsEmployee;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HmsDeptEmp {
    @ApiModelProperty("科室详情")
    private HmsDept hmsDept;

    @ApiModelProperty("科室职员信息")
    private List<HmsEmployee> hmsEmployeeList;

    public HmsDept getHmsDept() {
        return hmsDept;
    }

    public void setHmsDept(HmsDept hmsDept) {
        this.hmsDept = hmsDept;
    }

    public List<HmsEmployee> getHmsEmployeeList() {
        return hmsEmployeeList;
    }

    public void setHmsEmployeeList(List<HmsEmployee> hmsEmployeeList) {
        this.hmsEmployeeList = hmsEmployeeList;
    }

    @Override
    public String toString() {
        return "HmsDeptEmp{" +
                "hmsDept=" + hmsDept +
                ", hmsEmployeeList=" + hmsEmployeeList +
                '}';
    }
}
