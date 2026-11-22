package cloud.codestore.core.api;

import com.fasterxml.jackson.annotation.JsonGetter;
import dev.systemout.jsonapi.meta.MetaInformation;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Represents a JSON:API meta information object which contains additional information about the interactions
 * with the corresponding resource.
 */
public class ResourceMetaInfo implements MetaInformation {
    private List<Operation> operations;

    public ResourceMetaInfo(@Nonnull List<Operation> operations) {
        this.operations = operations;
    }

    @JsonGetter("operations")
    public List<Operation> getOperations() {
        return operations;
    }
}
