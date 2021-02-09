/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CommonObject;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "test-endpoint", description = "the test-endpoint API")
public interface TestEndpointApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /test-endpoint : Generate object which can be customly imported
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Generate object which can be customly imported", nickname = "customIMport", notes = "", response = CommonObject.class, tags={ "test-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CommonObject.class) })
    @PostMapping(
        value = "/test-endpoint",
        produces = { "application/json" }
    )
    default ResponseEntity<CommonObject> customIMport() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"customObject\" : { \"field1\" : \"field1\", \"field2\" : true }, \"id\" : 0, \"stringField\" : \"stringField\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
