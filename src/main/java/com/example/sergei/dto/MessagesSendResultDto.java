package com.example.sergei.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Data transfer object for VK API {@code Messages.send} response
 *
 * @author Sergei Kudryashov
 * @see <a href="https://vk.com/dev/messages.send">https://vk.com/dev/messages.send</a>
 * @since 1.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessagesSendResultDto {
    @JsonProperty(value = "peer_id")
    Long peerId;
    @JsonProperty(value = "message_id")
    Long messageId;
    MessagesSendErrorResultDto error;

    @Getter
    public static class MessagesSendErrorResultDto {
        @JsonProperty(value = "error_code")
        Long errorCode;
        @JsonProperty(value = "error_msg")
        String errorMsg;
    }

}