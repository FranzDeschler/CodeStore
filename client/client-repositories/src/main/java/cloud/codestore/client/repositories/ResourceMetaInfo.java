package cloud.codestore.client.repositories;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.systemout.jsonapi.meta.MetaDeserializer;
import dev.systemout.jsonapi.meta.MetaInformation;

import java.util.List;

/**
 * Represents a JSON:API meta information object which contains additional information about the interactions
 * with the corresponding resource.
 */
public class ResourceMetaInfo implements MetaInformation {
    private List<Operation> operations;

    @JsonCreator
    public ResourceMetaInfo(@JsonProperty("operations") Operation... operations) {
        this.operations = List.of(operations);
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public static class ResourceMetaInfoDeserializer implements MetaDeserializer {
        @Override
        public Class<? extends MetaInformation> getClass(String jsonPointer) {
            return "/meta".equals(jsonPointer) || "/data/meta".equals(jsonPointer) ? ResourceMetaInfo.class : null;
        }
    }
}
