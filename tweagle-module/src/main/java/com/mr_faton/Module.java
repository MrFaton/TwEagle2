package com.mr_faton;

import com.mr_faton.component.Component;

import java.sql.SQLException;
import java.util.List;

public interface Module {
    boolean getStatus();
    void setStatus(boolean status);

    ModuleType getModuleType();

    List<List<String>> getStatistic() throws SQLException;

    void setComponentList(List<Component> components);

    long getNextTaskTime();
    void setNextTaskTime();

    void resetDailyParams() throws SQLException;
    void setMaxDailyUpdates() throws SQLException;

    void updateUsedComponentInStorage() throws SQLException;
    void updateUsedComponent() throws SQLException;
    void updateAllComponents() throws SQLException;

    void executeTask();
}
