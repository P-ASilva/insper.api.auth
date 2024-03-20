package insper.api.auth;

import lombok.Builder;

@Builder
public record SolveOut(
    String id,
    String name,
    String role
) {
}
