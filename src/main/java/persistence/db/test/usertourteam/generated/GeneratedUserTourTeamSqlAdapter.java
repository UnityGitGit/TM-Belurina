package persistence.db.test.usertourteam.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;
import persistence.db.test.usertourteam.UserTourTeam;
import persistence.db.test.usertourteam.UserTourTeamImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * persistence.db.test.usertourteam.UserTourTeam} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUserTourTeamSqlAdapter implements SqlAdapter<UserTourTeam> {
    
    private final TableIdentifier<UserTourTeam> tableIdentifier;
    
    protected GeneratedUserTourTeamSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("test", "test", "UserTourTeam");
    }
    
    protected UserTourTeam apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setUserTourTeamId( resultSet.getInt(1 + offset))
            .setUserId(         resultSet.getString(2 + offset))
            .setTourId(         resultSet.getInt(3 + offset))
            .setBudgetLeft(     resultSet.getDouble(4 + offset))
            ;
    }
    
    protected UserTourTeamImpl createEntity() {
        return new UserTourTeamImpl();
    }
    
    @Override
    public TableIdentifier<UserTourTeam> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, UserTourTeam> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, UserTourTeam> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}