package gdsc.backend.jpa;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String datetime;

    @ManyToOne(fetch = FetchType.LAZY)
    private patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    private doctor doctor;
}
