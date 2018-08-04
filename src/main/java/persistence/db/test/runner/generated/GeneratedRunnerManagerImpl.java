package persistence.db.test.runner.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import persistence.db.test.runner.Runner;
import persistence.db.test.runner.RunnerManager;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * persistence.db.test.runner.Runner} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRunnerManagerImpl 
extends AbstractManager<Runner> 
implements GeneratedRunnerManager {
    
    private final TableIdentifier<Runner> tableIdentifier;
    
    protected GeneratedRunnerManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("test", "test", "Runner");
    }
    
    @Override
    public TableIdentifier<Runner> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Runner>> fields() {
        return RunnerManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Runner>> primaryKeyFields() {
        return Stream.of(
            Runner.RUNNER_ID
        );
    }
}