package com.mr_faton.component;

import java.sql.SQLException;

public interface Component {
    long getNextTaskTime();

    void setNextTaskTime();

    void executeTask() throws Exception;

    void updateStorage() throws SQLException;

    void updateComponent() throws SQLException;

    void setMaxUpdatesForAccount(String account) throws SQLException;

    void setMaxUpdatesPerEachAccount() throws SQLException;
}
