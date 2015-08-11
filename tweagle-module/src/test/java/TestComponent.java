import com.mr_faton.component.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestComponent implements Component{
    private long nextTaskTime = 12_000L;
    private DataSource dataSource;

    public TestComponent(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public long getNextTaskTime() {
        return nextTaskTime;
    }

    @Override
    public void setNextTaskTime() {
        nextTaskTime = 15_000L;
    }

    @Override
    public void executeTask() throws Exception {
        System.out.println("executing task");
    }

    @Override
    public void updateStorage() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.toString();
        connection.close();
    }

    @Override
    public void updateComponent() throws SQLException {

    }

    @Override
    public void setMaxUpdatesForAccount(String account) throws SQLException {

    }

    @Override
    public void setMaxUpdatesPerEachAccount() throws SQLException {

    }
}
