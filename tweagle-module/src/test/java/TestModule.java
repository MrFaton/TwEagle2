import com.mr_faton.Module;
import com.mr_faton.ModuleType;
import com.mr_faton.component.Component;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestModule implements Module {
    private boolean status = true;
    private ModuleType moduleType = ModuleType.Test;
    private List<Component> componentList;
    private DataSource dataSource;

    public TestModule(DataSource dataSource) {
        this.dataSource = dataSource;
        componentList = new ArrayList<>();
        componentList.add(new TestComponent(dataSource));
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public ModuleType getModuleType() {
        return moduleType;
    }

    @Override
    public List<List<String>> getStatistic() throws SQLException {
        return null;
    }

    @Override
    public void setComponentList(List<Component> components) {

    }

    @Override
    public long getNextTaskTime() {
        return componentList.get(0).getNextTaskTime();
    }

    @Override
    public void setNextTaskTime() {
        componentList.get(0).setNextTaskTime();
    }

    @Override
    public void resetDailyParams() throws SQLException {
        /*test method updateUsedComponentInStorage()*/
    }

    @Override
    public void setMaxDailyUpdates() throws SQLException {
        /*test method updateUsedComponentInStorage()*/
    }

    @Override
    public void updateUsedComponentInStorage() throws SQLException {

    }

    @Override
    public void updateUsedComponent() throws SQLException {
        /*test method updateUsedComponentInStorage()*/
    }

    @Override
    public void updateAllComponents() throws SQLException {
        /*test method updateUsedComponentInStorage()*/
    }

    @Override
    public void executeTask() {
        System.out.println("executing task");
    }
}
