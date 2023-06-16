package fnw_be.database.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "registration")
public class Registration {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NonNull
        private Integer id;

        @Column(nullable = false, length = 30)
        private String name;

        @Column(nullable = false, length = 30)
        private String lastName;

        @Column(nullable = false, length = 64)
        private String phoneNumber;

        @Column(nullable = false, length = 64)
        private String email;

        @Column(nullable = false, length = 64)
        private String password;

        public Registration(String username, String lastName, String email, String phoneNumber, String password) {
                this.name = username;
                this.lastName = lastName;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.password = password;
        }

        public Registration() {

        }
}
