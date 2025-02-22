package io.homeassistant.companion.android.data.integration

import com.fasterxml.jackson.annotation.JsonInclude

data class IntegrationRequest(
    val type: String,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val data: Any
)
