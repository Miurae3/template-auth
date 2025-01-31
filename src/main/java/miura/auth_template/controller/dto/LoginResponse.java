package miura.auth_template.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}