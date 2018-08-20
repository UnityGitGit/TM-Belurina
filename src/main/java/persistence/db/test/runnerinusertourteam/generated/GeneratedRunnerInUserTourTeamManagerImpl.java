package persistence.db.test.runnerinusertourteam.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import persistence.db.test.runnerinusertourteam.RunnerInUserTourTeam;
import persistence.db.test.runnerinusertourteam.RunnerInUserTourTeamManager;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * persistence.db.test.runnerinusertourteam.RunnerInUserTourTeam} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRunnerInUserTourTeamManagerImpl 
extends AbstractManager<RunnerInUserTourTeam> 
implements GeneratedRunnerInUserTourTeamManager {
    
    private final TableIdentifier<RunnerInUserTourTeam> tableIdentifier;
    
    protected GeneratedRunnerInUserTourTeamManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("test", "test", "RunnerInUserTourTeam");
    }
    
    @Override
    public TableIdentifier<RunnerInUserTourTeam> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<RunnerInUserTourTeam>> fields() {
        return RunnerInUserTourTeamManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<RunnerInUserTourTeam>> primaryKeyFields() {
        return Stream.of(
            RunnerInUserTourTeam.USER_TOUR_TEAM_ID,
            RunnerInUserTourTeam.RUNNER_ID
        );
    }
}