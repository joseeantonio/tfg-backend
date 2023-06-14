package es.iesrafaelalberti.tfgpring.controllers;


import es.iesrafaelalberti.tfgpring.models.Cliente;
import es.iesrafaelalberti.tfgpring.repositories.ClienteRepository;
import es.iesrafaelalberti.tfgpring.services.TokenService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public class AuthController {

    @Autowired
    ClienteRepository clienteRepository;

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public TokenResponse token(Authentication authentication) {
        LOG.debug("Token requestaed for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted: {}", token);
        return new TokenResponse(token);
    }

    @GetMapping("/me")
    public Cliente showMe() {
        Cliente mycliente = clienteRepository.findByCorreo(SecurityContextHolder.getContext().getAuthentication().getName());
        return mycliente;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    class TokenResponse implements Serializable {
        private String token;
    }

}