package persistence.db.test.runner.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;
import persistence.db.test.runner.Runner;
import persistence.db.test.runner.RunnerImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link persistence.db.test.runner.Runner}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRunnerSqlAdapter implements SqlAdapter<Runner> {
    
    private final TableIdentifier<Runner> tableIdentifier;
    
    protected GeneratedRunnerSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("test", "test", "Runner");
    }
    
    protected Runner apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setRunnerId(    resultSet.getInt(1 + offset))
            .setFirstName(   resultSet.getString(2 + offset))
            .setLastName(    resultSet.getString(3 + offset))
            .setNationality( resultSet.getString(4 + offset))
            .setSpecialty(   resultSet.getString(5 + offset))
            .setHeight(      getDouble(resultSet, 6 + offset))
            .setWeight(      getDouble(resultSet, 7 + offset))
            .setPrice(       getDouble(resultSet, 8 + offset))
            .setTeamId(      getInt(resultSet, 9 + offset))
            ;
    }
    
    protected RunnerImpl createEntity() {
        return new RunnerImpl();
    }
    
    @Override
    public TableIdentifier<Runner> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Runner> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Runner> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}