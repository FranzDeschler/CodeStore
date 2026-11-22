package cloud.codestore.core.api.root;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.systemout.jsonapi.meta.MetaInformation;

class JsonApiMetaInformation implements MetaInformation {
    @JsonProperty("documentation")
    public final String documentation = "https://jsonapi.org/format/1.1/";
}
