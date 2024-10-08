/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.controller;

import com.hms.view.Home;
import com.hms.view.LabTestSetup;
import com.hms.view.LabTestSearch;
import com.hms.model.DefineTheEnum.PathologicalTestType;
import com.hms.model.DefineTheEnum.RadiologicalTestType;
import com.hms.view.ListTable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ASM
 */
public class RouteController {

    public void viewLabTestSetup() {
        new LabTestSetup().setVisible(true);
    }

    public void viewSearch() {
        new LabTestSearch().setVisible(true);
    }

    public void viewHome() {
        new Home().setVisible(true);
    }

    public void ListTable() {
        new ListTable().setVisible(true);
    }

    public List<String> getPathologicalTestTypes() {
        List<String> testTypes = new ArrayList<>();
        for (PathologicalTestType type : PathologicalTestType.values()) {
            testTypes.add(type.toString());
        }
        return testTypes;
    }

    public List<String> getRadiologicalTestType() {
        List<String> testTypes = new ArrayList<>();
        for (RadiologicalTestType type : RadiologicalTestType.values()) {
            testTypes.add(type.toString());
        }
        return testTypes;
    }

}
