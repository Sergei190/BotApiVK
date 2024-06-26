package com.example.sergei.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Data transfer object for VK API callbacks
 *
 * @author Sergei Kudryashov
 * @see <a href="https://vk.com/dev/callback_api">https://vk.com/dev/callback_api</a>
 * @since 1.0
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackDto {
    private CallbackType type;
    private Map<String, Object> object;
    @JsonProperty(value = "group_id")
    private Long groupId;
    private String secret;
    @JsonProperty(value = "event_id")
    private String eventId;

    public enum CallbackType {
        message_new, confirmation
    }

}