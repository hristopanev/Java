package Demo.repositories;

import Demo.Employee.Employee;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesDataRepository  extends JdbcDataRepository<Employee> {


    public EmployeesDataRepository(Connection connection) throws SQLException {
        super(connection);
    }

    @Override
    protected Employee parseRow(ResultSet resultSet) throws SQLException {
        long id = resultSet.getLong("id");

        String firstName = resultSet.getString("first_name");

        String lastName = resultSet.getString("last_name");

        return new Employee(id, firstName, lastName);
    }

    @Override
    protected String getTableName() {
        return "employees";
    }

    @Override
    public void insert(Type object) {

    }

    @Override
    protected String getColumns() {
        return "first_name, last_Name";
    }

    @Override
    protected String getValues(Employee object) {
        return object.getFirstName() + ", " + object.getLastName();
    }


    @Override
    public void insert(Object object) {

    }
}
