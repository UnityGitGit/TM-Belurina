package persistence.db.test.runnerinusertourteam.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;
import persistence.db.test.runner.Runner;
import persistence.db.test.runnerinusertourteam.RunnerInUserTourTeam;
import persistence.db.test.usertourteam.UserTourTeam;

/**
 * The generated base for the {@link
 * persistence.db.test.runnerinusertourteam.RunnerInUserTourTeam}-interface
 * representing entities of the {@code RunnerInUserTourTeam}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRunnerInUserTourTeam {
    
    /**
     * This Field corresponds to the {@link RunnerInUserTourTeam} field that can
     * be obtained using the {@link RunnerInUserTourTeam#getUserTourTeamId()}
     * method.
     */
    IntForeignKeyField<RunnerInUserTourTeam, Integer, UserTourTeam> USER_TOUR_TEAM_ID = IntForeignKeyField.create(
        Identifier.USER_TOUR_TEAM_ID,
        RunnerInUserTourTeam::getUserTourTeamId,
        RunnerInUserTourTeam::setUserTourTeamId,
        UserTourTeam.USER_TOUR_TEAM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link RunnerInUserTourTeam} field that can
     * be obtained using the {@link RunnerInUserTourTeam#getRunnerId()} method.
     */
    IntForeignKeyField<RunnerInUserTourTeam, Integer, Runner> RUNNER_ID = IntForeignKeyField.create(
        Identifier.RUNNER_ID,
        RunnerInUserTourTeam::getRunnerId,
        RunnerInUserTourTeam::setRunnerId,
        Runner.RUNNER_ID,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the userTourTeamId of this RunnerInUserTourTeam. The
     * userTourTeamId field corresponds to the database column
     * test.test.RunnerInUserTourTeam.UserTourTeamId.
     * 
     * @return the userTourTeamId of this RunnerInUserTourTeam
     */
    int getUserTourTeamId();
    
    /**
     * Returns the runnerId of this RunnerInUserTourTeam. The runnerId field
     * corresponds to the database column
     * test.test.RunnerInUserTourTeam.RunnerId.
     * 
     * @return the runnerId of this RunnerInUserTourTeam
     */
    int getRunnerId();
    
    /**
     * Sets the userTourTeamId of this RunnerInUserTourTeam. The userTourTeamId
     * field corresponds to the database column
     * test.test.RunnerInUserTourTeam.UserTourTeamId.
     * 
     * @param userTourTeamId to set of this RunnerInUserTourTeam
     * @return               this RunnerInUserTourTeam instance
     */
    RunnerInUserTourTeam setUserTourTeamId(int userTourTeamId);
    
    /**
     * Sets the runnerId of this RunnerInUserTourTeam. The runnerId field
     * corresponds to the database column
     * test.test.RunnerInUserTourTeam.RunnerId.
     * 
     * @param runnerId to set of this RunnerInUserTourTeam
     * @return         this RunnerInUserTourTeam instance
     */
    RunnerInUserTourTeam setRunnerId(int runnerId);
    
    /**
     * Queries the specified manager for the referenced UserTourTeam. If no such
     * UserTourTeam exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    UserTourTeam findUserTourTeamId(Manager<UserTourTeam> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Runner. If no such
     * Runner exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Runner findRunnerId(Manager<Runner> foreignManager);
    
    enum Identifier implements ColumnIdentifier<RunnerInUserTourTeam> {
        
        USER_TOUR_TEAM_ID ("UserTourTeamId"),
        RUNNER_ID         ("RunnerId");
        
        private final String columnId;
        private final TableIdentifier<RunnerInUserTourTeam> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "test";
        }
        
        @Override
        public String getSchemaId() {
            return "test";
        }
        
        @Override
        public String getTableId() {
            return "RunnerInUserTourTeam";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<RunnerInUserTourTeam> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}