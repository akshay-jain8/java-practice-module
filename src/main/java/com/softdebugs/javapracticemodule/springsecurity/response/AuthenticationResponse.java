package com.softdebugs.javapracticemodule.springsecurity.response;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class AuthenticationResponse {

    private final String token;
}
