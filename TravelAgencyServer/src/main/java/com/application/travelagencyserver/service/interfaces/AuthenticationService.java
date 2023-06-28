package com.application.travelagencyserver.service.interfaces;

import com.application.travelagencyserver.dto.auth.AuthenticationResponseDTO;
import com.application.travelagencyserver.dto.auth.LoginRequestDTO;
import com.application.travelagencyserver.dto.auth.RegisterRequestDTO;

public interface AuthenticationService {
    AuthenticationResponseDTO register(RegisterRequestDTO registerRequestDTO);

    AuthenticationResponseDTO login(LoginRequestDTO loginRequestDTO);
}
